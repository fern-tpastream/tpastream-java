package com.tpa.stream.api.client.member.endpoints;

import com.tpa.stream.api.client.BasicAuth;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public final class GetMember {
  private GetMember() {
  }

  public static final class Request {
    private final Optional<BasicAuth> authOverride;

    private final String memberId;

    private int _cachedHashCode;

    Request(Optional<BasicAuth> authOverride, String memberId) {
      this.authOverride = authOverride;
      this.memberId = memberId;
    }

    public Optional<BasicAuth> getAuthOverride() {
      return authOverride;
    }

    public String getMemberId() {
      return memberId;
    }

    @Override
    public boolean equals(Object other) {
      if (this == other) return true;
      return other instanceof Request && equalTo((Request) other);
    }

    private boolean equalTo(Request other) {
      return authOverride.equals(other.authOverride) && memberId.equals(other.memberId);
    }

    @Override
    public int hashCode() {
      if (_cachedHashCode == 0) {
        _cachedHashCode = Objects.hash(this.authOverride, this.memberId);
      }
      return _cachedHashCode;
    }

    @Override
    public String toString() {
      return "GetMember.Request{" + "authOverride: " + authOverride + ", memberId: " + memberId + "}";
    }

    public static MemberIdStage builder() {
      return new Builder();
    }

    public interface MemberIdStage {
      _FinalStage memberId(String memberId);

      Builder from(Request other);
    }

    public interface _FinalStage {
      Request build();

      _FinalStage authOverride(Optional<BasicAuth> authOverride);

      _FinalStage authOverride(BasicAuth authOverride);
    }

    static final class Builder implements MemberIdStage, _FinalStage {
      private String memberId;

      private Optional<BasicAuth> authOverride = Optional.empty();

      private Builder() {
      }

      @Override
      public Builder from(Request other) {
        authOverride(other.getAuthOverride());
        memberId(other.getMemberId());
        return this;
      }

      @Override
      public _FinalStage memberId(String memberId) {
        this.memberId = memberId;
        return this;
      }

      @Override
      public _FinalStage authOverride(BasicAuth authOverride) {
        this.authOverride = Optional.of(authOverride);
        return this;
      }

      @Override
      public _FinalStage authOverride(Optional<BasicAuth> authOverride) {
        this.authOverride = authOverride;
        return this;
      }

      @Override
      public Request build() {
        return new Request(authOverride, memberId);
      }
    }
  }
}
