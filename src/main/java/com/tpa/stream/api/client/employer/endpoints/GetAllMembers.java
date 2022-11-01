package com.tpa.stream.api.client.employer.endpoints;

import com.tpa.stream.api.client.BasicAuth;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public final class GetAllMembers {
  private GetAllMembers() {
  }

  public static final class Request {
    private final Optional<BasicAuth> authOverride;

    private final Integer employerId;

    private final Optional<Integer> page;

    private final Optional<Integer> perPage;

    private int _cachedHashCode;

    Request(Optional<BasicAuth> authOverride, Integer employerId, Optional<Integer> page,
        Optional<Integer> perPage) {
      this.authOverride = authOverride;
      this.employerId = employerId;
      this.page = page;
      this.perPage = perPage;
    }

    public Optional<BasicAuth> getAuthOverride() {
      return authOverride;
    }

    public Integer getEmployerId() {
      return employerId;
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
      return authOverride.equals(other.authOverride) && employerId.equals(other.employerId) && page.equals(other.page) && perPage.equals(other.perPage);
    }

    @Override
    public int hashCode() {
      if (_cachedHashCode == 0) {
        _cachedHashCode = Objects.hash(this.authOverride, this.employerId, this.page, this.perPage);
      }
      return _cachedHashCode;
    }

    @Override
    public String toString() {
      return "GetAllMembers.Request{" + "authOverride: " + authOverride + ", employerId: " + employerId + ", page: " + page + ", perPage: " + perPage + "}";
    }

    public static EmployerIdStage builder() {
      return new Builder();
    }

    public interface EmployerIdStage {
      _FinalStage employerId(Integer employerId);

      Builder from(Request other);
    }

    public interface _FinalStage {
      Request build();

      _FinalStage authOverride(Optional<BasicAuth> authOverride);

      _FinalStage authOverride(BasicAuth authOverride);

      _FinalStage page(Optional<Integer> page);

      _FinalStage page(Integer page);

      _FinalStage perPage(Optional<Integer> perPage);

      _FinalStage perPage(Integer perPage);
    }

    static final class Builder implements EmployerIdStage, _FinalStage {
      private Integer employerId;

      private Optional<Integer> perPage = Optional.empty();

      private Optional<Integer> page = Optional.empty();

      private Optional<BasicAuth> authOverride = Optional.empty();

      private Builder() {
      }

      @Override
      public Builder from(Request other) {
        authOverride(other.getAuthOverride());
        employerId(other.getEmployerId());
        page(other.getPage());
        perPage(other.getPerPage());
        return this;
      }

      @Override
      public _FinalStage employerId(Integer employerId) {
        this.employerId = employerId;
        return this;
      }

      @Override
      public _FinalStage perPage(Integer perPage) {
        this.perPage = Optional.of(perPage);
        return this;
      }

      @Override
      public _FinalStage perPage(Optional<Integer> perPage) {
        this.perPage = perPage;
        return this;
      }

      @Override
      public _FinalStage page(Integer page) {
        this.page = Optional.of(page);
        return this;
      }

      @Override
      public _FinalStage page(Optional<Integer> page) {
        this.page = page;
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
        return new Request(authOverride, employerId, page, perPage);
      }
    }
  }
}
