package com.tpastream.api.client.claims.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class ClaimStatus {
  public static final ClaimStatus REJECTED = new ClaimStatus(Value.REJECTED, "Rejected");

  public static final ClaimStatus ADJUSTED = new ClaimStatus(Value.ADJUSTED, "Adjusted");

  public static final ClaimStatus IN_PROCESS = new ClaimStatus(Value.IN_PROCESS, "In Process");

  public static final ClaimStatus PROCESSED = new ClaimStatus(Value.PROCESSED, "Processed");

  public static final ClaimStatus PARTIALLY_APPROVED = new ClaimStatus(Value.PARTIALLY_APPROVED, "Partially Approved");

  private final Value value;

  private final String string;

  ClaimStatus(Value value, String string) {
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
      || (other instanceof ClaimStatus && this.string.equals(((ClaimStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case REJECTED:
        return visitor.visitRejected();
      case ADJUSTED:
        return visitor.visitAdjusted();
      case IN_PROCESS:
        return visitor.visitInProcess();
      case PROCESSED:
        return visitor.visitProcessed();
      case PARTIALLY_APPROVED:
        return visitor.visitPartiallyApproved();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static ClaimStatus valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "Rejected":
        return REJECTED;
      case "Adjusted":
        return ADJUSTED;
      case "In Process":
        return IN_PROCESS;
      case "Processed":
        return PROCESSED;
      case "Partially Approved":
        return PARTIALLY_APPROVED;
      default:
        return new ClaimStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    IN_PROCESS,

    PROCESSED,

    REJECTED,

    ADJUSTED,

    PARTIALLY_APPROVED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitInProcess();

    T visitProcessed();

    T visitRejected();

    T visitAdjusted();

    T visitPartiallyApproved();

    T visitUnknown(String unknownType);
  }
}
