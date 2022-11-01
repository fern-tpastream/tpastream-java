package com.tpa.stream.api.client.claim;

import com.tpa.stream.api.client.BasicAuth;
import com.tpa.stream.api.client.claim.endpoints.Get;
import com.tpa.stream.api.client.claim.endpoints.GetAll;
import com.tpa.stream.api.client.claim.exceptions.GetAllException;
import com.tpa.stream.api.client.claim.exceptions.GetException;
import com.tpa.stream.api.client.claim.types.AllClaims;
import com.tpa.stream.api.client.claim.types.Claim;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.Optional;

public final class ClaimsServiceClient {
  private final ClaimsService service;

  private final Optional<BasicAuth> auth;

  public ClaimsServiceClient(String url) {
    this.service = ClaimsService.getClient(url);
    this.auth = Optional.empty();
  }

  public ClaimsServiceClient(String url, BasicAuth auth) {
    this.service = ClaimsService.getClient(url);
    this.auth = Optional.of(auth);
  }

  public AllClaims getAll(GetAll.Request request) throws GetAllException {
    BasicAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required for getAll")));
    return this.service.getAll(authValue, request.getPage(), request.getPerPage());
  }

  public Claim get(Get.Request request) throws GetException {
    BasicAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required for get")));
    return this.service.get(authValue, request.getClaimMedicalId());
  }
}
