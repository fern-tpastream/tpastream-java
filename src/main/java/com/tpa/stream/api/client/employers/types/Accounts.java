package com.tpa.stream.api.client.employers.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@JsonDeserialize(
    builder = Accounts.Builder.class
)
public final class Accounts {
  private final int id;

  private final String name;

  private int _cachedHashCode;

  Accounts(int id, String name) {
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
    return other instanceof Accounts && equalTo((Accounts) other);
  }

  private boolean equalTo(Accounts other) {
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
    return "Accounts{" + "id: " + id + ", name: " + name + "}";
  }

  public static IdStage builder() {
    return new Builder();
  }

  public interface IdStage {
    NameStage id(int id);

    Builder from(Accounts other);
  }

  public interface NameStage {
    _FinalStage name(String name);
  }

  public interface _FinalStage {
    Accounts build();
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
    public Builder from(Accounts other) {
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
    public Accounts build() {
      return new Accounts(id, name);
    }
  }
}
