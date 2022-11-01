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
    builder = Dependent.Builder.class
)
public final class Dependent {
  private final Optional<String> address;

  private final Optional<String> alegeusKey;

  private final String createddate;

  private final Optional<String> dateOfBirth;

  private final Optional<String> email;

  private final Optional<String> firstName;

  private final Optional<String> gender;

  private final Optional<Integer> id;

  private final String lastName;

  private final String middleName;

  private final String modifieddate;

  private final Optional<String> ssn;

  private int _cachedHashCode;

  Dependent(Optional<String> address, Optional<String> alegeusKey, String createddate,
      Optional<String> dateOfBirth, Optional<String> email, Optional<String> firstName,
      Optional<String> gender, Optional<Integer> id, String lastName, String middleName,
      String modifieddate, Optional<String> ssn) {
    this.address = address;
    this.alegeusKey = alegeusKey;
    this.createddate = createddate;
    this.dateOfBirth = dateOfBirth;
    this.email = email;
    this.firstName = firstName;
    this.gender = gender;
    this.id = id;
    this.lastName = lastName;
    this.middleName = middleName;
    this.modifieddate = modifieddate;
    this.ssn = ssn;
  }

  @JsonProperty("address")
  public Optional<String> getAddress() {
    return address;
  }

  @JsonProperty("alegeus_key")
  public Optional<String> getAlegeusKey() {
    return alegeusKey;
  }

  @JsonProperty("createddate")
  public String getCreateddate() {
    return createddate;
  }

  @JsonProperty("date_of_birth")
  public Optional<String> getDateOfBirth() {
    return dateOfBirth;
  }

  @JsonProperty("email")
  public Optional<String> getEmail() {
    return email;
  }

  @JsonProperty("first_name")
  public Optional<String> getFirstName() {
    return firstName;
  }

  @JsonProperty("gender")
  public Optional<String> getGender() {
    return gender;
  }

