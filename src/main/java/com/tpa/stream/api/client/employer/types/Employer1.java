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
    builder = Employer1.Builder.class
)
public final class Employer1 {
  private final Optional<Boolean> archived;

  private final Optional<List<Payer>> eligiblePayers;

  private final Optional<Boolean> emailAutomation;

  private final Optional<Integer> employerId;

  private final Optional<Integer> id;

  private final String name;

  private final List<Payer1> payers;

  private final Optional<String> slug;

  private final Optional<String> supportEmailDerived;

  private final Optional<String> supportPhoneDerived;

  private final Optional<String> supportLogoDerived;

  private final Optional<String> supportNameDerived;

  private int _cachedHashCode;

  Employer1(Optional<Boolean> archived, Optional<List<Payer>> eligiblePayers,
      Optional<Boolean> emailAutomation, Optional<Integer> employerId, Optional<Integer> id,
      String name, List<Payer1> payers, Optional<String> slug, Optional<String> supportEmailDerived,
      Optional<String> supportPhoneDerived, Optional<String> supportLogoDerived,
      Optional<String> supportNameDerived) {
    this.archived = archived;
    this.eligiblePayers = eligiblePayers;
    this.emailAutomation = emailAutomation;
    this.employerId = employerId;
    this.id = id;
    this.name = name;
    this.payers = payers;
    this.slug = slug;
    this.supportEmailDerived = supportEmailDerived;
    this.supportPhoneDerived = supportPhoneDerived;
    this.supportLogoDerived = supportLogoDerived;
    this.supportNameDerived = supportNameDerived;
  }

  @JsonProperty("archived")
  public Optional<Boolean> getArchived() {
    return archived;
  }

  @JsonProperty("eligible_payers")
  public Optional<List<Payer>> getEligiblePayers() {
    return eligiblePayers;
  }

  @JsonProperty("email_automation")
  public Optional<Boolean> getEmailAutomation() {
    return emailAutomation;
  }

  @JsonProperty("employer_id")
  public Optional<Integer> getEmployerId() {
    return employerId;
  }

  @JsonProperty("id")
  public Optional<Integer> getId() {
    return id;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("payers")
  public List<Payer1> getPayers() {
    return payers;
  }

  @JsonProperty("slug")
  public Optional<String> getSlug() {
    return slug;
  }

  @JsonProperty("support_email_derived")
  public Optional<String> getSupportEmailDerived() {
    return supportEmailDerived;
  }

  @JsonProperty("support_phone_derived")
  public Optional<String> getSupportPhoneDerived() {
    return supportPhoneDerived;
  }

  @JsonProperty("support_logo_derived")
  public Optional<String> getSupportLogoDerived() {
    return supportLogoDerived;
  }

  @JsonProperty("support_name_derived")
  public Optional<String> getSupportNameDerived() {
    return supportNameDerived;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Employer1 && equalTo((Employer1) other);
  }

  private boolean equalTo(Employer1 other) {
    return archived.equals(other.archived) && eligiblePayers.equals(other.eligiblePayers) && emailAutomation.equals(other.emailAutomation) && employerId.equals(other.employerId) && id.equals(other.id) && name.equals(other.name) && payers.equals(other.payers) && slug.equals(other.slug) && supportEmailDerived.equals(other.supportEmailDerived) && supportPhoneDerived.equals(other.supportPhoneDerived) && supportLogoDerived.equals(other.supportLogoDerived) && supportNameDerived.equals(other.supportNameDerived);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.archived, this.eligiblePayers, this.emailAutomation, this.employerId, this.id, this.name, this.payers, this.slug, this.supportEmailDerived, this.supportPhoneDerived, this.supportLogoDerived, this.supportNameDerived);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Employer1{" + "archived: " + archived + ", eligiblePayers: " + eligiblePayers + ", emailAutomation: " + emailAutomation + ", employerId: " + employerId + ", id: " + id + ", name: " + name + ", payers: " + payers + ", slug: " + slug + ", supportEmailDerived: " + supportEmailDerived + ", supportPhoneDerived: " + supportPhoneDerived + ", supportLogoDerived: " + supportLogoDerived + ", supportNameDerived: " + supportNameDerived + "}";
  }

