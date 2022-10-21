package com.tpa.stream.api.client.claim;

import com.tpa.stream.api.client.BasicAuth;
import com.tpa.stream.api.client.claim.endpoints.GetAllClaims;
import com.tpa.stream.api.client.claim.endpoints.GetClaim;
import com.tpa.stream.api.client.claim.exceptions.GetAllClaimsException;
import com.tpa.stream.api.client.claim.exceptions.GetClaimException;
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

  public AllClaims getAllClaims(GetAllClaims.Request request) throws GetAllClaimsException {
    BasicAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required for getAllClaims")));
    return this.service.getAllClaims(authValue, request.getPage(), request.getPerPage());
  }

  public Claim getClaim(GetClaim.Request request) throws GetClaimException {
    BasicAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required for getClaim")));
    return this.service.getClaim(authValue, request.getClaimMedicalId());
  }
}
