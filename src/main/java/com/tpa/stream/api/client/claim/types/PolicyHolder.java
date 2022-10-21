package com.tpa.stream.api.client.claim.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = PolicyHolder.Builder.class
)
public final class PolicyHolder {
  private final Optional<String> firstName;

  private final Optional<String> lastName;

  private final int id;

  private int _cachedHashCode;

  PolicyHolder(Optional<String> firstName, Optional<String> lastName, int id) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = id;
  }

  @JsonProperty("first_name")
  public Optional<String> getFirstName() {
    return firstName;
  }

  @JsonProperty("last_name")
  public Optional<String> getLastName() {
    return lastName;
  }

  @JsonProperty("id")
  public int getId() {
    return id;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PolicyHolder && equalTo((PolicyHolder) other);
  }

  private boolean equalTo(PolicyHolder other) {
    return firstName.equals(other.firstName) && lastName.equals(other.lastName) && id == other.id;
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.firstName, this.lastName, this.id);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PolicyHolder{" + "firstName: " + firstName + ", lastName: " + lastName + ", id: " + id + "}";
  }

  public static IdStage builder() {
    return new Builder();
  }

  public interface IdStage {
    _FinalStage id(int id);

    Builder from(PolicyHolder other);
  }

  public interface _FinalStage {
    PolicyHolder build();

    _FinalStage firstName(Optional<String> firstName);

    _FinalStage firstName(String firstName);

    _FinalStage lastName(Optional<String> lastName);

    _FinalStage lastName(String lastName);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  static final class Builder implements IdStage, _FinalStage {
    private int id;

    private Optional<String> lastName = Optional.empty();

    private Optional<String> firstName = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(PolicyHolder other) {
      firstName(other.getFirstName());
      lastName(other.getLastName());
      id(other.getId());
      return this;
    }

    @Override
    @JsonSetter("id")
    public _FinalStage id(int id) {
      this.id = id;
      return this;
    }

    @Override
    public _FinalStage lastName(String lastName) {
      this.lastName = Optional.of(lastName);
      return this;
    }

    @Override
    @JsonSetter(
        value = "last_name",
        nulls = Nulls.SKIP
    )
    public _FinalStage lastName(Optional<String> lastName) {
      this.lastName = lastName;
      return this;
    }

    @Override
    public _FinalStage firstName(String firstName) {
      this.firstName = Optional.of(firstName);
      return this;
    }

    @Override
    @JsonSetter(
        value = "first_name",
        nulls = Nulls.SKIP
    )
    public _FinalStage firstName(Optional<String> firstName) {
      this.firstName = firstName;
      return this;
    }

    @Override
    public PolicyHolder build() {
      return new PolicyHolder(firstName, lastName, id);
    }
  }
}
