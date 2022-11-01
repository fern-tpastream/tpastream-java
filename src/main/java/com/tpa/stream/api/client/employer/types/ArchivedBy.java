package com.tpa.stream.api.client.employer.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = ArchivedBy.Builder.class
)
public final class ArchivedBy {
  private final Optional<String> email;

  private final Optional<Integer> id;

  private int _cachedHashCode;

  ArchivedBy(Optional<String> email, Optional<Integer> id) {
    this.email = email;
    this.id = id;
  }

  @JsonProperty("email")
  public Optional<String> getEmail() {
    return email;
  }

  @JsonProperty("id")
  public Optional<Integer> getId() {
    return id;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ArchivedBy && equalTo((ArchivedBy) other);
  }

  private boolean equalTo(ArchivedBy other) {
    return email.equals(other.email) && id.equals(other.id);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.email, this.id);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ArchivedBy{" + "email: " + email + ", id: " + id + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> email = Optional.empty();

    private Optional<Integer> id = Optional.empty();

    private Builder() {
    }

    public Builder from(ArchivedBy other) {
      email(other.getEmail());
      id(other.getId());
      return this;
    }

    @JsonSetter(
        value = "email",
        nulls = Nulls.SKIP
    )
    public Builder email(Optional<String> email) {
      this.email = email;
      return this;
    }

    public Builder email(String email) {
      this.email = Optional.of(email);
      return this;
    }

    @JsonSetter(
        value = "id",
        nulls = Nulls.SKIP
    )
    public Builder id(Optional<Integer> id) {
      this.id = id;
      return this;
    }

    public Builder id(Integer id) {
      this.id = Optional.of(id);
      return this;
    }

    public ArchivedBy build() {
      return new ArchivedBy(email, id);
    }
  }
}
