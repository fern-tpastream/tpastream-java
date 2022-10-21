package com.tpa.stream.api.client.member.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@JsonDeserialize(
    builder = MemberResponse.Builder.class
)
public final class MemberResponse {
  private final Member data;

  private int _cachedHashCode;

  MemberResponse(Member data) {
    this.data = data;
  }

  @JsonProperty("data")
  public Member getData() {
    return data;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof MemberResponse && equalTo((MemberResponse) other);
  }

  private boolean equalTo(MemberResponse other) {
    return data.equals(other.data);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.data);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "MemberResponse{" + "data: " + data + "}";
  }

  public static DataStage builder() {
    return new Builder();
  }

  public interface DataStage {
    _FinalStage data(Member data);

    Builder from(MemberResponse other);
  }

  public interface _FinalStage {
    MemberResponse build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  static final class Builder implements DataStage, _FinalStage {
    private Member data;

    private Builder() {
    }

    @Override
    public Builder from(MemberResponse other) {
      data(other.getData());
      return this;
    }

    @Override
    @JsonSetter("data")
    public _FinalStage data(Member data) {
      this.data = data;
      return this;
    }

    @Override
    public MemberResponse build() {
      return new MemberResponse(data);
    }
  }
}
