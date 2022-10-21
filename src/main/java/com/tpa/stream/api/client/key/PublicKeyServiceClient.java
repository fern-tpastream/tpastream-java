package com.tpa.stream.api.client.key;

import com.tpa.stream.api.client.BasicAuth;
import com.tpa.stream.api.client.key.endpoints.CreateGpg;
import com.tpa.stream.api.client.key.endpoints.CreateRsa;
import com.tpa.stream.api.client.key.endpoints.DeleteGpg;
import com.tpa.stream.api.client.key.endpoints.DeleteRsa;
import com.tpa.stream.api.client.key.endpoints.GetGpg;
import com.tpa.stream.api.client.key.endpoints.GetRsa;
import com.tpa.stream.api.client.key.exceptions.CreateGpgException;
import com.tpa.stream.api.client.key.exceptions.CreateRsaException;
import com.tpa.stream.api.client.key.exceptions.DeleteGpgException;
import com.tpa.stream.api.client.key.exceptions.DeleteRsaException;
import com.tpa.stream.api.client.key.exceptions.GetGpgException;
import com.tpa.stream.api.client.key.exceptions.GetRsaException;
import com.tpa.stream.api.client.key.types.PublicKey;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.Optional;

public final class PublicKeyServiceClient {
  private final PublicKeyService service;

  private final Optional<BasicAuth> auth;

  public PublicKeyServiceClient(String url) {
    this.service = PublicKeyService.getClient(url);
    this.auth = Optional.empty();
  }

  public PublicKeyServiceClient(String url, BasicAuth auth) {
    this.service = PublicKeyService.getClient(url);
    this.auth = Optional.of(auth);
  }

  public PublicKey getGpg(GetGpg.Request request) throws GetGpgException {
    BasicAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required for getGpg")));
    return this.service.getGpg(authValue);
  }

  public PublicKey createGpg(CreateGpg.Request request) throws CreateGpgException {
    BasicAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required for createGpg")));
    return this.service.createGpg(authValue, request.getBody());
  }

  public void deleteGpg(DeleteGpg.Request request) throws DeleteGpgException {
    BasicAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required for deleteGpg")));
    this.service.deleteGpg(authValue, request.getName());
  }

  public PublicKey getRsa(GetRsa.Request request) throws GetRsaException {
    BasicAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required for getRsa")));
    return this.service.getRsa(authValue);
  }

  public PublicKey createRsa(CreateRsa.Request request) throws CreateRsaException {
    BasicAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required for createRsa")));
    return this.service.createRsa(authValue, request.getBody());
  }

  public void deleteRsa(DeleteRsa.Request request) throws DeleteRsaException {
    BasicAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required for deleteRsa")));
    this.service.deleteRsa(authValue, request.getName());
  }
}
