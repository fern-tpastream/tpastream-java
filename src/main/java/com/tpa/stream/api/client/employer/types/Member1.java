package com.tpa.stream.api.client.employer.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = Member1.Builder.class
)
public final class Member1 {
  private final Optional<List<Account>> accounts;

  private final Optional<String> address;

  private final Optional<String> alegeusKey;

  private final Optional<Boolean> archived;

  private final Optional<String> archivedDate;

  private final Optional<ArchivedBy> archivedby;

  private final Optional<Boolean> canMakeClaimRequests;

  private final Optional<Boolean> canUsePortal;

  private final Optional<String> createddate;

  private final Optional<String> dateOfBirth;

  private final Optional<List<Dependent>> dependents;

  private final Optional<String> email;

  private final Optional<Employer> employer;

  private final Optional<String> firstName;

  private final Optional<String> firstNameDerived;

  private final Optional<String> fullNameDerived;

  private final Optional<String> gender;

  private final Optional<HireTermDaterange> hireTermDaterange;

  private final Optional<Integer> id;

  private final Optional<String> lastName;

  private final Optional<String> lastNameDerived;

  private final Optional<String> modifieddate;

  private final Optional<String> phoneHome;

  private final Optional<String> phoneMobile;

  private final Optional<String> ssn;

  private final Optional<Tenant> tenant;

  private final Optional<Integer> unreadCount;

  private final List<VendorMember> vendorMembers;

  private int _cachedHashCode;

  Member1(Optional<List<Account>> accounts, Optional<String> address, Optional<String> alegeusKey,
      Optional<Boolean> archived, Optional<String> archivedDate, Optional<ArchivedBy> archivedby,
      Optional<Boolean> canMakeClaimRequests, Optional<Boolean> canUsePortal,
      Optional<String> createddate, Optional<String> dateOfBirth,
      Optional<List<Dependent>> dependents, Optional<String> email, Optional<Employer> employer,
      Optional<String> firstName, Optional<String> firstNameDerived,
      Optional<String> fullNameDerived, Optional<String> gender,
      Optional<HireTermDaterange> hireTermDaterange, Optional<Integer> id,
      Optional<String> lastName, Optional<String> lastNameDerived, Optional<String> modifieddate,
      Optional<String> phoneHome, Optional<String> phoneMobile, Optional<String> ssn,
      Optional<Tenant> tenant, Optional<Integer> unreadCount, List<VendorMember> vendorMembers) {
    this.accounts = accounts;
    this.address = address;
    this.alegeusKey = alegeusKey;
    this.archived = archived;
    this.archivedDate = archivedDate;
    this.archivedby = archivedby;
    this.canMakeClaimRequests = canMakeClaimRequests;
    this.canUsePortal = canUsePortal;
    this.createddate = createddate;
    this.dateOfBirth = dateOfBirth;
    this.dependents = dependents;
    this.email = email;
    this.employer = employer;
    this.firstName = firstName;
    this.firstNameDerived = firstNameDerived;
    this.fullNameDerived = fullNameDerived;
    this.gender = gender;
    this.hireTermDaterange = hireTermDaterange;
    this.id = id;
    this.lastName = lastName;
    this.lastNameDerived = lastNameDerived;
    this.modifieddate = modifieddate;
    this.phoneHome = phoneHome;
    this.phoneMobile = phoneMobile;
    this.ssn = ssn;
    this.tenant = tenant;
    this.unreadCount = unreadCount;
    this.vendorMembers = vendorMembers;
  }

  @JsonProperty("accounts")
  public Optional<List<Account>> getAccounts() {
    return accounts;
  }

  @JsonProperty("address")
  public Optional<String> getAddress() {
    return address;
  }

  @JsonProperty("alegeus_key")
  public Optional<String> getAlegeusKey() {
    return alegeusKey;
  }

  @JsonProperty("archived")
  public Optional<Boolean> getArchived() {
    return archived;
  }

  @JsonProperty("archived_date")
  public Optional<String> getArchivedDate() {
    return archivedDate;
  }

  @JsonProperty("archivedby")
  public Optional<ArchivedBy> getArchivedby() {
    return archivedby;
  }

  @JsonProperty("can_make_claim_requests")
  public Optional<Boolean> getCanMakeClaimRequests() {
    return canMakeClaimRequests;
  }

  @JsonProperty("can_use_portal")
  public Optional<Boolean> getCanUsePortal() {
    return canUsePortal;
  }

