package com.tpa.stream.api.client.claim.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class ClaimTypeId {
  public static final ClaimTypeId ONE = new ClaimTypeId(Value.ONE, "1");

  public static final ClaimTypeId TWO = new ClaimTypeId(Value.TWO, "2");

  public static final ClaimTypeId THREE = new ClaimTypeId(Value.THREE, "3");

  public static final ClaimTypeId FOUR = new ClaimTypeId(Value.FOUR, "4");

  public static final ClaimTypeId FIVE = new ClaimTypeId(Value.FIVE, "5");

  private final Value value;

  private final String string;

  ClaimTypeId(Value value, String string) {
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
      || (other instanceof ClaimTypeId && this.string.equals(((ClaimTypeId) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case ONE:
        return visitor.visitOne();
      case TWO:
        return visitor.visitTwo();
      case THREE:
        return visitor.visitThree();
      case FOUR:
        return visitor.visitFour();
      case FIVE:
        return visitor.visitFive();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static ClaimTypeId valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "1":
        return ONE;
      case "2":
        return TWO;
      case "3":
        return THREE;
      case "4":
        return FOUR;
      case "5":
        return FIVE;
      default:
        return new ClaimTypeId(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ONE,

    TWO,

    THREE,

    FOUR,

    FIVE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitOne();

    T visitTwo();

    T visitThree();

    T visitFour();

    T visitFive();

    T visitUnknown(String unknownType);
  }
}
