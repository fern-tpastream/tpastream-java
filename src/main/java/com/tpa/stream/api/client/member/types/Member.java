package com.tpa.stream.api.client.member.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.tpa.stream.api.client.employer.types.Employer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = Member.Builder.class
)
public final class Member {
  private final Optional<String> email;

  private final Employer employer;

  private final Optional<String> firstName;

  private final int id;

  private final Optional<String> lastName;

  private final Map<String, String> systemKey;

  private int _cachedHashCode;

  Member(Optional<String> email, Employer employer, Optional<String> firstName, int id,
      Optional<String> lastName, Map<String, String> systemKey) {
    this.email = email;
    this.employer = employer;
    this.firstName = firstName;
    this.id = id;
    this.lastName = lastName;
    this.systemKey = systemKey;
  }

  @JsonProperty("email")
  public Optional<String> getEmail() {
    return email;
  }

  @JsonProperty("employer")
  public Employer getEmployer() {
    return employer;
  }

  @JsonProperty("first_name")
  public Optional<String> getFirstName() {
    return firstName;
  }

  @JsonProperty("id")
  public int getId() {
    return id;
  }

  @JsonProperty("last_name")
  public Optional<String> getLastName() {
    return lastName;
  }

  @JsonProperty("system_key")
  public Map<String, String> getSystemKey() {
    return systemKey;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Member && equalTo((Member) other);
  }

  private boolean equalTo(Member other) {
    return email.equals(other.email) && employer.equals(other.employer) && firstName.equals(other.firstName) && id == other.id && lastName.equals(other.lastName) && systemKey.equals(other.systemKey);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.email, this.employer, this.firstName, this.id, this.lastName, this.systemKey);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Member{" + "email: " + email + ", employer: " + employer + ", firstName: " + firstName + ", id: " + id + ", lastName: " + lastName + ", systemKey: " + systemKey + "}";
  }

  public static EmployerStage builder() {
    return new Builder();
  }

  public interface EmployerStage {
    IdStage employer(Employer employer);

    Builder from(Member other);
  }

  public interface IdStage {
    _FinalStage id(int id);
  }

  public interface _FinalStage {
    Member build();

    _FinalStage email(Optional<String> email);

    _FinalStage email(String email);

    _FinalStage firstName(Optional<String> firstName);

    _FinalStage firstName(String firstName);

    _FinalStage lastName(Optional<String> lastName);

    _FinalStage lastName(String lastName);

    _FinalStage systemKey(Map<String, String> systemKey);

    _FinalStage putAllSystemKey(Map<String, String> systemKey);

    _FinalStage systemKey(String key, String value);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  static final class Builder implements EmployerStage, IdStage, _FinalStage {
    private Employer employer;

    private int id;

    private Map<String, String> systemKey = new LinkedHashMap<>();

    private Optional<String> lastName = Optional.empty();

    private Optional<String> firstName = Optional.empty();

    private Optional<String> email = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(Member other) {
      email(other.getEmail());
      employer(other.getEmployer());
      firstName(other.getFirstName());
      id(other.getId());
      lastName(other.getLastName());
      systemKey(other.getSystemKey());
      return this;
    }

    @Override
    @JsonSetter("employer")
    public IdStage employer(Employer employer) {
      this.employer = employer;
      return this;
    }

    @Override
    @JsonSetter("id")
    public _FinalStage id(int id) {
      this.id = id;
      return this;
    }

    @Override
    public _FinalStage systemKey(String key, String value) {
      this.systemKey.put(key, value);
      return this;
    }

    @Override
    public _FinalStage putAllSystemKey(Map<String, String> systemKey) {
      this.systemKey.putAll(systemKey);
      return this;
    }

    @Override
    @JsonSetter(
        value = "system_key",
        nulls = Nulls.SKIP
    )
    public _FinalStage systemKey(Map<String, String> systemKey) {
      this.systemKey.clear();
      this.systemKey.putAll(systemKey);
      return this;
    }

    @Override
    public _FinalStage lastName(String lastName) {
      this.lastName = Optional.of(lastName);
      return this;
    }

    @Override
    @JsonSetter(
        value = "last_name",
        nulls = Nulls.SKIP
    )
    public _FinalStage lastName(Optional<String> lastName) {
      this.lastName = lastName;
      return this;
    }

    @Override
    public _FinalStage firstName(String firstName) {
      this.firstName = Optional.of(firstName);
      return this;
    }

    @Override
    @JsonSetter(
        value = "first_name",
        nulls = Nulls.SKIP
    )
    public _FinalStage firstName(Optional<String> firstName) {
      this.firstName = firstName;
      return this;
    }

    @Override
    public _FinalStage email(String email) {
      this.email = Optional.of(email);
      return this;
    }

    @Override
    @JsonSetter(
        value = "email",
        nulls = Nulls.SKIP
    )
    public _FinalStage email(Optional<String> email) {
      this.email = email;
      return this;
    }

    @Override
    public Member build() {
      return new Member(email, employer, firstName, id, lastName, systemKey);
    }
  }
}
