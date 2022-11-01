package com.tpa.stream.api.client.employer.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@JsonDeserialize(
    builder = Account.Builder.class
)
public final class Account {
  private final int id;

  private final String name;

  private int _cachedHashCode;

  Account(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @JsonProperty("id")
  public int getId() {
    return id;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Account && equalTo((Account) other);
  }

  private boolean equalTo(Account other) {
    return id == other.id && name.equals(other.name);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.name);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Account{" + "id: " + id + ", name: " + name + "}";
  }

  public static IdStage builder() {
    return new Builder();
  }

  public interface IdStage {
    NameStage id(int id);

    Builder from(Account other);
  }

  public interface NameStage {
    _FinalStage name(String name);
  }

  public interface _FinalStage {
    Account build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  static final class Builder implements IdStage, NameStage, _FinalStage {
    private int id;

    private String name;

    private Builder() {
    }

    @Override
    public Builder from(Account other) {
      id(other.getId());
      name(other.getName());
      return this;
    }

    @Override
    @JsonSetter("id")
    public NameStage id(int id) {
      this.id = id;
      return this;
    }

    @Override
    @JsonSetter("name")
    public _FinalStage name(String name) {
      this.name = name;
      return this;
    }

    @Override
    public Account build() {
      return new Account(id, name);
    }
  }
}
