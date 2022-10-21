package com.tpastream.api.client.claims;

import com.tpastream.api.client.Authorization;
import com.tpastream.api.client.claims.endpoints.GetAllClaims;
import com.tpastream.api.client.claims.endpoints.GetClaim;
import com.tpastream.api.client.claims.exceptions.GetAllClaimsException;
import com.tpastream.api.client.claims.exceptions.GetClaimException;
import com.tpastream.api.client.claims.types.AllClaims;
import com.tpastream.api.client.claims.types.Claim;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.Optional;

public final class ClaimsServiceClient {
  private final ClaimsService service;

  private final Optional<Authorization> auth;

  public ClaimsServiceClient(String url) {
    this.service = ClaimsService.getClient(url);
    this.auth = Optional.empty();
  }

  public ClaimsServiceClient(String url, Authorization auth) {
    this.service = ClaimsService.getClient(url);
    this.auth = Optional.of(auth);
  }

  public AllClaims getAllClaims(GetAllClaims.Request request) throws GetAllClaimsException {
    Authorization authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required for getAllClaims")));
    return this.service.getAllClaims(authValue, request.getPage(), request.getPerPage());
  }

  public Claim getClaim(GetClaim.Request request) throws GetClaimException {
    Authorization authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required for getClaim")));
    return this.service.getClaim(authValue, request.getClaimMedicalId());
  }
}
