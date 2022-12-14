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
    builder = Employer.Builder.class
)
public final class Employer {
  private final Optional<Integer> id;

  private final String name;

  private final Optional<Object> reimbursementPolicy;

  private int _cachedHashCode;

  Employer(Optional<Integer> id, String name, Optional<Object> reimbursementPolicy) {
    this.id = id;
    this.name = name;
    this.reimbursementPolicy = reimbursementPolicy;
  }

  @JsonProperty("id")
  public Optional<Integer> getId() {
    return id;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("reimbursement_policy")
  public Optional<Object> getReimbursementPolicy() {
    return reimbursementPolicy;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Employer && equalTo((Employer) other);
  }

  private boolean equalTo(Employer other) {
    return id.equals(other.id) && name.equals(other.name) && reimbursementPolicy.equals(other.reimbursementPolicy);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.name, this.reimbursementPolicy);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Employer{" + "id: " + id + ", name: " + name + ", reimbursementPolicy: " + reimbursementPolicy + "}";
  }

  public static NameStage builder() {
    return new Builder();
  }

  public interface NameStage {
    _FinalStage name(String name);

    Builder from(Employer other);
  }

  public interface _FinalStage {
    Employer build();

    _FinalStage id(Optional<Integer> id);

    _FinalStage id(Integer id);

    _FinalStage reimbursementPolicy(Optional<Object> reimbursementPolicy);

    _FinalStage reimbursementPolicy(Object reimbursementPolicy);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  static final class Builder implements NameStage, _FinalStage {
    private String name;

    private Optional<Object> reimbursementPolicy = Optional.empty();

    private Optional<Integer> id = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(Employer other) {
      id(other.getId());
      name(other.getName());
      reimbursementPolicy(other.getReimbursementPolicy());
      return this;
    }

    @Override
    @JsonSetter("name")
    public _FinalStage name(String name) {
      this.name = name;
      return this;
    }

    @Override
    public _FinalStage reimbursementPolicy(Object reimbursementPolicy) {
      this.reimbursementPolicy = Optional.of(reimbursementPolicy);
      return this;
    }

    @Override
    @JsonSetter(
        value = "reimbursement_policy",
        nulls = Nulls.SKIP
    )
    public _FinalStage reimbursementPolicy(Optional<Object> reimbursementPolicy) {
      this.reimbursementPolicy = reimbursementPolicy;
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
    public Employer build() {
      return new Employer(id, name, reimbursementPolicy);
    }
  }
}
