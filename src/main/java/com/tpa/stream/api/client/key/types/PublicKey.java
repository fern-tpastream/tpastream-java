package com.tpa.stream.api.client.key.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.UUID;

@JsonDeserialize(
    builder = PublicKey.Builder.class
)
public final class PublicKey {
  private final String content;

  private final String expires;

  private final String name;

  private final UUID uuid;

  private int _cachedHashCode;

  PublicKey(String content, String expires, String name, UUID uuid) {
    this.content = content;
    this.expires = expires;
    this.name = name;
    this.uuid = uuid;
  }

  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  @JsonProperty("expires")
  public String getExpires() {
    return expires;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("uuid")
  public UUID getUuid() {
    return uuid;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PublicKey && equalTo((PublicKey) other);
  }

  private boolean equalTo(PublicKey other) {
    return content.equals(other.content) && expires.equals(other.expires) && name.equals(other.name) && uuid.equals(other.uuid);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.content, this.expires, this.name, this.uuid);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PublicKey{" + "content: " + content + ", expires: " + expires + ", name: " + name + ", uuid: " + uuid + "}";
  }

  public static ContentStage builder() {
    return new Builder();
  }

  public interface ContentStage {
    ExpiresStage content(String content);

    Builder from(PublicKey other);
  }

  public interface ExpiresStage {
    NameStage expires(String expires);
  }

  public interface NameStage {
    UuidStage name(String name);
  }

  public interface UuidStage {
    _FinalStage uuid(UUID uuid);
  }

  public interface _FinalStage {
    PublicKey build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  static final class Builder implements ContentStage, ExpiresStage, NameStage, UuidStage, _FinalStage {
    private String content;

    private String expires;

    private String name;

    private UUID uuid;

    private Builder() {
    }

    @Override
    public Builder from(PublicKey other) {
      content(other.getContent());
      expires(other.getExpires());
      name(other.getName());
      uuid(other.getUuid());
      return this;
    }

    @Override
    @JsonSetter("content")
    public ExpiresStage content(String content) {
      this.content = content;
      return this;
    }

    @Override
    @JsonSetter("expires")
    public NameStage expires(String expires) {
      this.expires = expires;
      return this;
    }

    @Override
    @JsonSetter("name")
    public UuidStage name(String name) {
      this.name = name;
      return this;
    }

    @Override
    @JsonSetter("uuid")
    public _FinalStage uuid(UUID uuid) {
      this.uuid = uuid;
      return this;
    }

    @Override
    public PublicKey build() {
      return new PublicKey(content, expires, name, uuid);
    }
  }
}
