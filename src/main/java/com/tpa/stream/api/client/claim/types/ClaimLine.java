package com.tpa.stream.api.client.claim.types;

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
    builder = ClaimLine.Builder.class
)
public final class ClaimLine {
  private final Optional<Integer> amountAllowed;

  private final Optional<Integer> amountBilled;

  private final Optional<Integer> amountNotCovered;

  private final Optional<Integer> amountPaid;

  private final Optional<Integer> amountPaidOther;

  private final Optional<Integer> coinsurancePatient;

  private final Optional<Integer> copayment;

  private final DateRange dateOfService;

  private final Optional<Integer> daysSupply;

  private final Optional<String> diagnosisCode;

  private final Optional<Integer> discount;

  private final Optional<Integer> id;

  private final Optional<String> nationalDrugCode;

  private final Optional<Integer> patientResponsibility;

  private final Optional<Integer> prescriptionTypeId;

  private final Optional<String> prescriptionTypeStr;

  private final Optional<String> procedureCode;

  private final Optional<String> procedureName;

  private final Optional<Integer> quantity;

  private final Optional<Integer> reduction;

  private final Optional<Integer> totalPatientResponsibility;

  private final Optional<String> uuid;

  private final Optional<String> vendorSystemId;

  private int _cachedHashCode;

  ClaimLine(Optional<Integer> amountAllowed, Optional<Integer> amountBilled,
      Optional<Integer> amountNotCovered, Optional<Integer> amountPaid,
      Optional<Integer> amountPaidOther, Optional<Integer> coinsurancePatient,
      Optional<Integer> copayment, DateRange dateOfService, Optional<Integer> daysSupply,
      Optional<String> diagnosisCode, Optional<Integer> discount, Optional<Integer> id,
      Optional<String> nationalDrugCode, Optional<Integer> patientResponsibility,
      Optional<Integer> prescriptionTypeId, Optional<String> prescriptionTypeStr,
      Optional<String> procedureCode, Optional<String> procedureName, Optional<Integer> quantity,
      Optional<Integer> reduction, Optional<Integer> totalPatientResponsibility,
      Optional<String> uuid, Optional<String> vendorSystemId) {
    this.amountAllowed = amountAllowed;
    this.amountBilled = amountBilled;
    this.amountNotCovered = amountNotCovered;
    this.amountPaid = amountPaid;
    this.amountPaidOther = amountPaidOther;
    this.coinsurancePatient = coinsurancePatient;
    this.copayment = copayment;
    this.dateOfService = dateOfService;
    this.daysSupply = daysSupply;
    this.diagnosisCode = diagnosisCode;
    this.discount = discount;
    this.id = id;
    this.nationalDrugCode = nationalDrugCode;
    this.patientResponsibility = patientResponsibility;
    this.prescriptionTypeId = prescriptionTypeId;
    this.prescriptionTypeStr = prescriptionTypeStr;
    this.procedureCode = procedureCode;
    this.procedureName = procedureName;
    this.quantity = quantity;
    this.reduction = reduction;
    this.totalPatientResponsibility = totalPatientResponsibility;
    this.uuid = uuid;
    this.vendorSystemId = vendorSystemId;
  }

  @JsonProperty("amount_allowed")
  public Optional<Integer> getAmountAllowed() {
    return amountAllowed;
  }

  @JsonProperty("amount_billed")
  public Optional<Integer> getAmountBilled() {
    return amountBilled;
  }

  @JsonProperty("amount_not_covered")
  public Optional<Integer> getAmountNotCovered() {
    return amountNotCovered;
  }

  @JsonProperty("amount_paid")
  public Optional<Integer> getAmountPaid() {
    return amountPaid;
  }

  @JsonProperty("amount_paid_other")
  public Optional<Integer> getAmountPaidOther() {
    return amountPaidOther;
  }

  @JsonProperty("coinsurance_patient")
  public Optional<Integer> getCoinsurancePatient() {
    return coinsurancePatient;
  }

