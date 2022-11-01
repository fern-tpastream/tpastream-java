package com.tpa.stream.api.client.employer.types;

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
    builder = HireTermDaterange.Builder.class
)
public final class HireTermDaterange {
  private final Optional<String> bounds;

  private final Optional<String> end;

  private final Optional<String> start;

  private int _cachedHashCode;

  HireTermDaterange(Optional<String> bounds, Optional<String> end, Optional<String> start) {
    this.bounds = bounds;
    this.end = end;
    this.start = start;
  }

  @JsonProperty("bounds")
  public Optional<String> getBounds() {
    return bounds;
  }

  @JsonProperty("end")
  public Optional<String> getEnd() {
    return end;
  }

  @JsonProperty("start")
  public Optional<String> getStart() {
    return start;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof HireTermDaterange && equalTo((HireTermDaterange) other);
  }

  private boolean equalTo(HireTermDaterange other) {
    return bounds.equals(other.bounds) && end.equals(other.end) && start.equals(other.start);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.bounds, this.end, this.start);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "HireTermDaterange{" + "bounds: " + bounds + ", end: " + end + ", start: " + start + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> bounds = Optional.empty();

    private Optional<String> end = Optional.empty();

    private Optional<String> start = Optional.empty();

    private Builder() {
    }

    public Builder from(HireTermDaterange other) {
      bounds(other.getBounds());
      end(other.getEnd());
      start(other.getStart());
      return this;
    }

    @JsonSetter(
        value = "bounds",
        nulls = Nulls.SKIP
    )
    public Builder bounds(Optional<String> bounds) {
      this.bounds = bounds;
      return this;
    }

    public Builder bounds(String bounds) {
      this.bounds = Optional.of(bounds);
      return this;
    }

    @JsonSetter(
        value = "end",
        nulls = Nulls.SKIP
    )
    public Builder end(Optional<String> end) {
      this.end = end;
      return this;
    }

    public Builder end(String end) {
      this.end = Optional.of(end);
      return this;
    }

    @JsonSetter(
        value = "start",
        nulls = Nulls.SKIP
    )
    public Builder start(Optional<String> start) {
      this.start = start;
      return this;
    }

    public Builder start(String start) {
      this.start = Optional.of(start);
      return this;
    }

    public HireTermDaterange build() {
      return new HireTermDaterange(bounds, end, start);
    }
  }
}
