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
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = Tenant.Builder.class
)
public final class Tenant {
  private final Optional<Boolean> alegeusKeyEnabled;

  private final Optional<Integer> id;

  private final String name;

  private final int tenantId;

  private final VendorTenant1 vendorTenants;

  private int _cachedHashCode;

  Tenant(Optional<Boolean> alegeusKeyEnabled, Optional<Integer> id, String name, int tenantId,
      VendorTenant1 vendorTenants) {
    this.alegeusKeyEnabled = alegeusKeyEnabled;
    this.id = id;
    this.name = name;
    this.tenantId = tenantId;
    this.vendorTenants = vendorTenants;
  }

  @JsonProperty("alegeus_key_enabled")
  public Optional<Boolean> getAlegeusKeyEnabled() {
    return alegeusKeyEnabled;
  }

  @JsonProperty("id")
  public Optional<Integer> getId() {
    return id;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("tenant_id")
  public int getTenantId() {
    return tenantId;
  }

  @JsonProperty("vendor_tenants")
  public VendorTenant1 getVendorTenants() {
    return vendorTenants;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Tenant && equalTo((Tenant) other);
  }

  private boolean equalTo(Tenant other) {
    return alegeusKeyEnabled.equals(other.alegeusKeyEnabled) && id.equals(other.id) && name.equals(other.name) && tenantId == other.tenantId && vendorTenants.equals(other.vendorTenants);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.alegeusKeyEnabled, this.id, this.name, this.tenantId, this.vendorTenants);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Tenant{" + "alegeusKeyEnabled: " + alegeusKeyEnabled + ", id: " + id + ", name: " + name + ", tenantId: " + tenantId + ", vendorTenants: " + vendorTenants + "}";
  }

  public static NameStage builder() {
    return new Builder();
  }

  public interface NameStage {
    TenantIdStage name(String name);

    Builder from(Tenant other);
  }

  public interface TenantIdStage {
    VendorTenantsStage tenantId(int tenantId);
  }

  public interface VendorTenantsStage {
    _FinalStage vendorTenants(VendorTenant1 vendorTenants);
  }

  public interface _FinalStage {
    Tenant build();

    _FinalStage alegeusKeyEnabled(Optional<Boolean> alegeusKeyEnabled);

    _FinalStage alegeusKeyEnabled(Boolean alegeusKeyEnabled);

    _FinalStage id(Optional<Integer> id);

    _FinalStage id(Integer id);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  static final class Builder implements NameStage, TenantIdStage, VendorTenantsStage, _FinalStage {
    private String name;

    private int tenantId;

    private VendorTenant1 vendorTenants;

    private Optional<Integer> id = Optional.empty();

    private Optional<Boolean> alegeusKeyEnabled = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(Tenant other) {
      alegeusKeyEnabled(other.getAlegeusKeyEnabled());
      id(other.getId());
      name(other.getName());
      tenantId(other.getTenantId());
      vendorTenants(other.getVendorTenants());
      return this;
    }

    @Override
    @JsonSetter("name")
    public TenantIdStage name(String name) {
      this.name = name;
      return this;
    }

    @Override
    @JsonSetter("tenant_id")
    public VendorTenantsStage tenantId(int tenantId) {
      this.tenantId = tenantId;
      return this;
    }

    @Override
    @JsonSetter("vendor_tenants")
    public _FinalStage vendorTenants(VendorTenant1 vendorTenants) {
      this.vendorTenants = vendorTenants;
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
    public _FinalStage alegeusKeyEnabled(Boolean alegeusKeyEnabled) {
      this.alegeusKeyEnabled = Optional.of(alegeusKeyEnabled);
      return this;
    }

    @Override
    @JsonSetter(
        value = "alegeus_key_enabled",
        nulls = Nulls.SKIP
    )
    public _FinalStage alegeusKeyEnabled(Optional<Boolean> alegeusKeyEnabled) {
      this.alegeusKeyEnabled = alegeusKeyEnabled;
      return this;
    }

    @Override
    public Tenant build() {
      return new Tenant(alegeusKeyEnabled, id, name, tenantId, vendorTenants);
    }
  }
}
