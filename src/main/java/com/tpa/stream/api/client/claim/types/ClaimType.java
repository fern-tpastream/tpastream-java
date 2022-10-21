package com.tpa.stream.api.client.claim.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@JsonDeserialize(
    builder = ClaimType.Builder.class
)
public final class ClaimType {
  private final ClaimTypeName name;

  private int _cachedHashCode;

  ClaimType(ClaimTypeName name) {
    this.name = name;
  }

  @JsonProperty("name")
  public ClaimTypeName getName() {
    return name;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ClaimType && equalTo((ClaimType) other);
  }

  private boolean equalTo(ClaimType other) {
    return name.equals(other.name);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.name);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ClaimType{" + "name: " + name + "}";
  }

  public static NameStage builder() {
    return new Builder();
  }

  public interface NameStage {
    _FinalStage name(ClaimTypeName name);

    Builder from(ClaimType other);
  }

  public interface _FinalStage {
    ClaimType build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  static final class Builder implements NameStage, _FinalStage {
    private ClaimTypeName name;

    private Builder() {
    }

    @Override
    public Builder from(ClaimType other) {
      name(other.getName());
      return this;
    }

    @Override
    @JsonSetter("name")
    public _FinalStage name(ClaimTypeName name) {
      this.name = name;
      return this;
    }

    @Override
    public ClaimType build() {
      return new ClaimType(name);
    }
  }
}
