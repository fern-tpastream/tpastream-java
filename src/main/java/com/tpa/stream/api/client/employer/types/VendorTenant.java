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
    builder = VendorTenant.Builder.class
)
public final class VendorTenant {
  private final Optional<Integer> id;

  private final Optional<String> label;

  private final Optional<Vendor> vendor;

  private int _cachedHashCode;

  VendorTenant(Optional<Integer> id, Optional<String> label, Optional<Vendor> vendor) {
    this.id = id;
    this.label = label;
    this.vendor = vendor;
  }

  @JsonProperty("id")
  public Optional<Integer> getId() {
    return id;
  }

  @JsonProperty("label")
  public Optional<String> getLabel() {
    return label;
  }

  @JsonProperty("vendor")
  public Optional<Vendor> getVendor() {
    return vendor;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof VendorTenant && equalTo((VendorTenant) other);
  }

  private boolean equalTo(VendorTenant other) {
    return id.equals(other.id) && label.equals(other.label) && vendor.equals(other.vendor);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.label, this.vendor);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "VendorTenant{" + "id: " + id + ", label: " + label + ", vendor: " + vendor + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Integer> id = Optional.empty();

    private Optional<String> label = Optional.empty();

    private Optional<Vendor> vendor = Optional.empty();

    private Builder() {
    }

    public Builder from(VendorTenant other) {
      id(other.getId());
      label(other.getLabel());
      vendor(other.getVendor());
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
        value = "label",
        nulls = Nulls.SKIP
    )
    public Builder label(Optional<String> label) {
      this.label = label;
      return this;
    }

    public Builder label(String label) {
      this.label = Optional.of(label);
      return this;
    }

    @JsonSetter(
        value = "vendor",
        nulls = Nulls.SKIP
    )
    public Builder vendor(Optional<Vendor> vendor) {
      this.vendor = vendor;
      return this;
    }

    public Builder vendor(Vendor vendor) {
      this.vendor = Optional.of(vendor);
      return this;
    }

    public VendorTenant build() {
      return new VendorTenant(id, label, vendor);
    }
  }
}
