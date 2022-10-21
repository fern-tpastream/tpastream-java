package com.tpastream.api.client.claims.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class ClaimTypeName {
  public static final ClaimTypeName MEDICAL = new ClaimTypeName(Value.MEDICAL, "medical");

  public static final ClaimTypeName FACILITY = new ClaimTypeName(Value.FACILITY, "facility");

  public static final ClaimTypeName RX = new ClaimTypeName(Value.RX, "rx");

  public static final ClaimTypeName DENTAL = new ClaimTypeName(Value.DENTAL, "dental");

  public static final ClaimTypeName VISION = new ClaimTypeName(Value.VISION, "vision");

  private final Value value;

  private final String string;

  ClaimTypeName(Value value, String string) {
    this.value = value;
    this.string = string;
  }

  public Value getEnumValue() {
    return value;
  }

  @Override
  @JsonValue
  public String toString() {
    return this.string;
  }

  @Override
  public boolean equals(Object other) {
    return (this == other) 
      || (other instanceof ClaimTypeName && this.string.equals(((ClaimTypeName) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case MEDICAL:
        return visitor.visitMedical();
      case FACILITY:
        return visitor.visitFacility();
      case RX:
        return visitor.visitRx();
      case DENTAL:
        return visitor.visitDental();
      case VISION:
        return visitor.visitVision();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static ClaimTypeName valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "medical":
        return MEDICAL;
      case "facility":
        return FACILITY;
      case "rx":
        return RX;
      case "dental":
        return DENTAL;
      case "vision":
        return VISION;
      default:
        return new ClaimTypeName(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    MEDICAL,

    DENTAL,

    RX,

    VISION,

    FACILITY,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitMedical();

    T visitDental();

    T visitRx();

    T visitVision();

    T visitFacility();

    T visitUnknown(String unknownType);
  }
}
