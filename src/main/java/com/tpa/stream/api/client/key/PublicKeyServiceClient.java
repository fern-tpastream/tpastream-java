package com.tpa.stream.api.client.key;

import com.tpa.stream.api.client.BasicAuth;
import com.tpa.stream.api.client.key.endpoints.Create;
import com.tpa.stream.api.client.key.endpoints.DeleteKey;
import com.tpa.stream.api.client.key.endpoints.Get;
import com.tpa.stream.api.client.key.exceptions.CreateException;
import com.tpa.stream.api.client.key.exceptions.DeleteKeyException;
import com.tpa.stream.api.client.key.exceptions.GetException;
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

  public PublicKey get(Get.Request request) throws GetException {
    BasicAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required for get")));
    return this.service.get(authValue);
  }

  public PublicKey create(Create.Request request) throws CreateException {
    BasicAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required for create")));
    return this.service.create(authValue, request.getBody());
  }

  public void deleteKey(DeleteKey.Request request) throws DeleteKeyException {
    BasicAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required for deleteKey")));
    this.service.deleteKey(authValue, request.getName());
  }
}
