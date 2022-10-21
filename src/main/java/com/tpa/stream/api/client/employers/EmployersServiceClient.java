package com.tpa.stream.api.client.employers;

import com.tpa.stream.api.client.BasicAuth;
import com.tpa.stream.api.client.employers.endpoints.GetAllEmployers;
import com.tpa.stream.api.client.employers.exceptions.GetAllEmployersException;
import com.tpa.stream.api.client.employers.types.AllAccounts;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.Optional;

public final class EmployersServiceClient {
  private final EmployersService service;

  private final Optional<BasicAuth> auth;

  public EmployersServiceClient(String url) {
    this.service = EmployersService.getClient(url);
    this.auth = Optional.empty();
  }

  public EmployersServiceClient(String url, BasicAuth auth) {
    this.service = EmployersService.getClient(url);
    this.auth = Optional.of(auth);
  }

  public AllAccounts getAllEmployers(GetAllEmployers.Request request) throws
      GetAllEmployersException {
    BasicAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required for getAllEmployers")));
    return this.service.getAllEmployers(authValue, request.getEmployerId(), request.getPage(), request.getPerPage());
  }
}
