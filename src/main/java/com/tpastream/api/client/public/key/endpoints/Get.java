package com.tpastream.api.client.public.key.endpoints;

import com.tpastream.api.client.Authorization;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public final class Get {
  private Get() {
  }

  public static final class Request {
    private final Optional<Authorization> authOverride;

    private int _cachedHashCode;

    Request(Optional<Authorization> authOverride) {
      this.authOverride = authOverride;
    }

    public Optional<Authorization> getAuthOverride() {
      return authOverride;
    }

    @Override
    public boolean equals(Object other) {
      if (this == other) return true;
      return other instanceof Request && equalTo((Request) other);
    }

    private boolean equalTo(Request other) {
      return authOverride.equals(other.authOverride);
    }

    @Override
    public int hashCode() {
      if (_cachedHashCode == 0) {
        _cachedHashCode = Objects.hash(this.authOverride);
      }
      return _cachedHashCode;
    }

    @Override
    public String toString() {
      return "Get.Request{" + "authOverride: " + authOverride + "}";
    }

    public static Builder builder() {
      return new Builder();
    }

    public static final class Builder {
      private Optional<Authorization> authOverride = Optional.empty();

      private Builder() {
      }

      public Builder from(Request other) {
        authOverride(other.getAuthOverride());
        return this;
      }

      public Builder authOverride(Optional<Authorization> authOverride) {
        this.authOverride = authOverride;
        return this;
      }

      public Builder authOverride(Authorization authOverride) {
        this.authOverride = Optional.of(authOverride);
        return this;
      }

      public Request build() {
        return new Request(authOverride);
      }
    }
  }
}
