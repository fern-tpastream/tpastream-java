package com.tpa.stream.api.client.employer;

import com.tpa.stream.api.client.BasicAuth;
import com.tpa.stream.api.client.employer.endpoints.GetAllMembers;
import com.tpa.stream.api.client.employer.exceptions.GetAllMembersException;
import com.tpa.stream.api.client.employer.types.MemberPagination;
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

  public MemberPagination getAllMembers(GetAllMembers.Request request) throws
      GetAllMembersException {
    BasicAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required for getAllMembers")));
    return this.service.getAllMembers(authValue, request.getEmployerId(), request.getPage(), request.getPerPage());
  }
}