  @JsonProperty("createddate")
  public Optional<String> getCreateddate() {
    return createddate;
  }

  @JsonProperty("date_of_birth")
  public Optional<String> getDateOfBirth() {
    return dateOfBirth;
  }

  @JsonProperty("dependents")
  public Optional<List<Dependent>> getDependents() {
    return dependents;
  }

  @JsonProperty("email")
  public Optional<String> getEmail() {
    return email;
  }

  @JsonProperty("employer")
  public Optional<Employer> getEmployer() {
    return employer;
  }

  @JsonProperty("first_name")
  public Optional<String> getFirstName() {
    return firstName;
  }

  @JsonProperty("first_name_derived")
  public Optional<String> getFirstNameDerived() {
    return firstNameDerived;
  }

  @JsonProperty("full_name_derived")
  public Optional<String> getFullNameDerived() {
    return fullNameDerived;
  }

  @JsonProperty("gender")
  public Optional<String> getGender() {
    return gender;
  }

  @JsonProperty("hire_term_daterange")
  public Optional<HireTermDaterange> getHireTermDaterange() {
    return hireTermDaterange;
  }

  @JsonProperty("id")
  public Optional<Integer> getId() {
    return id;
  }

  @JsonProperty("last_name")
  public Optional<String> getLastName() {
    return lastName;
  }

  @JsonProperty("last_name_derived")
  public Optional<String> getLastNameDerived() {
    return lastNameDerived;
  }

  @JsonProperty("modifieddate")
  public Optional<String> getModifieddate() {
    return modifieddate;
  }

  @JsonProperty("phone_home")
  public Optional<String> getPhoneHome() {
    return phoneHome;
  }

  @JsonProperty("phone_mobile")
  public Optional<String> getPhoneMobile() {
    return phoneMobile;
  }

  @JsonProperty("ssn")
  public Optional<String> getSsn() {
    return ssn;
  }

  @JsonProperty("tenant")
  public Optional<Tenant> getTenant() {
    return tenant;
  }

  @JsonProperty("unread_count")
  public Optional<Integer> getUnreadCount() {
    return unreadCount;
  }

  @JsonProperty("vendor_members")
  public List<VendorMember> getVendorMembers() {
    return vendorMembers;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Member1 && equalTo((Member1) other);
  }