  @JsonProperty("copayment")
  public Optional<Integer> getCopayment() {
    return copayment;
  }

  @JsonProperty("date_of_service")
  public DateRange getDateOfService() {
    return dateOfService;
  }

  @JsonProperty("days_supply")
  public Optional<Integer> getDaysSupply() {
    return daysSupply;
  }

  @JsonProperty("diagnosis_code")
  public Optional<String> getDiagnosisCode() {
    return diagnosisCode;
  }

  @JsonProperty("discount")
  public Optional<Integer> getDiscount() {
    return discount;
  }

  @JsonProperty("id")
  public Optional<Integer> getId() {
    return id;
  }

  @JsonProperty("national_drug_code")
  public Optional<String> getNationalDrugCode() {
    return nationalDrugCode;
  }

  @JsonProperty("patient_responsibility")
  public Optional<Integer> getPatientResponsibility() {
    return patientResponsibility;
  }

  @JsonProperty("prescription_type_id")
  public Optional<Integer> getPrescriptionTypeId() {
    return prescriptionTypeId;
  }

  @JsonProperty("prescription_type_str")
  public Optional<String> getPrescriptionTypeStr() {
    return prescriptionTypeStr;
  }

  @JsonProperty("procedure_code")
  public Optional<String> getProcedureCode() {
    return procedureCode;
  }

  @JsonProperty("procedure_name")
  public Optional<String> getProcedureName() {
    return procedureName;
  }

  @JsonProperty("quantity")
  public Optional<Integer> getQuantity() {
    return quantity;
  }

  @JsonProperty("reduction")
  public Optional<Integer> getReduction() {
    return reduction;
  }

  @JsonProperty("total_patient_responsibility")
  public Optional<Integer> getTotalPatientResponsibility() {
    return totalPatientResponsibility;
  }

  @JsonProperty("uuid")
  public Optional<String> getUuid() {
    return uuid;
  }

  @JsonProperty("vendor_system_id")
  public Optional<String> getVendorSystemId() {
    return vendorSystemId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ClaimLine && equalTo((ClaimLine) other);
  }

