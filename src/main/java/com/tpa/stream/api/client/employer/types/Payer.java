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
    builder = Payer.Builder.class
)
public final class Payer {
  private final Optional<Integer> id;

  private final String name;

  private final Optional<String> shortName;

  private int _cachedHashCode;

  Payer(Optional<Integer> id, String name, Optional<String> shortName) {
    this.id = id;
    this.name = name;
    this.shortName = shortName;
  }

  @JsonProperty("id")
  public Optional<Integer> getId() {
    return id;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("short_name")
  public Optional<String> getShortName() {
    return shortName;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Payer && equalTo((Payer) other);
  }

  private boolean equalTo(Payer other) {
    return id.equals(other.id) && name.equals(other.name) && shortName.equals(other.shortName);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.name, this.shortName);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Payer{" + "id: " + id + ", name: " + name + ", shortName: " + shortName + "}";
  }

  public static NameStage builder() {
    return new Builder();
  }

  public interface NameStage {
    _FinalStage name(String name);

    Builder from(Payer other);
  }

  public interface _FinalStage {
    Payer build();

    _FinalStage id(Optional<Integer> id);

    _FinalStage id(Integer id);

    _FinalStage shortName(Optional<String> shortName);

    _FinalStage shortName(String shortName);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  static final class Builder implements NameStage, _FinalStage {
    private String name;

    private Optional<String> shortName = Optional.empty();

    private Optional<Integer> id = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(Payer other) {
      id(other.getId());
      name(other.getName());
      shortName(other.getShortName());
      return this;
    }

    @Override
    @JsonSetter("name")
    public _FinalStage name(String name) {
      this.name = name;
      return this;
    }

    @Override
    public _FinalStage shortName(String shortName) {
      this.shortName = Optional.of(shortName);
      return this;
    }

    @Override
    @JsonSetter(
        value = "short_name",
        nulls = Nulls.SKIP
    )
    public _FinalStage shortName(Optional<String> shortName) {
      this.shortName = shortName;
      return this;
    }

    @Override
    public _FinalStage id(Integer id) {
      this.id = Optional.of(id);
      return this;
    }

    @Override
    @JsonSetter(
        value = "id",
        nulls = Nulls.SKIP
    )
    public _FinalStage id(Optional<Integer> id) {
      this.id = id;
      return this;
    }

    @Override
    public Payer build() {
      return new Payer(id, name, shortName);
    }
  }
}