  public static NameStage builder() {
    return new Builder();
  }

  public interface NameStage {
    _FinalStage name(String name);

    Builder from(Employer1 other);
  }

  public interface _FinalStage {
    Employer1 build();

    _FinalStage archived(Optional<Boolean> archived);

    _FinalStage archived(Boolean archived);

    _FinalStage eligiblePayers(Optional<List<Payer>> eligiblePayers);

    _FinalStage eligiblePayers(List<Payer> eligiblePayers);

    _FinalStage emailAutomation(Optional<Boolean> emailAutomation);

    _FinalStage emailAutomation(Boolean emailAutomation);

    _FinalStage employerId(Optional<Integer> employerId);

    _FinalStage employerId(Integer employerId);

    _FinalStage id(Optional<Integer> id);

    _FinalStage id(Integer id);

    _FinalStage payers(List<Payer1> payers);

    _FinalStage payers(Payer1 payers);

    _FinalStage addAllPayers(List<Payer1> payers);

    _FinalStage slug(Optional<String> slug);

    _FinalStage slug(String slug);

    _FinalStage supportEmailDerived(Optional<String> supportEmailDerived);

    _FinalStage supportEmailDerived(String supportEmailDerived);

    _FinalStage supportPhoneDerived(Optional<String> supportPhoneDerived);

    _FinalStage supportPhoneDerived(String supportPhoneDerived);

    _FinalStage supportLogoDerived(Optional<String> supportLogoDerived);

    _FinalStage supportLogoDerived(String supportLogoDerived);

    _FinalStage supportNameDerived(Optional<String> supportNameDerived);

