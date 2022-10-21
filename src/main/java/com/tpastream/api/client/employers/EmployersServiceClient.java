package com.tpastream.api.client.employers;

import com.tpastream.api.client.Authorization;
import com.tpastream.api.client.employers.endpoints.GetAllEmployers;
import com.tpastream.api.client.employers.exceptions.GetAllEmployersException;
import com.tpastream.api.client.employers.types.AllAccounts;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.Optional;

public final class EmployersServiceClient {
  private final EmployersService service;

  private final Optional<Authorization> auth;

  public EmployersServiceClient(String url) {
    this.service = EmployersService.getClient(url);
    this.auth = Optional.empty();
  }

  public EmployersServiceClient(String url, Authorization auth) {
    this.service = EmployersService.getClient(url);
    this.auth = Optional.of(auth);
  }

  public AllAccounts getAllEmployers(GetAllEmployers.Request request) throws
      GetAllEmployersException {
    Authorization authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required for getAllEmployers")));
    return this.service.getAllEmployers(authValue, request.getEmployerId(), request.getPage(), request.getPerPage());
  }
}
