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
    builder = Payer1.Builder.class
)
public final class Payer1 {
  private final Optional<Integer> id;

  private final String name;

  private final String retriever;

  private final Optional<String> shortName;

  private int _cachedHashCode;

  Payer1(Optional<Integer> id, String name, String retriever, Optional<String> shortName) {
    this.id = id;
    this.name = name;
    this.retriever = retriever;
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

  @JsonProperty("retriever")
  public String getRetriever() {
    return retriever;
  }

  @JsonProperty("short_name")
  public Optional<String> getShortName() {
    return shortName;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Payer1 && equalTo((Payer1) other);
  }

  private boolean equalTo(Payer1 other) {
    return id.equals(other.id) && name.equals(other.name) && retriever.equals(other.retriever) && shortName.equals(other.shortName);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.name, this.retriever, this.shortName);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Payer1{" + "id: " + id + ", name: " + name + ", retriever: " + retriever + ", shortName: " + shortName + "}";
  }

  public static NameStage builder() {
    return new Builder();
  }

  public interface NameStage {
    RetrieverStage name(String name);

    Builder from(Payer1 other);
  }

  public interface RetrieverStage {
    _FinalStage retriever(String retriever);
  }

  public interface _FinalStage {
    Payer1 build();

    _FinalStage id(Optional<Integer> id);

    _FinalStage id(Integer id);

    _FinalStage shortName(Optional<String> shortName);

    _FinalStage shortName(String shortName);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  static final class Builder implements NameStage, RetrieverStage, _FinalStage {
    private String name;

    private String retriever;

    private Optional<String> shortName = Optional.empty();

    private Optional<Integer> id = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(Payer1 other) {
      id(other.getId());
      name(other.getName());
      retriever(other.getRetriever());
      shortName(other.getShortName());
      return this;
    }

    @Override
    @JsonSetter("name")
    public RetrieverStage name(String name) {
      this.name = name;
      return this;
    }

    @Override
    @JsonSetter("retriever")
    public _FinalStage retriever(String retriever) {
      this.retriever = retriever;
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
    public Payer1 build() {
      return new Payer1(id, name, retriever, shortName);
    }
  }
}