  private boolean equalTo(Member1 other) {
    return accounts.equals(other.accounts) && address.equals(other.address) && alegeusKey.equals(other.alegeusKey) && archived.equals(other.archived) && archivedDate.equals(other.archivedDate) && archivedby.equals(other.archivedby) && canMakeClaimRequests.equals(other.canMakeClaimRequests) && canUsePortal.equals(other.canUsePortal) && createddate.equals(other.createddate) && dateOfBirth.equals(other.dateOfBirth) && dependents.equals(other.dependents) && email.equals(other.email) && employer.equals(other.employer) && firstName.equals(other.firstName) && firstNameDerived.equals(other.firstNameDerived) && fullNameDerived.equals(other.fullNameDerived) && gender.equals(other.gender) && hireTermDaterange.equals(other.hireTermDaterange) && id.equals(other.id) && lastName.equals(other.lastName) && lastNameDerived.equals(other.lastNameDerived) && modifieddate.equals(other.modifieddate) && phoneHome.equals(other.phoneHome) && phoneMobile.equals(other.phoneMobile) && ssn.equals(other.ssn) && tenant.equals(other.tenant) && unreadCount.equals(other.unreadCount) && vendorMembers.equals(other.vendorMembers);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.accounts, this.address, this.alegeusKey, this.archived, this.archivedDate, this.archivedby, this.canMakeClaimRequests, this.canUsePortal, this.createddate, this.dateOfBirth, this.dependents, this.email, this.employer, this.firstName, this.firstNameDerived, this.fullNameDerived, this.gender, this.hireTermDaterange, this.id, this.lastName, this.lastNameDerived, this.modifieddate, this.phoneHome, this.phoneMobile, this.ssn, this.tenant, this.unreadCount, this.vendorMembers);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Member1{" + "accounts: " + accounts + ", address: " + address + ", alegeusKey: " + alegeusKey + ", archived: " + archived + ", archivedDate: " + archivedDate + ", archivedby: " + archivedby + ", canMakeClaimRequests: " + canMakeClaimRequests + ", canUsePortal: " + canUsePortal + ", createddate: " + createddate + ", dateOfBirth: " + dateOfBirth + ", dependents: " + dependents + ", email: " + email + ", employer: " + employer + ", firstName: " + firstName + ", firstNameDerived: " + firstNameDerived + ", fullNameDerived: " + fullNameDerived + ", gender: " + gender + ", hireTermDaterange: " + hireTermDaterange + ", id: " + id + ", lastName: " + lastName + ", lastNameDerived: " + lastNameDerived + ", modifieddate: " + modifieddate + ", phoneHome: " + phoneHome + ", phoneMobile: " + phoneMobile + ", ssn: " + ssn + ", tenant: " + tenant + ", unreadCount: " + unreadCount + ", vendorMembers: " + vendorMembers + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<Account>> accounts = Optional.empty();

    private Optional<String> address = Optional.empty();

    private Optional<String> alegeusKey = Optional.empty();

    private Optional<Boolean> archived = Optional.empty();

    private Optional<String> archivedDate = Optional.empty();

    private Optional<ArchivedBy> archivedby = Optional.empty();

    private Optional<Boolean> canMakeClaimRequests = Optional.empty();

    private Optional<Boolean> canUsePortal = Optional.empty();

    private Optional<String> createddate = Optional.empty();

    private Optional<String> dateOfBirth = Optional.empty();

    private Optional<List<Dependent>> dependents = Optional.empty();

    private Optional<String> email = Optional.empty();

    private Optional<Employer> employer = Optional.empty();

    private Optional<String> firstName = Optional.empty();

    private Optional<String> firstNameDerived = Optional.empty();

    private Optional<String> fullNameDerived = Optional.empty();

    private Optional<String> gender = Optional.empty();

    private Optional<HireTermDaterange> hireTermDaterange = Optional.empty();

    private Optional<Integer> id = Optional.empty();

    private Optional<String> lastName = Optional.empty();

    private Optional<String> lastNameDerived = Optional.empty();

    private Optional<String> modifieddate = Optional.empty();

    private Optional<String> phoneHome = Optional.empty();

    private Optional<String> phoneMobile = Optional.empty();

    private Optional<String> ssn = Optional.empty();

    private Optional<Tenant> tenant = Optional.empty();

    private Optional<Integer> unreadCount = Optional.empty();

    private List<VendorMember> vendorMembers = new ArrayList<>();

    private Builder() {
    }

    public Builder from(Member1 other) {
      accounts(other.getAccounts());
      address(other.getAddress());
      alegeusKey(other.getAlegeusKey());
      archived(other.getArchived());
      archivedDate(other.getArchivedDate());
      archivedby(other.getArchivedby());
      canMakeClaimRequests(other.getCanMakeClaimRequests());
      canUsePortal(other.getCanUsePortal());
      createddate(other.getCreateddate());
      dateOfBirth(other.getDateOfBirth());
      dependents(other.getDependents());
      email(other.getEmail());
      employer(other.getEmployer());
      firstName(other.getFirstName());
      firstNameDerived(other.getFirstNameDerived());
      fullNameDerived(other.getFullNameDerived());
      gender(other.getGender());
      hireTermDaterange(other.getHireTermDaterange());
      id(other.getId());
      lastName(other.getLastName());
      lastNameDerived(other.getLastNameDerived());
      modifieddate(other.getModifieddate());
      phoneHome(other.getPhoneHome());
      phoneMobile(other.getPhoneMobile());
      ssn(other.getSsn());
      tenant(other.getTenant());
      unreadCount(other.getUnreadCount());
      vendorMembers(other.getVendorMembers());
      return this;
    }

    @JsonSetter(
        value = "accounts",
        nulls = Nulls.SKIP
    )
    public Builder accounts(Optional<List<Account>> accounts) {
      this.accounts = accounts;
      return this;
    }

    public Builder accounts(List<Account> accounts) {
      this.accounts = Optional.of(accounts);
      return this;
    }

    @JsonSetter(
        value = "address",
        nulls = Nulls.SKIP
    )
    public Builder address(Optional<String> address) {
      this.address = address;
      return this;
    }

    public Builder address(String address) {
      this.address = Optional.of(address);
      return this;
    }

    @JsonSetter(
        value = "alegeus_key",
        nulls = Nulls.SKIP
    )
    public Builder alegeusKey(Optional<String> alegeusKey) {
      this.alegeusKey = alegeusKey;
      return this;
    }

    public Builder alegeusKey(String alegeusKey) {
      this.alegeusKey = Optional.of(alegeusKey);
      return this;
    }

    @JsonSetter(
        value = "archived",
        nulls = Nulls.SKIP
    )
    public Builder archived(Optional<Boolean> archived) {
      this.archived = archived;
      return this;
    }

    public Builder archived(Boolean archived) {
      this.archived = Optional.of(archived);
      return this;
    }

    @JsonSetter(
        value = "archived_date",
        nulls = Nulls.SKIP
    )
    public Builder archivedDate(Optional<String> archivedDate) {
      this.archivedDate = archivedDate;
      return this;
    }

    public Builder archivedDate(String archivedDate) {
      this.archivedDate = Optional.of(archivedDate);
      return this;
    }

    @JsonSetter(
        value = "archivedby",
        nulls = Nulls.SKIP
    )
    public Builder archivedby(Optional<ArchivedBy> archivedby) {
      this.archivedby = archivedby;
      return this;
    }

    public Builder archivedby(ArchivedBy archivedby) {
      this.archivedby = Optional.of(archivedby);
      return this;
    }

    @JsonSetter(
        value = "can_make_claim_requests",
        nulls = Nulls.SKIP
    )
    public Builder canMakeClaimRequests(Optional<Boolean> canMakeClaimRequests) {
      this.canMakeClaimRequests = canMakeClaimRequests;
      return this;
    }

    public Builder canMakeClaimRequests(Boolean canMakeClaimRequests) {
      this.canMakeClaimRequests = Optional.of(canMakeClaimRequests);
      return this;
    }

    @JsonSetter(
        value = "can_use_portal",
        nulls = Nulls.SKIP
    )
    public Builder canUsePortal(Optional<Boolean> canUsePortal) {
      this.canUsePortal = canUsePortal;
      return this;
    }

    public Builder canUsePortal(Boolean canUsePortal) {
      this.canUsePortal = Optional.of(canUsePortal);
      return this;
    }

    @JsonSetter(
        value = "createddate",
        nulls = Nulls.SKIP
    )
    public Builder createddate(Optional<String> createddate) {
      this.createddate = createddate;
      return this;
    }

    public Builder createddate(String createddate) {
      this.createddate = Optional.of(createddate);
      return this;
    }

    @JsonSetter(
        value = "date_of_birth",
        nulls = Nulls.SKIP
    )
    public Builder dateOfBirth(Optional<String> dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
    }

    public Builder dateOfBirth(String dateOfBirth) {
      this.dateOfBirth = Optional.of(dateOfBirth);
      return this;
    }

    @JsonSetter(
        value = "dependents",
        nulls = Nulls.SKIP
    )
    public Builder dependents(Optional<List<Dependent>> dependents) {
      this.dependents = dependents;
      return this;
    }

    public Builder dependents(List<Dependent> dependents) {
      this.dependents = Optional.of(dependents);
      return this;
    }

    @JsonSetter(
        value = "email",
        nulls = Nulls.SKIP
    )
    public Builder email(Optional<String> email) {
      this.email = email;
      return this;
    }

    public Builder email(String email) {
      this.email = Optional.of(email);
      return this;
    }

    @JsonSetter(
        value = "employer",
        nulls = Nulls.SKIP
    )
    public Builder employer(Optional<Employer> employer) {
      this.employer = employer;
      return this;
    }

    public Builder employer(Employer employer) {
      this.employer = Optional.of(employer);
      return this;
    }

    @JsonSetter(
        value = "first_name",
        nulls = Nulls.SKIP
    )
    public Builder firstName(Optional<String> firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder firstName(String firstName) {
      this.firstName = Optional.of(firstName);
      return this;
    }

    @JsonSetter(
        value = "first_name_derived",
        nulls = Nulls.SKIP
    )
    public Builder firstNameDerived(Optional<String> firstNameDerived) {
      this.firstNameDerived = firstNameDerived;
      return this;
    }

    public Builder firstNameDerived(String firstNameDerived) {
      this.firstNameDerived = Optional.of(firstNameDerived);
      return this;
    }

    @JsonSetter(
        value = "full_name_derived",
        nulls = Nulls.SKIP
    )
    public Builder fullNameDerived(Optional<String> fullNameDerived) {
      this.fullNameDerived = fullNameDerived;
      return this;
    }

    public Builder fullNameDerived(String fullNameDerived) {
      this.fullNameDerived = Optional.of(fullNameDerived);
      return this;
    }

    @JsonSetter(
        value = "gender",
        nulls = Nulls.SKIP
    )
    public Builder gender(Optional<String> gender) {
      this.gender = gender;
      return this;
    }

    public Builder gender(String gender) {
      this.gender = Optional.of(gender);
      return this;
    }

    @JsonSetter(
        value = "hire_term_daterange",
        nulls = Nulls.SKIP
    )
    public Builder hireTermDaterange(Optional<HireTermDaterange> hireTermDaterange) {
      this.hireTermDaterange = hireTermDaterange;
      return this;
    }

    public Builder hireTermDaterange(HireTermDaterange hireTermDaterange) {
      this.hireTermDaterange = Optional.of(hireTermDaterange);
      return this;
    }

    @JsonSetter(
        value = "id",
        nulls = Nulls.SKIP
    )
    public Builder id(Optional<Integer> id) {
      this.id = id;
      return this;
    }

    public Builder id(Integer id) {
      this.id = Optional.of(id);
      return this;
    }

    @JsonSetter(
        value = "last_name",
        nulls = Nulls.SKIP
    )
    public Builder lastName(Optional<String> lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder lastName(String lastName) {
      this.lastName = Optional.of(lastName);
      return this;
    }

    @JsonSetter(
        value = "last_name_derived",
        nulls = Nulls.SKIP
    )
    public Builder lastNameDerived(Optional<String> lastNameDerived) {
      this.lastNameDerived = lastNameDerived;
      return this;
    }

    public Builder lastNameDerived(String lastNameDerived) {
      this.lastNameDerived = Optional.of(lastNameDerived);
      return this;
    }

    @JsonSetter(
        value = "modifieddate",
        nulls = Nulls.SKIP
    )
    public Builder modifieddate(Optional<String> modifieddate) {
      this.modifieddate = modifieddate;
      return this;
    }

    public Builder modifieddate(String modifieddate) {
      this.modifieddate = Optional.of(modifieddate);
      return this;
    }

    @JsonSetter(
        value = "phone_home",
        nulls = Nulls.SKIP
    )
    public Builder phoneHome(Optional<String> phoneHome) {
      this.phoneHome = phoneHome;
      return this;
    }

    public Builder phoneHome(String phoneHome) {
      this.phoneHome = Optional.of(phoneHome);
      return this;
    }

    @JsonSetter(
        value = "phone_mobile",
        nulls = Nulls.SKIP
    )
    public Builder phoneMobile(Optional<String> phoneMobile) {
      this.phoneMobile = phoneMobile;
      return this;
    }

    public Builder phoneMobile(String phoneMobile) {
      this.phoneMobile = Optional.of(phoneMobile);
      return this;
    }

    @JsonSetter(
        value = "ssn",
        nulls = Nulls.SKIP
    )
    public Builder ssn(Optional<String> ssn) {
      this.ssn = ssn;
      return this;
    }

    public Builder ssn(String ssn) {
      this.ssn = Optional.of(ssn);
      return this;
    }

    @JsonSetter(
        value = "tenant",
        nulls = Nulls.SKIP
    )
    public Builder tenant(Optional<Tenant> tenant) {
      this.tenant = tenant;
      return this;
    }

    public Builder tenant(Tenant tenant) {
      this.tenant = Optional.of(tenant);
      return this;
    }

    @JsonSetter(
        value = "unread_count",
        nulls = Nulls.SKIP
    )
    public Builder unreadCount(Optional<Integer> unreadCount) {
      this.unreadCount = unreadCount;
      return this;
    }

    public Builder unreadCount(Integer unreadCount) {
      this.unreadCount = Optional.of(unreadCount);
      return this;
    }

    @JsonSetter(
        value = "vendor_members",
        nulls = Nulls.SKIP
    )
    public Builder vendorMembers(List<VendorMember> vendorMembers) {
      this.vendorMembers.clear();
      this.vendorMembers.addAll(vendorMembers);
      return this;
    }

    public Builder vendorMembers(VendorMember vendorMembers) {
      this.vendorMembers.add(vendorMembers);
      return this;
    }

    public Builder addAllVendorMembers(List<VendorMember> vendorMembers) {
      this.vendorMembers.addAll(vendorMembers);
      return this;
    }

    public Member1 build() {
      return new Member1(accounts, address, alegeusKey, archived, archivedDate, archivedby, canMakeClaimRequests, canUsePortal, createddate, dateOfBirth, dependents, email, employer, firstName, firstNameDerived, fullNameDerived, gender, hireTermDaterange, id, lastName, lastNameDerived, modifieddate, phoneHome, phoneMobile, ssn, tenant, unreadCount, vendorMembers);
    }
  }
}
