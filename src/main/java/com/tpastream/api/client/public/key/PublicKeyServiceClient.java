package com.tpastream.api.client.public.key;

import com.tpastream.api.client.Authorization;
import com.tpastream.api.client.public.key.endpoints.Create;
import com.tpastream.api.client.public.key.endpoints.DeleteKey;
import com.tpastream.api.client.public.key.endpoints.Get;
import com.tpastream.api.client.public.key.exceptions.CreateException;
import com.tpastream.api.client.public.key.exceptions.DeleteKeyException;
import com.tpastream.api.client.public.key.exceptions.GetException;
import com.tpastream.api.client.public.key.types.PublicKey;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.Optional;

public final class PublicKeyServiceClient {
  private final PublicKeyService service;

  private final Optional<Authorization> auth;

  public PublicKeyServiceClient(String url) {
    this.service = PublicKeyService.getClient(url);
    this.auth = Optional.empty();
  }

  public PublicKeyServiceClient(String url, Authorization auth) {
    this.service = PublicKeyService.getClient(url);
    this.auth = Optional.of(auth);
  }

  public PublicKey get(Get.Request request) throws GetException {
    Authorization authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required for get")));
    return this.service.get(authValue);
  }

  public PublicKey create(Create.Request request) throws CreateException {
    Authorization authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required for create")));
    return this.service.create(authValue, request.getBody());
  }

  public void deleteKey(DeleteKey.Request request) throws DeleteKeyException {
    Authorization authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required for deleteKey")));
    this.service.deleteKey(authValue, request.getName());
  }
}
