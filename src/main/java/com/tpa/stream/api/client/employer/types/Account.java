package com.tpa.stream.api.client.employer.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = Account.Builder.class
)
public final class Account {
  private final Accounts accounts;

  private final Optional<String> address;

  private final Optional<String> alegeusKey;

  private final boolean archived;

  private final String archivedDate;

  private final String archivedby;

  private final Optional<Boolean> canMakeClaimRequests;

  private int _cachedHashCode;

  Account(Accounts accounts, Optional<String> address, Optional<String> alegeusKey,
      boolean archived, String archivedDate, String archivedby,
      Optional<Boolean> canMakeClaimRequests) {
    this.accounts = accounts;
    this.address = address;
    this.alegeusKey = alegeusKey;
    this.archived = archived;
    this.archivedDate = archivedDate;
    this.archivedby = archivedby;
    this.canMakeClaimRequests = canMakeClaimRequests;
  }

  @JsonProperty("accounts")
  public Accounts getAccounts() {
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
  public boolean getArchived() {
    return archived;
  }

  @JsonProperty("archived_date")
  public String getArchivedDate() {
    return archivedDate;
  }

  @JsonProperty("archivedby")
  public String getArchivedby() {
    return archivedby;
  }

  @JsonProperty("can_make_claim_requests")
  public Optional<Boolean> getCanMakeClaimRequests() {
    return canMakeClaimRequests;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Account && equalTo((Account) other);
  }

  private boolean equalTo(Account other) {
    return accounts.equals(other.accounts) && address.equals(other.address) && alegeusKey.equals(other.alegeusKey) && archived == other.archived && archivedDate.equals(other.archivedDate) && archivedby.equals(other.archivedby) && canMakeClaimRequests.equals(other.canMakeClaimRequests);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.accounts, this.address, this.alegeusKey, this.archived, this.archivedDate, this.archivedby, this.canMakeClaimRequests);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Account{" + "accounts: " + accounts + ", address: " + address + ", alegeusKey: " + alegeusKey + ", archived: " + archived + ", archivedDate: " + archivedDate + ", archivedby: " + archivedby + ", canMakeClaimRequests: " + canMakeClaimRequests + "}";
  }

  public static AccountsStage builder() {
    return new Builder();
  }

  public interface AccountsStage {
    ArchivedStage accounts(Accounts accounts);

    Builder from(Account other);
  }

  public interface ArchivedStage {
    ArchivedDateStage archived(boolean archived);
  }

  public interface ArchivedDateStage {
    ArchivedbyStage archivedDate(String archivedDate);
  }

  public interface ArchivedbyStage {
    _FinalStage archivedby(String archivedby);
  }

  public interface _FinalStage {
    Account build();

    _FinalStage address(Optional<String> address);

    _FinalStage address(String address);

    _FinalStage alegeusKey(Optional<String> alegeusKey);

    _FinalStage alegeusKey(String alegeusKey);

    _FinalStage canMakeClaimRequests(Optional<Boolean> canMakeClaimRequests);

    _FinalStage canMakeClaimRequests(Boolean canMakeClaimRequests);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  static final class Builder implements AccountsStage, ArchivedStage, ArchivedDateStage, ArchivedbyStage, _FinalStage {
    private Accounts accounts;

    private boolean archived;

    private String archivedDate;

    private String archivedby;

    private Optional<Boolean> canMakeClaimRequests = Optional.empty();

    private Optional<String> alegeusKey = Optional.empty();

    private Optional<String> address = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(Account other) {
      accounts(other.getAccounts());
      address(other.getAddress());
      alegeusKey(other.getAlegeusKey());
      archived(other.getArchived());
      archivedDate(other.getArchivedDate());
      archivedby(other.getArchivedby());
      canMakeClaimRequests(other.getCanMakeClaimRequests());
      return this;
    }

    @Override
    @JsonSetter("accounts")
    public ArchivedStage accounts(Accounts accounts) {
      this.accounts = accounts;
      return this;
    }

    @Override
    @JsonSetter("archived")
    public ArchivedDateStage archived(boolean archived) {
      this.archived = archived;
      return this;
    }

    @Override
    @JsonSetter("archived_date")
    public ArchivedbyStage archivedDate(String archivedDate) {
      this.archivedDate = archivedDate;
      return this;
    }

    @Override
    @JsonSetter("archivedby")
    public _FinalStage archivedby(String archivedby) {
      this.archivedby = archivedby;
      return this;
    }

    @Override
    public _FinalStage canMakeClaimRequests(Boolean canMakeClaimRequests) {
      this.canMakeClaimRequests = Optional.of(canMakeClaimRequests);
      return this;
    }

    @Override
    @JsonSetter(
        value = "can_make_claim_requests",
        nulls = Nulls.SKIP
    )
    public _FinalStage canMakeClaimRequests(Optional<Boolean> canMakeClaimRequests) {
      this.canMakeClaimRequests = canMakeClaimRequests;
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
    public Account build() {
      return new Account(accounts, address, alegeusKey, archived, archivedDate, archivedby, canMakeClaimRequests);
    }
  }
}
