package com.tpa.stream.api.client.employer.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@JsonDeserialize(
    builder = VendorMember.Builder.class
)
public final class VendorMember {
  private final String key;

  private final VendorTenant vendorTenant;

  private int _cachedHashCode;

  VendorMember(String key, VendorTenant vendorTenant) {
    this.key = key;
    this.vendorTenant = vendorTenant;
  }

  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  @JsonProperty("vendor_tenant")
  public VendorTenant getVendorTenant() {
    return vendorTenant;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof VendorMember && equalTo((VendorMember) other);
  }

  private boolean equalTo(VendorMember other) {
    return key.equals(other.key) && vendorTenant.equals(other.vendorTenant);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.key, this.vendorTenant);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "VendorMember{" + "key: " + key + ", vendorTenant: " + vendorTenant + "}";
  }

  public static KeyStage builder() {
    return new Builder();
  }

  public interface KeyStage {
    VendorTenantStage key(String key);

    Builder from(VendorMember other);
  }

  public interface VendorTenantStage {
    _FinalStage vendorTenant(VendorTenant vendorTenant);
  }

  public interface _FinalStage {
    VendorMember build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  static final class Builder implements KeyStage, VendorTenantStage, _FinalStage {
    private String key;

    private VendorTenant vendorTenant;

    private Builder() {
    }

    @Override
    public Builder from(VendorMember other) {
      key(other.getKey());
      vendorTenant(other.getVendorTenant());
      return this;
    }

    @Override
    @JsonSetter("key")
    public VendorTenantStage key(String key) {
      this.key = key;
      return this;
    }

    @Override
    @JsonSetter("vendor_tenant")
    public _FinalStage vendorTenant(VendorTenant vendorTenant) {
      this.vendorTenant = vendorTenant;
      return this;
    }

    @Override
    public VendorMember build() {
      return new VendorMember(key, vendorTenant);
    }
  }
}
