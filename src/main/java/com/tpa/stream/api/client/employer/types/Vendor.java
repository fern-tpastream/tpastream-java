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
    builder = Vendor.Builder.class
)
public final class Vendor {
  private final String code;

  private final Optional<Integer> id;

  private final String name;

  private int _cachedHashCode;

  Vendor(String code, Optional<Integer> id, String name) {
    this.code = code;
    this.id = id;
    this.name = name;
  }

  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  @JsonProperty("id")
  public Optional<Integer> getId() {
    return id;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Vendor && equalTo((Vendor) other);
  }

  private boolean equalTo(Vendor other) {
    return code.equals(other.code) && id.equals(other.id) && name.equals(other.name);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.code, this.id, this.name);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Vendor{" + "code: " + code + ", id: " + id + ", name: " + name + "}";
  }

  public static CodeStage builder() {
    return new Builder();
  }

  public interface CodeStage {
    NameStage code(String code);

    Builder from(Vendor other);
  }

  public interface NameStage {
    _FinalStage name(String name);
  }

  public interface _FinalStage {
    Vendor build();

    _FinalStage id(Optional<Integer> id);

    _FinalStage id(Integer id);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  static final class Builder implements CodeStage, NameStage, _FinalStage {
    private String code;

    private String name;

    private Optional<Integer> id = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(Vendor other) {
      code(other.getCode());
      id(other.getId());
      name(other.getName());
      return this;
    }

    @Override
    @JsonSetter("code")
    public NameStage code(String code) {
      this.code = code;
      return this;
    }

    @Override
    @JsonSetter("name")
    public _FinalStage name(String name) {
      this.name = name;
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
    public Vendor build() {
      return new Vendor(code, id, name);
    }
  }
}
