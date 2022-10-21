package com.tpastream.api.client.key.endpoints;

import com.tpastream.api.client.BasicAuth;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public final class Create {
  private Create() {
  }

  public static final class Request {
    private final Optional<BasicAuth> authOverride;

    private final String body;

    private int _cachedHashCode;

    Request(Optional<BasicAuth> authOverride, String body) {
      this.authOverride = authOverride;
      this.body = body;
    }

    public Optional<BasicAuth> getAuthOverride() {
      return authOverride;
    }

    public String getBody() {
      return body;
    }

    @Override
    public boolean equals(Object other) {
      if (this == other) return true;
      return other instanceof Request && equalTo((Request) other);
    }

    private boolean equalTo(Request other) {
      return authOverride.equals(other.authOverride) && body.equals(other.body);
    }

    @Override
    public int hashCode() {
      if (_cachedHashCode == 0) {
        _cachedHashCode = Objects.hash(this.authOverride, this.body);
      }
      return _cachedHashCode;
    }

    @Override
    public String toString() {
      return "Create.Request{" + "authOverride: " + authOverride + ", body: " + body + "}";
    }

    public static BodyStage builder() {
      return new Builder();
    }

    public interface BodyStage {
      _FinalStage body(String body);

      Builder from(Request other);
    }

    public interface _FinalStage {
      Request build();

      _FinalStage authOverride(Optional<BasicAuth> authOverride);

      _FinalStage authOverride(BasicAuth authOverride);
    }

    static final class Builder implements BodyStage, _FinalStage {
      private String body;

      private Optional<BasicAuth> authOverride = Optional.empty();

      private Builder() {
      }

      @Override
      public Builder from(Request other) {
        authOverride(other.getAuthOverride());
        body(other.getBody());
        return this;
      }

      @Override
      public _FinalStage body(String body) {
        this.body = body;
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
        return new Request(authOverride, body);
      }
    }
  }
}
