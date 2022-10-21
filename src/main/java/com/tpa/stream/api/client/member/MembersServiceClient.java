package com.tpa.stream.api.client.member;

import com.tpa.stream.api.client.BasicAuth;
import com.tpa.stream.api.client.member.endpoints.GetAllMembers;
import com.tpa.stream.api.client.member.endpoints.GetMember;
import com.tpa.stream.api.client.member.exceptions.GetAllMembersException;
import com.tpa.stream.api.client.member.exceptions.GetMemberException;
import com.tpa.stream.api.client.member.types.AllMembers;
import com.tpa.stream.api.client.member.types.MemberResponse;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.Optional;

public final class MembersServiceClient {
  private final MembersService service;

  private final Optional<BasicAuth> auth;

  public MembersServiceClient(String url) {
    this.service = MembersService.getClient(url);
    this.auth = Optional.empty();
  }

  public MembersServiceClient(String url, BasicAuth auth) {
    this.service = MembersService.getClient(url);
    this.auth = Optional.of(auth);
  }

  public AllMembers getAllMembers(GetAllMembers.Request request) throws GetAllMembersException {
    BasicAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required for getAllMembers")));
    return this.service.getAllMembers(authValue, request.getPage(), request.getPerPage());
  }

  public MemberResponse getMember(GetMember.Request request) throws GetMemberException {
    BasicAuth authValue = request.getAuthOverride().orElseGet(() -> this.auth.orElseThrow(() -> new RuntimeException("Auth is required for getMember")));
    return this.service.getMember(authValue, request.getMemberId());
  }
}
