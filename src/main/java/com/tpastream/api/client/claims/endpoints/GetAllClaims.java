package com.tpastream.api.client.claims.endpoints;

import com.tpastream.api.client.BasicAuth;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public final class GetAllClaims {
  private GetAllClaims() {
  }

  public static final class Request {
    private final Optional<BasicAuth> authOverride;

    private final Optional<Integer> page;

    private final Optional<Integer> perPage;

    private int _cachedHashCode;

    Request(Optional<BasicAuth> authOverride, Optional<Integer> page, Optional<Integer> perPage) {
      this.authOverride = authOverride;
      this.page = page;
      this.perPage = perPage;
    }

    public Optional<BasicAuth> getAuthOverride() {
      return authOverride;
    }

    public Optional<Integer> getPage() {
      return page;
    }

    public Optional<Integer> getPerPage() {
      return perPage;
    }

    @Override
    public boolean equals(Object other) {
      if (this == other) return true;
      return other instanceof Request && equalTo((Request) other);
    }

    private boolean equalTo(Request other) {
      return authOverride.equals(other.authOverride) && page.equals(other.page) && perPage.equals(other.perPage);
    }

    @Override
    public int hashCode() {
      if (_cachedHashCode == 0) {
        _cachedHashCode = Objects.hash(this.authOverride, this.page, this.perPage);
      }
      return _cachedHashCode;
    }

    @Override
    public String toString() {
      return "GetAllClaims.Request{" + "authOverride: " + authOverride + ", page: " + page + ", perPage: " + perPage + "}";
    }

    public static Builder builder() {
      return new Builder();
    }

    public static final class Builder {
      private Optional<BasicAuth> authOverride = Optional.empty();

      private Optional<Integer> page = Optional.empty();

      private Optional<Integer> perPage = Optional.empty();

      private Builder() {
      }

      public Builder from(Request other) {
        authOverride(other.getAuthOverride());
        page(other.getPage());
        perPage(other.getPerPage());
        return this;
      }

      public Builder authOverride(Optional<BasicAuth> authOverride) {
        this.authOverride = authOverride;
        return this;
      }

      public Builder authOverride(BasicAuth authOverride) {
        this.authOverride = Optional.of(authOverride);
        return this;
      }

      public Builder page(Optional<Integer> page) {
        this.page = page;
        return this;
      }

      public Builder page(Integer page) {
        this.page = Optional.of(page);
        return this;
      }

      public Builder perPage(Optional<Integer> perPage) {
        this.perPage = perPage;
        return this;
      }

      public Builder perPage(Integer perPage) {
        this.perPage = Optional.of(perPage);
        return this;
      }

      public Request build() {
        return new Request(authOverride, page, perPage);
      }
    }
  }
}
