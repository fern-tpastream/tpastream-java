package com.tpastream.api.client.key.endpoints;

import com.tpastream.api.client.Authorization;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public final class DeleteKey {
  private DeleteKey() {
  }

  public static final class Request {
    private final Optional<Authorization> authOverride;

    private final String name;

    private int _cachedHashCode;

    Request(Optional<Authorization> authOverride, String name) {
      this.authOverride = authOverride;
      this.name = name;
    }

    public Optional<Authorization> getAuthOverride() {
      return authOverride;
    }

    public String getName() {
      return name;
    }

    @Override
    public boolean equals(Object other) {
      if (this == other) return true;
      return other instanceof Request && equalTo((Request) other);
    }

    private boolean equalTo(Request other) {
      return authOverride.equals(other.authOverride) && name.equals(other.name);
    }

    @Override
    public int hashCode() {
      if (_cachedHashCode == 0) {
        _cachedHashCode = Objects.hash(this.authOverride, this.name);
      }
      return _cachedHashCode;
    }

    @Override
    public String toString() {
      return "DeleteKey.Request{" + "authOverride: " + authOverride + ", name: " + name + "}";
    }

    public static NameStage builder() {
      return new Builder();
    }

    public interface NameStage {
      _FinalStage name(String name);

      Builder from(Request other);
    }

    public interface _FinalStage {
      Request build();

      _FinalStage authOverride(Optional<Authorization> authOverride);

      _FinalStage authOverride(Authorization authOverride);
    }

    static final class Builder implements NameStage, _FinalStage {
      private String name;

      private Optional<Authorization> authOverride = Optional.empty();

      private Builder() {
      }

      @Override
      public Builder from(Request other) {
        authOverride(other.getAuthOverride());
        name(other.getName());
        return this;
      }

      @Override
      public _FinalStage name(String name) {
        this.name = name;
        return this;
      }

      @Override
      public _FinalStage authOverride(Authorization authOverride) {
        this.authOverride = Optional.of(authOverride);
        return this;
      }

      @Override
      public _FinalStage authOverride(Optional<Authorization> authOverride) {
        this.authOverride = authOverride;
        return this;
      }

      @Override
      public Request build() {
        return new Request(authOverride, name);
      }
    }
  }
}
