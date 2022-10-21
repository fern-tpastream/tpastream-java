package com.tpa.stream.api.client.claims.endpoints;

import com.tpa.stream.api.client.BasicAuth;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public final class GetClaim {
  private GetClaim() {
  }

  public static final class Request {
    private final Optional<BasicAuth> authOverride;

    private final Integer claimMedicalId;

    private int _cachedHashCode;

    Request(Optional<BasicAuth> authOverride, Integer claimMedicalId) {
      this.authOverride = authOverride;
      this.claimMedicalId = claimMedicalId;
    }

    public Optional<BasicAuth> getAuthOverride() {
      return authOverride;
    }

    public Integer getClaimMedicalId() {
      return claimMedicalId;
    }

    @Override
    public boolean equals(Object other) {
      if (this == other) return true;
      return other instanceof Request && equalTo((Request) other);
    }

    private boolean equalTo(Request other) {
      return authOverride.equals(other.authOverride) && claimMedicalId.equals(other.claimMedicalId);
    }

    @Override
    public int hashCode() {
      if (_cachedHashCode == 0) {
        _cachedHashCode = Objects.hash(this.authOverride, this.claimMedicalId);
      }
      return _cachedHashCode;
    }

    @Override
    public String toString() {
      return "GetClaim.Request{" + "authOverride: " + authOverride + ", claimMedicalId: " + claimMedicalId + "}";
    }

    public static ClaimMedicalIdStage builder() {
      return new Builder();
    }

    public interface ClaimMedicalIdStage {
      _FinalStage claimMedicalId(Integer claimMedicalId);

      Builder from(Request other);
    }

    public interface _FinalStage {
      Request build();

      _FinalStage authOverride(Optional<BasicAuth> authOverride);

      _FinalStage authOverride(BasicAuth authOverride);
    }

    static final class Builder implements ClaimMedicalIdStage, _FinalStage {
      private Integer claimMedicalId;

      private Optional<BasicAuth> authOverride = Optional.empty();

      private Builder() {
      }

      @Override
      public Builder from(Request other) {
        authOverride(other.getAuthOverride());
        claimMedicalId(other.getClaimMedicalId());
        return this;
      }

      @Override
      public _FinalStage claimMedicalId(Integer claimMedicalId) {
        this.claimMedicalId = claimMedicalId;
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
        return new Request(authOverride, claimMedicalId);
      }
    }
  }
}