  private boolean equalTo(ClaimLine other) {
    return amountAllowed.equals(other.amountAllowed) && amountBilled.equals(other.amountBilled) && amountNotCovered.equals(other.amountNotCovered) && amountPaid.equals(other.amountPaid) && amountPaidOther.equals(other.amountPaidOther) && coinsurancePatient.equals(other.coinsurancePatient) && copayment.equals(other.copayment) && dateOfService.equals(other.dateOfService) && daysSupply.equals(other.daysSupply) && diagnosisCode.equals(other.diagnosisCode) && discount.equals(other.discount) && id.equals(other.id) && nationalDrugCode.equals(other.nationalDrugCode) && patientResponsibility.equals(other.patientResponsibility) && prescriptionTypeId.equals(other.prescriptionTypeId) && prescriptionTypeStr.equals(other.prescriptionTypeStr) && procedureCode.equals(other.procedureCode) && procedureName.equals(other.procedureName) && quantity.equals(other.quantity) && reduction.equals(other.reduction) && totalPatientResponsibility.equals(other.totalPatientResponsibility) && uuid.equals(other.uuid) && vendorSystemId.equals(other.vendorSystemId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.amountAllowed, this.amountBilled, this.amountNotCovered, this.amountPaid, this.amountPaidOther, this.coinsurancePatient, this.copayment, this.dateOfService, this.daysSupply, this.diagnosisCode, this.discount, this.id, this.nationalDrugCode, this.patientResponsibility, this.prescriptionTypeId, this.prescriptionTypeStr, this.procedureCode, this.procedureName, this.quantity, this.reduction, this.totalPatientResponsibility, this.uuid, this.vendorSystemId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ClaimLine{" + "amountAllowed: " + amountAllowed + ", amountBilled: " + amountBilled + ", amountNotCovered: " + amountNotCovered + ", amountPaid: " + amountPaid + ", amountPaidOther: " + amountPaidOther + ", coinsurancePatient: " + coinsurancePatient + ", copayment: " + copayment + ", dateOfService: " + dateOfService + ", daysSupply: " + daysSupply + ", diagnosisCode: " + diagnosisCode + ", discount: " + discount + ", id: " + id + ", nationalDrugCode: " + nationalDrugCode + ", patientResponsibility: " + patientResponsibility + ", prescriptionTypeId: " + prescriptionTypeId + ", prescriptionTypeStr: " + prescriptionTypeStr + ", procedureCode: " + procedureCode + ", procedureName: " + procedureName + ", quantity: " + quantity + ", reduction: " + reduction + ", totalPatientResponsibility: " + totalPatientResponsibility + ", uuid: " + uuid + ", vendorSystemId: " + vendorSystemId + "}";
  }

  public static DateOfServiceStage builder() {
    return new Builder();
  }

  public interface DateOfServiceStage {
    _FinalStage dateOfService(DateRange dateOfService);

    Builder from(ClaimLine other);
  }

  public interface _FinalStage {
    ClaimLine build();

    _FinalStage amountAllowed(Optional<Integer> amountAllowed);

    _FinalStage amountAllowed(Integer amountAllowed);

    _FinalStage amountBilled(Optional<Integer> amountBilled);

    _FinalStage amountBilled(Integer amountBilled);

    _FinalStage amountNotCovered(Optional<Integer> amountNotCovered);

    _FinalStage amountNotCovered(Integer amountNotCovered);

    _FinalStage amountPaid(Optional<Integer> amountPaid);

    _FinalStage amountPaid(Integer amountPaid);

    _FinalStage amountPaidOther(Optional<Integer> amountPaidOther);

    _FinalStage amountPaidOther(Integer amountPaidOther);

    _FinalStage coinsurancePatient(Optional<Integer> coinsurancePatient);

    _FinalStage coinsurancePatient(Integer coinsurancePatient);

    _FinalStage copayment(Optional<Integer> copayment);

    _FinalStage copayment(Integer copayment);

    _FinalStage daysSupply(Optional<Integer> daysSupply);

    _FinalStage daysSupply(Integer daysSupply);

    _FinalStage diagnosisCode(Optional<String> diagnosisCode);

    _FinalStage diagnosisCode(String diagnosisCode);

    _FinalStage discount(Optional<Integer> discount);

    _FinalStage discount(Integer discount);

    _FinalStage id(Optional<Integer> id);

    _FinalStage id(Integer id);

    _FinalStage nationalDrugCode(Optional<String> nationalDrugCode);

    _FinalStage nationalDrugCode(String nationalDrugCode);

    _FinalStage patientResponsibility(Optional<Integer> patientResponsibility);

    _FinalStage patientResponsibility(Integer patientResponsibility);

    _FinalStage prescriptionTypeId(Optional<Integer> prescriptionTypeId);

    _FinalStage prescriptionTypeId(Integer prescriptionTypeId);

    _FinalStage prescriptionTypeStr(Optional<String> prescriptionTypeStr);

    _FinalStage prescriptionTypeStr(String prescriptionTypeStr);

    _FinalStage procedureCode(Optional<String> procedureCode);

    _FinalStage procedureCode(String procedureCode);

    _FinalStage procedureName(Optional<String> procedureName);

    _FinalStage procedureName(String procedureName);

    _FinalStage quantity(Optional<Integer> quantity);

    _FinalStage quantity(Integer quantity);

    _FinalStage reduction(Optional<Integer> reduction);

    _FinalStage reduction(Integer reduction);

    _FinalStage totalPatientResponsibility(Optional<Integer> totalPatientResponsibility);

    _FinalStage totalPatientResponsibility(Integer totalPatientResponsibility);

    _FinalStage uuid(Optional<String> uuid);

    _FinalStage uuid(String uuid);

    _FinalStage vendorSystemId(Optional<String> vendorSystemId);

    _FinalStage vendorSystemId(String vendorSystemId);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  static final class Builder implements DateOfServiceStage, _FinalStage {
    private DateRange dateOfService;

    private Optional<String> vendorSystemId = Optional.empty();

    private Optional<String> uuid = Optional.empty();

    private Optional<Integer> totalPatientResponsibility = Optional.empty();

    private Optional<Integer> reduction = Optional.empty();

    private Optional<Integer> quantity = Optional.empty();

    private Optional<String> procedureName = Optional.empty();

    private Optional<String> procedureCode = Optional.empty();

    private Optional<String> prescriptionTypeStr = Optional.empty();

    private Optional<Integer> prescriptionTypeId = Optional.empty();

    private Optional<Integer> patientResponsibility = Optional.empty();

    private Optional<String> nationalDrugCode = Optional.empty();

    private Optional<Integer> id = Optional.empty();

    private Optional<Integer> discount = Optional.empty();

    private Optional<String> diagnosisCode = Optional.empty();

    private Optional<Integer> daysSupply = Optional.empty();

    private Optional<Integer> copayment = Optional.empty();

    private Optional<Integer> coinsurancePatient = Optional.empty();

    private Optional<Integer> amountPaidOther = Optional.empty();

    private Optional<Integer> amountPaid = Optional.empty();

    private Optional<Integer> amountNotCovered = Optional.empty();

    private Optional<Integer> amountBilled = Optional.empty();

    private Optional<Integer> amountAllowed = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(ClaimLine other) {
      amountAllowed(other.getAmountAllowed());
      amountBilled(other.getAmountBilled());
      amountNotCovered(other.getAmountNotCovered());
      amountPaid(other.getAmountPaid());
      amountPaidOther(other.getAmountPaidOther());
      coinsurancePatient(other.getCoinsurancePatient());
      copayment(other.getCopayment());
      dateOfService(other.getDateOfService());
      daysSupply(other.getDaysSupply());
      diagnosisCode(other.getDiagnosisCode());
      discount(other.getDiscount());
      id(other.getId());
      nationalDrugCode(other.getNationalDrugCode());
      patientResponsibility(other.getPatientResponsibility());
      prescriptionTypeId(other.getPrescriptionTypeId());
      prescriptionTypeStr(other.getPrescriptionTypeStr());
      procedureCode(other.getProcedureCode());
      procedureName(other.getProcedureName());
      quantity(other.getQuantity());
      reduction(other.getReduction());
      totalPatientResponsibility(other.getTotalPatientResponsibility());
      uuid(other.getUuid());
      vendorSystemId(other.getVendorSystemId());
      return this;
    }

    @Override
    @JsonSetter("date_of_service")
    public _FinalStage dateOfService(DateRange dateOfService) {
      this.dateOfService = dateOfService;
      return this;
    }

    @Override
    public _FinalStage vendorSystemId(String vendorSystemId) {
      this.vendorSystemId = Optional.of(vendorSystemId);
      return this;
    }

    @Override
    @JsonSetter(
        value = "vendor_system_id",
        nulls = Nulls.SKIP
    )
    public _FinalStage vendorSystemId(Optional<String> vendorSystemId) {
      this.vendorSystemId = vendorSystemId;
      return this;
    }

    @Override
    public _FinalStage uuid(String uuid) {
      this.uuid = Optional.of(uuid);
      return this;
    }

    @Override
    @JsonSetter(
        value = "uuid",
        nulls = Nulls.SKIP
    )
    public _FinalStage uuid(Optional<String> uuid) {
      this.uuid = uuid;
      return this;
    }

    @Override
    public _FinalStage totalPatientResponsibility(Integer totalPatientResponsibility) {
      this.totalPatientResponsibility = Optional.of(totalPatientResponsibility);
      return this;
    }

    @Override
    @JsonSetter(
        value = "total_patient_responsibility",
        nulls = Nulls.SKIP
    )
    public _FinalStage totalPatientResponsibility(Optional<Integer> totalPatientResponsibility) {
      this.totalPatientResponsibility = totalPatientResponsibility;
      return this;
    }

    @Override
    public _FinalStage reduction(Integer reduction) {
      this.reduction = Optional.of(reduction);
      return this;
    }

    @Override
    @JsonSetter(
        value = "reduction",
        nulls = Nulls.SKIP
    )
    public _FinalStage reduction(Optional<Integer> reduction) {
      this.reduction = reduction;
      return this;
    }

    @Override
    public _FinalStage quantity(Integer quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }

    @Override
    @JsonSetter(
        value = "quantity",
        nulls = Nulls.SKIP
    )
    public _FinalStage quantity(Optional<Integer> quantity) {
      this.quantity = quantity;
      return this;
    }

    @Override
    public _FinalStage procedureName(String procedureName) {
      this.procedureName = Optional.of(procedureName);
      return this;
    }

    @Override
    @JsonSetter(
        value = "procedure_name",
        nulls = Nulls.SKIP
    )
    public _FinalStage procedureName(Optional<String> procedureName) {
      this.procedureName = procedureName;
      return this;
    }

    @Override
    public _FinalStage procedureCode(String procedureCode) {
      this.procedureCode = Optional.of(procedureCode);
      return this;
    }

    @Override
    @JsonSetter(
        value = "procedure_code",
        nulls = Nulls.SKIP
    )
    public _FinalStage procedureCode(Optional<String> procedureCode) {
      this.procedureCode = procedureCode;
      return this;
    }

    @Override
    public _FinalStage prescriptionTypeStr(String prescriptionTypeStr) {
      this.prescriptionTypeStr = Optional.of(prescriptionTypeStr);
      return this;
    }

    @Override
    @JsonSetter(
        value = "prescription_type_str",
        nulls = Nulls.SKIP
    )
    public _FinalStage prescriptionTypeStr(Optional<String> prescriptionTypeStr) {
      this.prescriptionTypeStr = prescriptionTypeStr;
      return this;
    }

    @Override
    public _FinalStage prescriptionTypeId(Integer prescriptionTypeId) {
      this.prescriptionTypeId = Optional.of(prescriptionTypeId);
      return this;
    }

    @Override
    @JsonSetter(
        value = "prescription_type_id",
        nulls = Nulls.SKIP
    )
    public _FinalStage prescriptionTypeId(Optional<Integer> prescriptionTypeId) {
      this.prescriptionTypeId = prescriptionTypeId;
      return this;
    }

    @Override
    public _FinalStage patientResponsibility(Integer patientResponsibility) {
      this.patientResponsibility = Optional.of(patientResponsibility);
      return this;
    }

    @Override
    @JsonSetter(
        value = "patient_responsibility",
        nulls = Nulls.SKIP
    )
    public _FinalStage patientResponsibility(Optional<Integer> patientResponsibility) {
      this.patientResponsibility = patientResponsibility;
      return this;
    }

    @Override
    public _FinalStage nationalDrugCode(String nationalDrugCode) {
      this.nationalDrugCode = Optional.of(nationalDrugCode);
      return this;
    }

    @Override
    @JsonSetter(
        value = "national_drug_code",
        nulls = Nulls.SKIP
    )
    public _FinalStage nationalDrugCode(Optional<String> nationalDrugCode) {
      this.nationalDrugCode = nationalDrugCode;
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
    public _FinalStage discount(Integer discount) {
      this.discount = Optional.of(discount);
      return this;
    }

    @Override
    @JsonSetter(
        value = "discount",
        nulls = Nulls.SKIP
    )
    public _FinalStage discount(Optional<Integer> discount) {
      this.discount = discount;
      return this;
    }

    @Override
    public _FinalStage diagnosisCode(String diagnosisCode) {
      this.diagnosisCode = Optional.of(diagnosisCode);
      return this;
    }

    @Override
    @JsonSetter(
        value = "diagnosis_code",
        nulls = Nulls.SKIP
    )
    public _FinalStage diagnosisCode(Optional<String> diagnosisCode) {
      this.diagnosisCode = diagnosisCode;
      return this;
    }

    @Override
    public _FinalStage daysSupply(Integer daysSupply) {
      this.daysSupply = Optional.of(daysSupply);
      return this;
    }

    @Override
    @JsonSetter(
        value = "days_supply",
        nulls = Nulls.SKIP
    )
    public _FinalStage daysSupply(Optional<Integer> daysSupply) {
      this.daysSupply = daysSupply;
      return this;
    }

    @Override
    public _FinalStage copayment(Integer copayment) {
      this.copayment = Optional.of(copayment);
      return this;
    }

    @Override
    @JsonSetter(
        value = "copayment",
        nulls = Nulls.SKIP
    )
    public _FinalStage copayment(Optional<Integer> copayment) {
      this.copayment = copayment;
      return this;
    }

    @Override
    public _FinalStage coinsurancePatient(Integer coinsurancePatient) {
      this.coinsurancePatient = Optional.of(coinsurancePatient);
      return this;
    }

    @Override
    @JsonSetter(
        value = "coinsurance_patient",
        nulls = Nulls.SKIP
    )
    public _FinalStage coinsurancePatient(Optional<Integer> coinsurancePatient) {
      this.coinsurancePatient = coinsurancePatient;
      return this;
    }

    @Override
    public _FinalStage amountPaidOther(Integer amountPaidOther) {
      this.amountPaidOther = Optional.of(amountPaidOther);
      return this;
    }

    @Override
    @JsonSetter(
        value = "amount_paid_other",
        nulls = Nulls.SKIP
    )
    public _FinalStage amountPaidOther(Optional<Integer> amountPaidOther) {
      this.amountPaidOther = amountPaidOther;
      return this;
    }

    @Override
    public _FinalStage amountPaid(Integer amountPaid) {
      this.amountPaid = Optional.of(amountPaid);
      return this;
    }

    @Override
    @JsonSetter(
        value = "amount_paid",
        nulls = Nulls.SKIP
    )
    public _FinalStage amountPaid(Optional<Integer> amountPaid) {
      this.amountPaid = amountPaid;
      return this;
    }

    @Override
    public _FinalStage amountNotCovered(Integer amountNotCovered) {
      this.amountNotCovered = Optional.of(amountNotCovered);
      return this;
    }

    @Override
    @JsonSetter(
        value = "amount_not_covered",
        nulls = Nulls.SKIP
    )
    public _FinalStage amountNotCovered(Optional<Integer> amountNotCovered) {
      this.amountNotCovered = amountNotCovered;
      return this;
    }

    @Override
    public _FinalStage amountBilled(Integer amountBilled) {
      this.amountBilled = Optional.of(amountBilled);
      return this;
    }

    @Override
    @JsonSetter(
        value = "amount_billed",
        nulls = Nulls.SKIP
    )
    public _FinalStage amountBilled(Optional<Integer> amountBilled) {
      this.amountBilled = amountBilled;
      return this;
    }

    @Override
    public _FinalStage amountAllowed(Integer amountAllowed) {
      this.amountAllowed = Optional.of(amountAllowed);
      return this;
    }

    @Override
    @JsonSetter(
        value = "amount_allowed",
        nulls = Nulls.SKIP
    )
    public _FinalStage amountAllowed(Optional<Integer> amountAllowed) {
      this.amountAllowed = amountAllowed;
      return this;
    }

    @Override
    public ClaimLine build() {
      return new ClaimLine(amountAllowed, amountBilled, amountNotCovered, amountPaid, amountPaidOther, coinsurancePatient, copayment, dateOfService, daysSupply, diagnosisCode, discount, id, nationalDrugCode, patientResponsibility, prescriptionTypeId, prescriptionTypeStr, procedureCode, procedureName, quantity, reduction, totalPatientResponsibility, uuid, vendorSystemId);
    }
  }
}
