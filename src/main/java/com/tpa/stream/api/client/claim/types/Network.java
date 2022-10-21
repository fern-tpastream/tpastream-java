package com.tpa.stream.api.client.claim.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class Network {
  public static final Network OUT = new Network(Value.OUT, "OUT");

  public static final Network TIER_1 = new Network(Value.TIER_1, "TIER1");

  public static final Network IN = new Network(Value.IN, "IN");

  public static final Network TIER_2 = new Network(Value.TIER_2, "TIER2");

  private final Value value;

  private final String string;

  Network(Value value, String string) {
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
      || (other instanceof Network && this.string.equals(((Network) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case OUT:
        return visitor.visitOut();
      case TIER_1:
        return visitor.visitTier1();
      case IN:
        return visitor.visitIn();
      case TIER_2:
        return visitor.visitTier2();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Network valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "OUT":
        return OUT;
      case "TIER1":
        return TIER_1;
      case "IN":
        return IN;
      case "TIER2":
        return TIER_2;
      default:
        return new Network(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    IN,

    OUT,

    TIER_1,

    TIER_2,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitIn();

    T visitOut();

    T visitTier1();

    T visitTier2();

    T visitUnknown(String unknownType);
  }
}