  @JsonProperty("id")
  public Optional<Integer> getId() {
    return id;
  }

  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }

  @JsonProperty("middle_name")
  public String getMiddleName() {
    return middleName;
  }

  @JsonProperty("modifieddate")
  public String getModifieddate() {
    return modifieddate;
  }

  @JsonProperty("ssn")
  public Optional<String> getSsn() {
    return ssn;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Dependent && equalTo((Dependent) other);
  }

  private boolean equalTo(Dependent other) {
    return address.equals(other.address) && alegeusKey.equals(other.alegeusKey) && createddate.equals(other.createddate) && dateOfBirth.equals(other.dateOfBirth) && email.equals(other.email) && firstName.equals(other.firstName) && gender.equals(other.gender) && id.equals(other.id) && lastName.equals(other.lastName) && middleName.equals(other.middleName) && modifieddate.equals(other.modifieddate) && ssn.equals(other.ssn);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.address, this.alegeusKey, this.createddate, this.dateOfBirth, this.email, this.firstName, this.gender, this.id, this.lastName, this.middleName, this.modifieddate, this.ssn);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Dependent{" + "address: " + address + ", alegeusKey: " + alegeusKey + ", createddate: " + createddate + ", dateOfBirth: " + dateOfBirth + ", email: " + email + ", firstName: " + firstName + ", gender: " + gender + ", id: " + id + ", lastName: " + lastName + ", middleName: " + middleName + ", modifieddate: " + modifieddate + ", ssn: " + ssn + "}";
  }

  public static CreateddateStage builder() {
    return new Builder();
  }

  public interface CreateddateStage {
    LastNameStage createddate(String createddate);

    Builder from(Dependent other);
  }

  public interface LastNameStage {
    MiddleNameStage lastName(String lastName);
  }

  public interface MiddleNameStage {
    ModifieddateStage middleName(String middleName);
  }

  public interface ModifieddateStage {
    _FinalStage modifieddate(String modifieddate);
  }

  public interface _FinalStage {
    Dependent build();

    _FinalStage address(Optional<String> address);

    _FinalStage address(String address);

    _FinalStage alegeusKey(Optional<String> alegeusKey);

    _FinalStage alegeusKey(String alegeusKey);

    _FinalStage dateOfBirth(Optional<String> dateOfBirth);

    _FinalStage dateOfBirth(String dateOfBirth);

    _FinalStage email(Optional<String> email);

    _FinalStage email(String email);

    _FinalStage firstName(Optional<String> firstName);

    _FinalStage firstName(String firstName);

    _FinalStage gender(Optional<String> gender);

    _FinalStage gender(String gender);

    _FinalStage id(Optional<Integer> id);

    _FinalStage id(Integer id);

    _FinalStage ssn(Optional<String> ssn);

    _FinalStage ssn(String ssn);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  static final class Builder implements CreateddateStage, LastNameStage, MiddleNameStage, ModifieddateStage, _FinalStage {
    private String createddate;

    private String lastName;

    private String middleName;

    private String modifieddate;

    private Optional<String> ssn = Optional.empty();

    private Optional<Integer> id = Optional.empty();

    private Optional<String> gender = Optional.empty();

    private Optional<String> firstName = Optional.empty();

    private Optional<String> email = Optional.empty();

    private Optional<String> dateOfBirth = Optional.empty();

    private Optional<String> alegeusKey = Optional.empty();

    private Optional<String> address = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(Dependent other) {
      address(other.getAddress());
      alegeusKey(other.getAlegeusKey());
      createddate(other.getCreateddate());
      dateOfBirth(other.getDateOfBirth());
      email(other.getEmail());
      firstName(other.getFirstName());
      gender(other.getGender());
      id(other.getId());
      lastName(other.getLastName());
      middleName(other.getMiddleName());
      modifieddate(other.getModifieddate());
      ssn(other.getSsn());
      return this;
    }

    @Override
    @JsonSetter("createddate")
    public LastNameStage createddate(String createddate) {
      this.createddate = createddate;
      return this;
    }

    @Override
    @JsonSetter("last_name")
    public MiddleNameStage lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    @Override
    @JsonSetter("middle_name")
    public ModifieddateStage middleName(String middleName) {
      this.middleName = middleName;
      return this;
    }

    @Override
    @JsonSetter("modifieddate")
    public _FinalStage modifieddate(String modifieddate) {
      this.modifieddate = modifieddate;
      return this;
    }

    @Override
    public _FinalStage ssn(String ssn) {
      this.ssn = Optional.of(ssn);
      return this;
    }

    @Override
    @JsonSetter(
        value = "ssn",
        nulls = Nulls.SKIP
    )
    public _FinalStage ssn(Optional<String> ssn) {
      this.ssn = ssn;
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
    public _FinalStage gender(String gender) {
      this.gender = Optional.of(gender);
      return this;
    }

    @Override
    @JsonSetter(
        value = "gender",
        nulls = Nulls.SKIP
    )
    public _FinalStage gender(Optional<String> gender) {
      this.gender = gender;
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
    public _FinalStage dateOfBirth(String dateOfBirth) {
      this.dateOfBirth = Optional.of(dateOfBirth);
      return this;
    }

    @Override
    @JsonSetter(
        value = "date_of_birth",
        nulls = Nulls.SKIP
    )
    public _FinalStage dateOfBirth(Optional<String> dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
    }

    @Override
    public _FinalStage alegeusKey(String alegeusKey) {
      this.alegeusKey = Optional.of(alegeusKey);
      return this;
    }

    @Override
    @JsonSetter(
        value = "alegeus_key",
        nulls = Nulls.SKIP
    )
    public _FinalStage alegeusKey(Optional<String> alegeusKey) {
      this.alegeusKey = alegeusKey;
      return this;
    }

    @Override
    public _FinalStage address(String address) {
      this.address = Optional.of(address);
      return this;
    }

    @Override
    @JsonSetter(
        value = "address",
        nulls = Nulls.SKIP
    )
    public _FinalStage address(Optional<String> address) {
      this.address = address;
      return this;
    }

    @Override
    public Dependent build() {
      return new Dependent(address, alegeusKey, createddate, dateOfBirth, email, firstName, gender, id, lastName, middleName, modifieddate, ssn);
    }
  }
}