    _FinalStage supportNameDerived(String supportNameDerived);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  static final class Builder implements NameStage, _FinalStage {
    private String name;

    private Optional<String> supportNameDerived = Optional.empty();

    private Optional<String> supportLogoDerived = Optional.empty();

    private Optional<String> supportPhoneDerived = Optional.empty();

    private Optional<String> supportEmailDerived = Optional.empty();

    private Optional<String> slug = Optional.empty();

    private List<Payer1> payers = new ArrayList<>();

    private Optional<Integer> id = Optional.empty();

    private Optional<Integer> employerId = Optional.empty();

    private Optional<Boolean> emailAutomation = Optional.empty();

    private Optional<List<Payer>> eligiblePayers = Optional.empty();

    private Optional<Boolean> archived = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(Employer1 other) {
      archived(other.getArchived());
      eligiblePayers(other.getEligiblePayers());
      emailAutomation(other.getEmailAutomation());
      employerId(other.getEmployerId());
      id(other.getId());
      name(other.getName());
      payers(other.getPayers());
      slug(other.getSlug());
      supportEmailDerived(other.getSupportEmailDerived());
      supportPhoneDerived(other.getSupportPhoneDerived());
      supportLogoDerived(other.getSupportLogoDerived());
      supportNameDerived(other.getSupportNameDerived());
      return this;
    }

    @Override
    @JsonSetter("name")
    public _FinalStage name(String name) {
      this.name = name;
      return this;
    }

    @Override
    public _FinalStage supportNameDerived(String supportNameDerived) {
      this.supportNameDerived = Optional.of(supportNameDerived);
      return this;
    }

    @Override
    @JsonSetter(
        value = "support_name_derived",
        nulls = Nulls.SKIP
    )
    public _FinalStage supportNameDerived(Optional<String> supportNameDerived) {
      this.supportNameDerived = supportNameDerived;
      return this;
    }

    @Override
    public _FinalStage supportLogoDerived(String supportLogoDerived) {
      this.supportLogoDerived = Optional.of(supportLogoDerived);
      return this;
    }

    @Override
    @JsonSetter(
        value = "support_logo_derived",
        nulls = Nulls.SKIP
    )
    public _FinalStage supportLogoDerived(Optional<String> supportLogoDerived) {
      this.supportLogoDerived = supportLogoDerived;
      return this;
    }

    @Override
    public _FinalStage supportPhoneDerived(String supportPhoneDerived) {
      this.supportPhoneDerived = Optional.of(supportPhoneDerived);
      return this;
    }

    @Override
    @JsonSetter(
        value = "support_phone_derived",
        nulls = Nulls.SKIP
    )
    public _FinalStage supportPhoneDerived(Optional<String> supportPhoneDerived) {
      this.supportPhoneDerived = supportPhoneDerived;
      return this;
    }

    @Override
    public _FinalStage supportEmailDerived(String supportEmailDerived) {
      this.supportEmailDerived = Optional.of(supportEmailDerived);
      return this;
    }

    @Override
    @JsonSetter(
        value = "support_email_derived",
        nulls = Nulls.SKIP
    )
    public _FinalStage supportEmailDerived(Optional<String> supportEmailDerived) {
      this.supportEmailDerived = supportEmailDerived;
      return this;
    }

    @Override
    public _FinalStage slug(String slug) {
      this.slug = Optional.of(slug);
      return this;
    }

    @Override
    @JsonSetter(
        value = "slug",
        nulls = Nulls.SKIP
    )
    public _FinalStage slug(Optional<String> slug) {
      this.slug = slug;
      return this;
    }

    @Override
    public _FinalStage addAllPayers(List<Payer1> payers) {
      this.payers.addAll(payers);
      return this;
    }

    @Override
    public _FinalStage payers(Payer1 payers) {
      this.payers.add(payers);
      return this;
    }

    @Override
    @JsonSetter(
        value = "payers",
        nulls = Nulls.SKIP
    )
    public _FinalStage payers(List<Payer1> payers) {
      this.payers.clear();
      this.payers.addAll(payers);
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
    public _FinalStage employerId(Integer employerId) {
      this.employerId = Optional.of(employerId);
      return this;
    }

    @Override
    @JsonSetter(
        value = "employer_id",
        nulls = Nulls.SKIP
    )
    public _FinalStage employerId(Optional<Integer> employerId) {
      this.employerId = employerId;
      return this;
    }

    @Override
    public _FinalStage emailAutomation(Boolean emailAutomation) {
      this.emailAutomation = Optional.of(emailAutomation);
      return this;
    }

    @Override
    @JsonSetter(
        value = "email_automation",
        nulls = Nulls.SKIP
    )
    public _FinalStage emailAutomation(Optional<Boolean> emailAutomation) {
      this.emailAutomation = emailAutomation;
      return this;
    }

    @Override
    public _FinalStage eligiblePayers(List<Payer> eligiblePayers) {
      this.eligiblePayers = Optional.of(eligiblePayers);
      return this;
    }

    @Override
    @JsonSetter(
        value = "eligible_payers",
        nulls = Nulls.SKIP
    )
    public _FinalStage eligiblePayers(Optional<List<Payer>> eligiblePayers) {
      this.eligiblePayers = eligiblePayers;
      return this;
    }

    @Override
    public _FinalStage archived(Boolean archived) {
      this.archived = Optional.of(archived);
      return this;
    }

    @Override
    @JsonSetter(
        value = "archived",
        nulls = Nulls.SKIP
    )
    public _FinalStage archived(Optional<Boolean> archived) {
      this.archived = archived;
      return this;
    }

    @Override
    public Employer1 build() {
      return new Employer1(archived, eligiblePayers, emailAutomation, employerId, id, name, payers, slug, supportEmailDerived, supportPhoneDerived, supportLogoDerived, supportNameDerived);
    }
  }
}
