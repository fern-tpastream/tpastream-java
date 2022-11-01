package com.tpa.stream.api.client.claim.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.tpa.stream.api.client.employer.types.Member;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@JsonDeserialize(
    builder = Claim.Builder.class
)
public final class Claim {
  private final Optional<Integer> amountAllowed;

  private final Optional<Integer> amountBilled;

  private final Optional<Integer> amountNotCovered;

  private final Optional<Integer> amountPaid;

  private final Optional<Integer> amountPaidOther;

  private final Optional<String> checkDate;

  private final Optional<String> checkNumber;

  private final List<ClaimLine> claimMedicalLines;

  private final Optional<Integer> coinsurancePatient;

  private final Optional<Integer> computedAmountAllowed;

  private final Optional<Integer> computedAmountBilled;

  private final Optional<Integer> computedAmountPaid;

  private final Optional<Integer> computedCoinsurancePatient;

  private final Optional<Integer> computedCopayment;

  private final Optional<Integer> computedPatientResponsibility;

  private final Optional<Integer> computedReduction;

  private final Optional<Integer> copayment;

  private final Optional<String> createddate;

  private final Optional<Integer> dataobjectId;

  private final Optional<String> dateColumn;

  private final Optional<DateRange> dateOfService;

  private final Optional<Integer> discount;

  private final Optional<String> eobDate;

  private final Optional<String> groupName;

  private final Optional<String> groupNumber;

  private final Optional<Integer> id;

  private final Optional<Integer> incurredValue;

  private final boolean isIncomplete;

  private final Optional<String> lastUpdatedStatus;

  private final Optional<List<Member>> members;

  private final Optional<String> modifieddate;

  private final Optional<Network> network;

  private final Optional<String> patientAccountNumber;

  private final Optional<String> patientName;

  private final Optional<String> patientPayerNumber;

  private final Optional<Integer> patientResponsibility;

  private final PolicyHolder policyHolder;

  private final Optional<String> processedOn;

  private final Optional<Boolean> recrawlRequested;

  private final Optional<Integer> reduction;

  private final Optional<String> remarks;

  private final Optional<String> serviceProvider;

  private final Optional<String> serviceProviderAddress;

  private final Optional<String> serviceProviderBillingAddress;

  private final Optional<String> serviceProviderBillingName;

  private final Optional<Integer> serviceProviderBillingNpiNumber;

  private final Optional<String> serviceProviderBillingNumber;

  private final Optional<String> serviceProviderBillingPhone;

  private final Optional<Integer> serviceProviderNpiNumber;

  private final Optional<String> serviceProviderNumber;

  private final Optional<ClaimStatus> status;

  private final Optional<ClaimType> type;

  private final Optional<UUID> uuid;

  private final Optional<String> vendorSystemId;

  private int _cachedHashCode;

  Claim(Optional<Integer> amountAllowed, Optional<Integer> amountBilled,
      Optional<Integer> amountNotCovered, Optional<Integer> amountPaid,
      Optional<Integer> amountPaidOther, Optional<String> checkDate, Optional<String> checkNumber,
      List<ClaimLine> claimMedicalLines, Optional<Integer> coinsurancePatient,
      Optional<Integer> computedAmountAllowed, Optional<Integer> computedAmountBilled,
      Optional<Integer> computedAmountPaid, Optional<Integer> computedCoinsurancePatient,
      Optional<Integer> computedCopayment, Optional<Integer> computedPatientResponsibility,
      Optional<Integer> computedReduction, Optional<Integer> copayment,
      Optional<String> createddate, Optional<Integer> dataobjectId, Optional<String> dateColumn,
      Optional<DateRange> dateOfService, Optional<Integer> discount, Optional<String> eobDate,
      Optional<String> groupName, Optional<String> groupNumber, Optional<Integer> id,
      Optional<Integer> incurredValue, boolean isIncomplete, Optional<String> lastUpdatedStatus,
      Optional<List<Member>> members, Optional<String> modifieddate, Optional<Network> network,
      Optional<String> patientAccountNumber, Optional<String> patientName,
      Optional<String> patientPayerNumber, Optional<Integer> patientResponsibility,
      PolicyHolder policyHolder, Optional<String> processedOn, Optional<Boolean> recrawlRequested,
      Optional<Integer> reduction, Optional<String> remarks, Optional<String> serviceProvider,
      Optional<String> serviceProviderAddress, Optional<String> serviceProviderBillingAddress,
      Optional<String> serviceProviderBillingName,
      Optional<Integer> serviceProviderBillingNpiNumber,
      Optional<String> serviceProviderBillingNumber, Optional<String> serviceProviderBillingPhone,
      Optional<Integer> serviceProviderNpiNumber, Optional<String> serviceProviderNumber,
      Optional<ClaimStatus> status, Optional<ClaimType> type, Optional<UUID> uuid,
      Optional<String> vendorSystemId) {
    this.amountAllowed = amountAllowed;
    this.amountBilled = amountBilled;
    this.amountNotCovered = amountNotCovered;
    this.amountPaid = amountPaid;
    this.amountPaidOther = amountPaidOther;
    this.checkDate = checkDate;
    this.checkNumber = checkNumber;
    this.claimMedicalLines = claimMedicalLines;
    this.coinsurancePatient = coinsurancePatient;
    this.computedAmountAllowed = computedAmountAllowed;
    this.computedAmountBilled = computedAmountBilled;
    this.computedAmountPaid = computedAmountPaid;
    this.computedCoinsurancePatient = computedCoinsurancePatient;
    this.computedCopayment = computedCopayment;
    this.computedPatientResponsibility = computedPatientResponsibility;
    this.computedReduction = computedReduction;
    this.copayment = copayment;
    this.createddate = createddate;
    this.dataobjectId = dataobjectId;
    this.dateColumn = dateColumn;
    this.dateOfService = dateOfService;
    this.discount = discount;
    this.eobDate = eobDate;
    this.groupName = groupName;
    this.groupNumber = groupNumber;
    this.id = id;
    this.incurredValue = incurredValue;
    this.isIncomplete = isIncomplete;
    this.lastUpdatedStatus = lastUpdatedStatus;
    this.members = members;
    this.modifieddate = modifieddate;
    this.network = network;
    this.patientAccountNumber = patientAccountNumber;
    this.patientName = patientName;
    this.patientPayerNumber = patientPayerNumber;
    this.patientResponsibility = patientResponsibility;
    this.policyHolder = policyHolder;
    this.processedOn = processedOn;
    this.recrawlRequested = recrawlRequested;
    this.reduction = reduction;
    this.remarks = remarks;
    this.serviceProvider = serviceProvider;
    this.serviceProviderAddress = serviceProviderAddress;
    this.serviceProviderBillingAddress = serviceProviderBillingAddress;
    this.serviceProviderBillingName = serviceProviderBillingName;
    this.serviceProviderBillingNpiNumber = serviceProviderBillingNpiNumber;
    this.serviceProviderBillingNumber = serviceProviderBillingNumber;
    this.serviceProviderBillingPhone = serviceProviderBillingPhone;
    this.serviceProviderNpiNumber = serviceProviderNpiNumber;
    this.serviceProviderNumber = serviceProviderNumber;
    this.status = status;
    this.type = type;
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

  @JsonProperty("check_date")
  public Optional<String> getCheckDate() {
    return checkDate;
  }

  @JsonProperty("check_number")
  public Optional<String> getCheckNumber() {
    return checkNumber;
  }

  @JsonProperty("claim_medical_lines")
  public List<ClaimLine> getClaimMedicalLines() {
    return claimMedicalLines;
  }

  @JsonProperty("coinsurance_patient")
  public Optional<Integer> getCoinsurancePatient() {
    return coinsurancePatient;
  }

  @JsonProperty("computed_amount_allowed")
  public Optional<Integer> getComputedAmountAllowed() {
    return computedAmountAllowed;
  }

  @JsonProperty("computed_amount_billed")
  public Optional<Integer> getComputedAmountBilled() {
    return computedAmountBilled;
  }

  @JsonProperty("computed_amount_paid")
  public Optional<Integer> getComputedAmountPaid() {
    return computedAmountPaid;
  }

  @JsonProperty("computed_coinsurance_patient")
  public Optional<Integer> getComputedCoinsurancePatient() {
    return computedCoinsurancePatient;
  }

  @JsonProperty("computed_copayment")
  public Optional<Integer> getComputedCopayment() {
    return computedCopayment;
  }

  @JsonProperty("computed_patient_responsibility")
  public Optional<Integer> getComputedPatientResponsibility() {
    return computedPatientResponsibility;
  }

  @JsonProperty("computed_reduction")
  public Optional<Integer> getComputedReduction() {
    return computedReduction;
  }

  @JsonProperty("copayment")
  public Optional<Integer> getCopayment() {
    return copayment;
  }

  @JsonProperty("createddate")
  public Optional<String> getCreateddate() {
    return createddate;
  }

  @JsonProperty("dataobject_id")
  public Optional<Integer> getDataobjectId() {
    return dataobjectId;
  }

  @JsonProperty("date_column")
  public Optional<String> getDateColumn() {
    return dateColumn;
  }

  @JsonProperty("date_of_service")
  public Optional<DateRange> getDateOfService() {
    return dateOfService;
  }

  @JsonProperty("discount")
  public Optional<Integer> getDiscount() {
    return discount;
  }

  @JsonProperty("eob_date")
  public Optional<String> getEobDate() {
    return eobDate;
  }

  @JsonProperty("group_name")
  public Optional<String> getGroupName() {
    return groupName;
  }

  @JsonProperty("group_number")
  public Optional<String> getGroupNumber() {
    return groupNumber;
  }

  @JsonProperty("id")
  public Optional<Integer> getId() {
    return id;
  }

  @JsonProperty("incurred_value")
  public Optional<Integer> getIncurredValue() {
    return incurredValue;
  }

  @JsonProperty("is_incomplete")
  public boolean getIsIncomplete() {
    return isIncomplete;
  }

  @JsonProperty("last_updated_status")
  public Optional<String> getLastUpdatedStatus() {
    return lastUpdatedStatus;
  }

  @JsonProperty("members")
  public Optional<List<Member>> getMembers() {
    return members;
  }

  @JsonProperty("modifieddate")
  public Optional<String> getModifieddate() {
    return modifieddate;
  }

  @JsonProperty("network")
  public Optional<Network> getNetwork() {
    return network;
  }

  @JsonProperty("patient_account_number")
  public Optional<String> getPatientAccountNumber() {
    return patientAccountNumber;
  }

  @JsonProperty("patient_name")
  public Optional<String> getPatientName() {
    return patientName;
  }

  @JsonProperty("patient_payer_number")
  public Optional<String> getPatientPayerNumber() {
    return patientPayerNumber;
  }

  @JsonProperty("patient_responsibility")
  public Optional<Integer> getPatientResponsibility() {
    return patientResponsibility;
  }

  @JsonProperty("policy_holder")
  public PolicyHolder getPolicyHolder() {
    return policyHolder;
  }

  @JsonProperty("processed_on")
  public Optional<String> getProcessedOn() {
    return processedOn;
  }

  @JsonProperty("recrawl_requested")
  public Optional<Boolean> getRecrawlRequested() {
    return recrawlRequested;
  }

  @JsonProperty("reduction")
  public Optional<Integer> getReduction() {
    return reduction;
  }

  @JsonProperty("remarks")
  public Optional<String> getRemarks() {
    return remarks;
  }

  @JsonProperty("service_provider")
  public Optional<String> getServiceProvider() {
    return serviceProvider;
  }

  @JsonProperty("service_provider_address")
  public Optional<String> getServiceProviderAddress() {
    return serviceProviderAddress;
  }

  @JsonProperty("service_provider_billing_address")
  public Optional<String> getServiceProviderBillingAddress() {
    return serviceProviderBillingAddress;
  }

  @JsonProperty("service_provider_billing_name")
  public Optional<String> getServiceProviderBillingName() {
    return serviceProviderBillingName;
  }

  @JsonProperty("service_provider_billing_npi_number")
  public Optional<Integer> getServiceProviderBillingNpiNumber() {
    return serviceProviderBillingNpiNumber;
  }

  @JsonProperty("service_provider_billing_number")
  public Optional<String> getServiceProviderBillingNumber() {
    return serviceProviderBillingNumber;
  }

  @JsonProperty("service_provider_billing_phone")
  public Optional<String> getServiceProviderBillingPhone() {
    return serviceProviderBillingPhone;
  }

  @JsonProperty("service_provider_npi_number")
  public Optional<Integer> getServiceProviderNpiNumber() {
    return serviceProviderNpiNumber;
  }

  @JsonProperty("service_provider_number")
  public Optional<String> getServiceProviderNumber() {
    return serviceProviderNumber;
  }

  @JsonProperty("status")
  public Optional<ClaimStatus> getStatus() {
    return status;
  }

  @JsonProperty("type")
  public Optional<ClaimType> getType() {
    return type;
  }

  @JsonProperty("uuid")
  public Optional<UUID> getUuid() {
    return uuid;
  }

  @JsonProperty("vendor_system_id")
  public Optional<String> getVendorSystemId() {
    return vendorSystemId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Claim && equalTo((Claim) other);
  }

  private boolean equalTo(Claim other) {
    return amountAllowed.equals(other.amountAllowed) && amountBilled.equals(other.amountBilled) && amountNotCovered.equals(other.amountNotCovered) && amountPaid.equals(other.amountPaid) && amountPaidOther.equals(other.amountPaidOther) && checkDate.equals(other.checkDate) && checkNumber.equals(other.checkNumber) && claimMedicalLines.equals(other.claimMedicalLines) && coinsurancePatient.equals(other.coinsurancePatient) && computedAmountAllowed.equals(other.computedAmountAllowed) && computedAmountBilled.equals(other.computedAmountBilled) && computedAmountPaid.equals(other.computedAmountPaid) && computedCoinsurancePatient.equals(other.computedCoinsurancePatient) && computedCopayment.equals(other.computedCopayment) && computedPatientResponsibility.equals(other.computedPatientResponsibility) && computedReduction.equals(other.computedReduction) && copayment.equals(other.copayment) && createddate.equals(other.createddate) && dataobjectId.equals(other.dataobjectId) && dateColumn.equals(other.dateColumn) && dateOfService.equals(other.dateOfService) && discount.equals(other.discount) && eobDate.equals(other.eobDate) && groupName.equals(other.groupName) && groupNumber.equals(other.groupNumber) && id.equals(other.id) && incurredValue.equals(other.incurredValue) && isIncomplete == other.isIncomplete && lastUpdatedStatus.equals(other.lastUpdatedStatus) && members.equals(other.members) && modifieddate.equals(other.modifieddate) && network.equals(other.network) && patientAccountNumber.equals(other.patientAccountNumber) && patientName.equals(other.patientName) && patientPayerNumber.equals(other.patientPayerNumber) && patientResponsibility.equals(other.patientResponsibility) && policyHolder.equals(other.policyHolder) && processedOn.equals(other.processedOn) && recrawlRequested.equals(other.recrawlRequested) && reduction.equals(other.reduction) && remarks.equals(other.remarks) && serviceProvider.equals(other.serviceProvider) && serviceProviderAddress.equals(other.serviceProviderAddress) && serviceProviderBillingAddress.equals(other.serviceProviderBillingAddress) && serviceProviderBillingName.equals(other.serviceProviderBillingName) && serviceProviderBillingNpiNumber.equals(other.serviceProviderBillingNpiNumber) && serviceProviderBillingNumber.equals(other.serviceProviderBillingNumber) && serviceProviderBillingPhone.equals(other.serviceProviderBillingPhone) && serviceProviderNpiNumber.equals(other.serviceProviderNpiNumber) && serviceProviderNumber.equals(other.serviceProviderNumber) && status.equals(other.status) && type.equals(other.type) && uuid.equals(other.uuid) && vendorSystemId.equals(other.vendorSystemId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.amountAllowed, this.amountBilled, this.amountNotCovered, this.amountPaid, this.amountPaidOther, this.checkDate, this.checkNumber, this.claimMedicalLines, this.coinsurancePatient, this.computedAmountAllowed, this.computedAmountBilled, this.computedAmountPaid, this.computedCoinsurancePatient, this.computedCopayment, this.computedPatientResponsibility, this.computedReduction, this.copayment, this.createddate, this.dataobjectId, this.dateColumn, this.dateOfService, this.discount, this.eobDate, this.groupName, this.groupNumber, this.id, this.incurredValue, this.isIncomplete, this.lastUpdatedStatus, this.members, this.modifieddate, this.network, this.patientAccountNumber, this.patientName, this.patientPayerNumber, this.patientResponsibility, this.policyHolder, this.processedOn, this.recrawlRequested, this.reduction, this.remarks, this.serviceProvider, this.serviceProviderAddress, this.serviceProviderBillingAddress, this.serviceProviderBillingName, this.serviceProviderBillingNpiNumber, this.serviceProviderBillingNumber, this.serviceProviderBillingPhone, this.serviceProviderNpiNumber, this.serviceProviderNumber, this.status, this.type, this.uuid, this.vendorSystemId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Claim{" + "amountAllowed: " + amountAllowed + ", amountBilled: " + amountBilled + ", amountNotCovered: " + amountNotCovered + ", amountPaid: " + amountPaid + ", amountPaidOther: " + amountPaidOther + ", checkDate: " + checkDate + ", checkNumber: " + checkNumber + ", claimMedicalLines: " + claimMedicalLines + ", coinsurancePatient: " + coinsurancePatient + ", computedAmountAllowed: " + computedAmountAllowed + ", computedAmountBilled: " + computedAmountBilled + ", computedAmountPaid: " + computedAmountPaid + ", computedCoinsurancePatient: " + computedCoinsurancePatient + ", computedCopayment: " + computedCopayment + ", computedPatientResponsibility: " + computedPatientResponsibility + ", computedReduction: " + computedReduction + ", copayment: " + copayment + ", createddate: " + createddate + ", dataobjectId: " + dataobjectId + ", dateColumn: " + dateColumn + ", dateOfService: " + dateOfService + ", discount: " + discount + ", eobDate: " + eobDate + ", groupName: " + groupName + ", groupNumber: " + groupNumber + ", id: " + id + ", incurredValue: " + incurredValue + ", isIncomplete: " + isIncomplete + ", lastUpdatedStatus: " + lastUpdatedStatus + ", members: " + members + ", modifieddate: " + modifieddate + ", network: " + network + ", patientAccountNumber: " + patientAccountNumber + ", patientName: " + patientName + ", patientPayerNumber: " + patientPayerNumber + ", patientResponsibility: " + patientResponsibility + ", policyHolder: " + policyHolder + ", processedOn: " + processedOn + ", recrawlRequested: " + recrawlRequested + ", reduction: " + reduction + ", remarks: " + remarks + ", serviceProvider: " + serviceProvider + ", serviceProviderAddress: " + serviceProviderAddress + ", serviceProviderBillingAddress: " + serviceProviderBillingAddress + ", serviceProviderBillingName: " + serviceProviderBillingName + ", serviceProviderBillingNpiNumber: " + serviceProviderBillingNpiNumber + ", serviceProviderBillingNumber: " + serviceProviderBillingNumber + ", serviceProviderBillingPhone: " + serviceProviderBillingPhone + ", serviceProviderNpiNumber: " + serviceProviderNpiNumber + ", serviceProviderNumber: " + serviceProviderNumber + ", status: " + status + ", type: " + type + ", uuid: " + uuid + ", vendorSystemId: " + vendorSystemId + "}";
  }

  public static IsIncompleteStage builder() {
    return new Builder();
  }

  public interface IsIncompleteStage {
    PolicyHolderStage isIncomplete(boolean isIncomplete);

    Builder from(Claim other);
  }

  public interface PolicyHolderStage {
    _FinalStage policyHolder(PolicyHolder policyHolder);
  }

  public interface _FinalStage {
    Claim build();

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

    _FinalStage checkDate(Optional<String> checkDate);

    _FinalStage checkDate(String checkDate);

    _FinalStage checkNumber(Optional<String> checkNumber);

    _FinalStage checkNumber(String checkNumber);

    _FinalStage claimMedicalLines(List<ClaimLine> claimMedicalLines);

    _FinalStage claimMedicalLines(ClaimLine claimMedicalLines);

    _FinalStage addAllClaimMedicalLines(List<ClaimLine> claimMedicalLines);

    _FinalStage coinsurancePatient(Optional<Integer> coinsurancePatient);

    _FinalStage coinsurancePatient(Integer coinsurancePatient);

    _FinalStage computedAmountAllowed(Optional<Integer> computedAmountAllowed);

    _FinalStage computedAmountAllowed(Integer computedAmountAllowed);

    _FinalStage computedAmountBilled(Optional<Integer> computedAmountBilled);

    _FinalStage computedAmountBilled(Integer computedAmountBilled);

    _FinalStage computedAmountPaid(Optional<Integer> computedAmountPaid);

    _FinalStage computedAmountPaid(Integer computedAmountPaid);

    _FinalStage computedCoinsurancePatient(Optional<Integer> computedCoinsurancePatient);

    _FinalStage computedCoinsurancePatient(Integer computedCoinsurancePatient);

    _FinalStage computedCopayment(Optional<Integer> computedCopayment);

    _FinalStage computedCopayment(Integer computedCopayment);

    _FinalStage computedPatientResponsibility(Optional<Integer> computedPatientResponsibility);

    _FinalStage computedPatientResponsibility(Integer computedPatientResponsibility);

    _FinalStage computedReduction(Optional<Integer> computedReduction);

    _FinalStage computedReduction(Integer computedReduction);

    _FinalStage copayment(Optional<Integer> copayment);

    _FinalStage copayment(Integer copayment);

    _FinalStage createddate(Optional<String> createddate);

    _FinalStage createddate(String createddate);

    _FinalStage dataobjectId(Optional<Integer> dataobjectId);

    _FinalStage dataobjectId(Integer dataobjectId);

    _FinalStage dateColumn(Optional<String> dateColumn);

    _FinalStage dateColumn(String dateColumn);

    _FinalStage dateOfService(Optional<DateRange> dateOfService);

    _FinalStage dateOfService(DateRange dateOfService);

    _FinalStage discount(Optional<Integer> discount);

    _FinalStage discount(Integer discount);

    _FinalStage eobDate(Optional<String> eobDate);

    _FinalStage eobDate(String eobDate);

    _FinalStage groupName(Optional<String> groupName);

    _FinalStage groupName(String groupName);

    _FinalStage groupNumber(Optional<String> groupNumber);

    _FinalStage groupNumber(String groupNumber);

    _FinalStage id(Optional<Integer> id);

    _FinalStage id(Integer id);

    _FinalStage incurredValue(Optional<Integer> incurredValue);

    _FinalStage incurredValue(Integer incurredValue);

    _FinalStage lastUpdatedStatus(Optional<String> lastUpdatedStatus);

    _FinalStage lastUpdatedStatus(String lastUpdatedStatus);

    _FinalStage members(Optional<List<Member>> members);

    _FinalStage members(List<Member> members);

    _FinalStage modifieddate(Optional<String> modifieddate);

    _FinalStage modifieddate(String modifieddate);

    _FinalStage network(Optional<Network> network);

    _FinalStage network(Network network);

    _FinalStage patientAccountNumber(Optional<String> patientAccountNumber);

    _FinalStage patientAccountNumber(String patientAccountNumber);

    _FinalStage patientName(Optional<String> patientName);

    _FinalStage patientName(String patientName);

    _FinalStage patientPayerNumber(Optional<String> patientPayerNumber);

    _FinalStage patientPayerNumber(String patientPayerNumber);

    _FinalStage patientResponsibility(Optional<Integer> patientResponsibility);

    _FinalStage patientResponsibility(Integer patientResponsibility);

    _FinalStage processedOn(Optional<String> processedOn);

    _FinalStage processedOn(String processedOn);

    _FinalStage recrawlRequested(Optional<Boolean> recrawlRequested);

    _FinalStage recrawlRequested(Boolean recrawlRequested);

    _FinalStage reduction(Optional<Integer> reduction);

    _FinalStage reduction(Integer reduction);

    _FinalStage remarks(Optional<String> remarks);

    _FinalStage remarks(String remarks);

    _FinalStage serviceProvider(Optional<String> serviceProvider);

    _FinalStage serviceProvider(String serviceProvider);

    _FinalStage serviceProviderAddress(Optional<String> serviceProviderAddress);

    _FinalStage serviceProviderAddress(String serviceProviderAddress);

    _FinalStage serviceProviderBillingAddress(Optional<String> serviceProviderBillingAddress);

    _FinalStage serviceProviderBillingAddress(String serviceProviderBillingAddress);

    _FinalStage serviceProviderBillingName(Optional<String> serviceProviderBillingName);

    _FinalStage serviceProviderBillingName(String serviceProviderBillingName);

    _FinalStage serviceProviderBillingNpiNumber(Optional<Integer> serviceProviderBillingNpiNumber);

    _FinalStage serviceProviderBillingNpiNumber(Integer serviceProviderBillingNpiNumber);

    _FinalStage serviceProviderBillingNumber(Optional<String> serviceProviderBillingNumber);

    _FinalStage serviceProviderBillingNumber(String serviceProviderBillingNumber);

    _FinalStage serviceProviderBillingPhone(Optional<String> serviceProviderBillingPhone);

    _FinalStage serviceProviderBillingPhone(String serviceProviderBillingPhone);

    _FinalStage serviceProviderNpiNumber(Optional<Integer> serviceProviderNpiNumber);

    _FinalStage serviceProviderNpiNumber(Integer serviceProviderNpiNumber);

    _FinalStage serviceProviderNumber(Optional<String> serviceProviderNumber);

    _FinalStage serviceProviderNumber(String serviceProviderNumber);

    _FinalStage status(Optional<ClaimStatus> status);

    _FinalStage status(ClaimStatus status);

    _FinalStage type(Optional<ClaimType> type);

    _FinalStage type(ClaimType type);

    _FinalStage uuid(Optional<UUID> uuid);

    _FinalStage uuid(UUID uuid);

    _FinalStage vendorSystemId(Optional<String> vendorSystemId);

    _FinalStage vendorSystemId(String vendorSystemId);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  static final class Builder implements IsIncompleteStage, PolicyHolderStage, _FinalStage {
    private boolean isIncomplete;

    private PolicyHolder policyHolder;

    private Optional<String> vendorSystemId = Optional.empty();

    private Optional<UUID> uuid = Optional.empty();

    private Optional<ClaimType> type = Optional.empty();

    private Optional<ClaimStatus> status = Optional.empty();

    private Optional<String> serviceProviderNumber = Optional.empty();

    private Optional<Integer> serviceProviderNpiNumber = Optional.empty();

    private Optional<String> serviceProviderBillingPhone = Optional.empty();

    private Optional<String> serviceProviderBillingNumber = Optional.empty();

    private Optional<Integer> serviceProviderBillingNpiNumber = Optional.empty();

    private Optional<String> serviceProviderBillingName = Optional.empty();

    private Optional<String> serviceProviderBillingAddress = Optional.empty();

    private Optional<String> serviceProviderAddress = Optional.empty();

    private Optional<String> serviceProvider = Optional.empty();

    private Optional<String> remarks = Optional.empty();

    private Optional<Integer> reduction = Optional.empty();

    private Optional<Boolean> recrawlRequested = Optional.empty();

    private Optional<String> processedOn = Optional.empty();

    private Optional<Integer> patientResponsibility = Optional.empty();

    private Optional<String> patientPayerNumber = Optional.empty();

    private Optional<String> patientName = Optional.empty();

    private Optional<String> patientAccountNumber = Optional.empty();

    private Optional<Network> network = Optional.empty();

    private Optional<String> modifieddate = Optional.empty();

    private Optional<List<Member>> members = Optional.empty();

    private Optional<String> lastUpdatedStatus = Optional.empty();

    private Optional<Integer> incurredValue = Optional.empty();

    private Optional<Integer> id = Optional.empty();

    private Optional<String> groupNumber = Optional.empty();

    private Optional<String> groupName = Optional.empty();

    private Optional<String> eobDate = Optional.empty();

    private Optional<Integer> discount = Optional.empty();

    private Optional<DateRange> dateOfService = Optional.empty();

    private Optional<String> dateColumn = Optional.empty();

    private Optional<Integer> dataobjectId = Optional.empty();

    private Optional<String> createddate = Optional.empty();

    private Optional<Integer> copayment = Optional.empty();

    private Optional<Integer> computedReduction = Optional.empty();

    private Optional<Integer> computedPatientResponsibility = Optional.empty();

    private Optional<Integer> computedCopayment = Optional.empty();

    private Optional<Integer> computedCoinsurancePatient = Optional.empty();

    private Optional<Integer> computedAmountPaid = Optional.empty();

    private Optional<Integer> computedAmountBilled = Optional.empty();

    private Optional<Integer> computedAmountAllowed = Optional.empty();

    private Optional<Integer> coinsurancePatient = Optional.empty();

    private List<ClaimLine> claimMedicalLines = new ArrayList<>();

    private Optional<String> checkNumber = Optional.empty();

    private Optional<String> checkDate = Optional.empty();

    private Optional<Integer> amountPaidOther = Optional.empty();

    private Optional<Integer> amountPaid = Optional.empty();

    private Optional<Integer> amountNotCovered = Optional.empty();

    private Optional<Integer> amountBilled = Optional.empty();

    private Optional<Integer> amountAllowed = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(Claim other) {
      amountAllowed(other.getAmountAllowed());
      amountBilled(other.getAmountBilled());
      amountNotCovered(other.getAmountNotCovered());
      amountPaid(other.getAmountPaid());
      amountPaidOther(other.getAmountPaidOther());
      checkDate(other.getCheckDate());
      checkNumber(other.getCheckNumber());
      claimMedicalLines(other.getClaimMedicalLines());
      coinsurancePatient(other.getCoinsurancePatient());
      computedAmountAllowed(other.getComputedAmountAllowed());
      computedAmountBilled(other.getComputedAmountBilled());
      computedAmountPaid(other.getComputedAmountPaid());
      computedCoinsurancePatient(other.getComputedCoinsurancePatient());
      computedCopayment(other.getComputedCopayment());
      computedPatientResponsibility(other.getComputedPatientResponsibility());
      computedReduction(other.getComputedReduction());
      copayment(other.getCopayment());
      createddate(other.getCreateddate());
      dataobjectId(other.getDataobjectId());
      dateColumn(other.getDateColumn());
      dateOfService(other.getDateOfService());
      discount(other.getDiscount());
      eobDate(other.getEobDate());
      groupName(other.getGroupName());
      groupNumber(other.getGroupNumber());
      id(other.getId());
      incurredValue(other.getIncurredValue());
      isIncomplete(other.getIsIncomplete());
      lastUpdatedStatus(other.getLastUpdatedStatus());
      members(other.getMembers());
      modifieddate(other.getModifieddate());
      network(other.getNetwork());
      patientAccountNumber(other.getPatientAccountNumber());
      patientName(other.getPatientName());
      patientPayerNumber(other.getPatientPayerNumber());
      patientResponsibility(other.getPatientResponsibility());
      policyHolder(other.getPolicyHolder());
      processedOn(other.getProcessedOn());
      recrawlRequested(other.getRecrawlRequested());
      reduction(other.getReduction());
      remarks(other.getRemarks());
      serviceProvider(other.getServiceProvider());
      serviceProviderAddress(other.getServiceProviderAddress());
      serviceProviderBillingAddress(other.getServiceProviderBillingAddress());
      serviceProviderBillingName(other.getServiceProviderBillingName());
      serviceProviderBillingNpiNumber(other.getServiceProviderBillingNpiNumber());
      serviceProviderBillingNumber(other.getServiceProviderBillingNumber());
      serviceProviderBillingPhone(other.getServiceProviderBillingPhone());
      serviceProviderNpiNumber(other.getServiceProviderNpiNumber());
      serviceProviderNumber(other.getServiceProviderNumber());
      status(other.getStatus());
      type(other.getType());
      uuid(other.getUuid());
      vendorSystemId(other.getVendorSystemId());
      return this;
    }

    @Override
    @JsonSetter("is_incomplete")
    public PolicyHolderStage isIncomplete(boolean isIncomplete) {
      this.isIncomplete = isIncomplete;
      return this;
    }

    @Override
    @JsonSetter("policy_holder")
    public _FinalStage policyHolder(PolicyHolder policyHolder) {
      this.policyHolder = policyHolder;
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
    public _FinalStage uuid(UUID uuid) {
      this.uuid = Optional.of(uuid);
      return this;
    }

    @Override
    @JsonSetter(
        value = "uuid",
        nulls = Nulls.SKIP
    )
    public _FinalStage uuid(Optional<UUID> uuid) {
      this.uuid = uuid;
      return this;
    }

    @Override
    public _FinalStage type(ClaimType type) {
      this.type = Optional.of(type);
      return this;
    }

    @Override
    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public _FinalStage type(Optional<ClaimType> type) {
      this.type = type;
      return this;
    }

    @Override
    public _FinalStage status(ClaimStatus status) {
      this.status = Optional.of(status);
      return this;
    }

    @Override
    @JsonSetter(
        value = "status",
        nulls = Nulls.SKIP
    )
    public _FinalStage status(Optional<ClaimStatus> status) {
      this.status = status;
      return this;
    }

    @Override
    public _FinalStage serviceProviderNumber(String serviceProviderNumber) {
      this.serviceProviderNumber = Optional.of(serviceProviderNumber);
      return this;
    }

    @Override
    @JsonSetter(
        value = "service_provider_number",
        nulls = Nulls.SKIP
    )
    public _FinalStage serviceProviderNumber(Optional<String> serviceProviderNumber) {
      this.serviceProviderNumber = serviceProviderNumber;
      return this;
    }

    @Override
    public _FinalStage serviceProviderNpiNumber(Integer serviceProviderNpiNumber) {
      this.serviceProviderNpiNumber = Optional.of(serviceProviderNpiNumber);
      return this;
    }

    @Override
    @JsonSetter(
        value = "service_provider_npi_number",
        nulls = Nulls.SKIP
    )
    public _FinalStage serviceProviderNpiNumber(Optional<Integer> serviceProviderNpiNumber) {
      this.serviceProviderNpiNumber = serviceProviderNpiNumber;
      return this;
    }

    @Override
    public _FinalStage serviceProviderBillingPhone(String serviceProviderBillingPhone) {
      this.serviceProviderBillingPhone = Optional.of(serviceProviderBillingPhone);
      return this;
    }

    @Override
    @JsonSetter(
        value = "service_provider_billing_phone",
        nulls = Nulls.SKIP
    )
    public _FinalStage serviceProviderBillingPhone(Optional<String> serviceProviderBillingPhone) {
      this.serviceProviderBillingPhone = serviceProviderBillingPhone;
      return this;
    }

    @Override
    public _FinalStage serviceProviderBillingNumber(String serviceProviderBillingNumber) {
      this.serviceProviderBillingNumber = Optional.of(serviceProviderBillingNumber);
      return this;
    }

    @Override
    @JsonSetter(
        value = "service_provider_billing_number",
        nulls = Nulls.SKIP
    )
    public _FinalStage serviceProviderBillingNumber(Optional<String> serviceProviderBillingNumber) {
      this.serviceProviderBillingNumber = serviceProviderBillingNumber;
      return this;
    }

    @Override
    public _FinalStage serviceProviderBillingNpiNumber(Integer serviceProviderBillingNpiNumber) {
      this.serviceProviderBillingNpiNumber = Optional.of(serviceProviderBillingNpiNumber);
      return this;
    }

    @Override
    @JsonSetter(
        value = "service_provider_billing_npi_number",
        nulls = Nulls.SKIP
    )
    public _FinalStage serviceProviderBillingNpiNumber(
        Optional<Integer> serviceProviderBillingNpiNumber) {
      this.serviceProviderBillingNpiNumber = serviceProviderBillingNpiNumber;
      return this;
    }

    @Override
    public _FinalStage serviceProviderBillingName(String serviceProviderBillingName) {
      this.serviceProviderBillingName = Optional.of(serviceProviderBillingName);
      return this;
    }

    @Override
    @JsonSetter(
        value = "service_provider_billing_name",
        nulls = Nulls.SKIP
    )
    public _FinalStage serviceProviderBillingName(Optional<String> serviceProviderBillingName) {
      this.serviceProviderBillingName = serviceProviderBillingName;
      return this;
    }

    @Override
    public _FinalStage serviceProviderBillingAddress(String serviceProviderBillingAddress) {
      this.serviceProviderBillingAddress = Optional.of(serviceProviderBillingAddress);
      return this;
    }

    @Override
    @JsonSetter(
        value = "service_provider_billing_address",
        nulls = Nulls.SKIP
    )
    public _FinalStage serviceProviderBillingAddress(
        Optional<String> serviceProviderBillingAddress) {
      this.serviceProviderBillingAddress = serviceProviderBillingAddress;
      return this;
    }

    @Override
    public _FinalStage serviceProviderAddress(String serviceProviderAddress) {
      this.serviceProviderAddress = Optional.of(serviceProviderAddress);
      return this;
    }

    @Override
    @JsonSetter(
        value = "service_provider_address",
        nulls = Nulls.SKIP
    )
    public _FinalStage serviceProviderAddress(Optional<String> serviceProviderAddress) {
      this.serviceProviderAddress = serviceProviderAddress;
      return this;
    }

    @Override
    public _FinalStage serviceProvider(String serviceProvider) {
      this.serviceProvider = Optional.of(serviceProvider);
      return this;
    }

    @Override
    @JsonSetter(
        value = "service_provider",
        nulls = Nulls.SKIP
    )
    public _FinalStage serviceProvider(Optional<String> serviceProvider) {
      this.serviceProvider = serviceProvider;
      return this;
    }

    @Override
    public _FinalStage remarks(String remarks) {
      this.remarks = Optional.of(remarks);
      return this;
    }

    @Override
    @JsonSetter(
        value = "remarks",
        nulls = Nulls.SKIP
    )
    public _FinalStage remarks(Optional<String> remarks) {
      this.remarks = remarks;
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
    public _FinalStage recrawlRequested(Boolean recrawlRequested) {
      this.recrawlRequested = Optional.of(recrawlRequested);
      return this;
    }

    @Override
    @JsonSetter(
        value = "recrawl_requested",
        nulls = Nulls.SKIP
    )
    public _FinalStage recrawlRequested(Optional<Boolean> recrawlRequested) {
      this.recrawlRequested = recrawlRequested;
      return this;
    }

    @Override
    public _FinalStage processedOn(String processedOn) {
      this.processedOn = Optional.of(processedOn);
      return this;
    }

    @Override
    @JsonSetter(
        value = "processed_on",
        nulls = Nulls.SKIP
    )
    public _FinalStage processedOn(Optional<String> processedOn) {
      this.processedOn = processedOn;
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
    public _FinalStage patientPayerNumber(String patientPayerNumber) {
      this.patientPayerNumber = Optional.of(patientPayerNumber);
      return this;
    }

    @Override
    @JsonSetter(
        value = "patient_payer_number",
        nulls = Nulls.SKIP
    )
    public _FinalStage patientPayerNumber(Optional<String> patientPayerNumber) {
      this.patientPayerNumber = patientPayerNumber;
      return this;
    }

    @Override
    public _FinalStage patientName(String patientName) {
      this.patientName = Optional.of(patientName);
      return this;
    }

    @Override
    @JsonSetter(
        value = "patient_name",
        nulls = Nulls.SKIP
    )
    public _FinalStage patientName(Optional<String> patientName) {
      this.patientName = patientName;
      return this;
    }

    @Override
    public _FinalStage patientAccountNumber(String patientAccountNumber) {
      this.patientAccountNumber = Optional.of(patientAccountNumber);
      return this;
    }

    @Override
    @JsonSetter(
        value = "patient_account_number",
        nulls = Nulls.SKIP
    )
    public _FinalStage patientAccountNumber(Optional<String> patientAccountNumber) {
      this.patientAccountNumber = patientAccountNumber;
      return this;
    }

    @Override
    public _FinalStage network(Network network) {
      this.network = Optional.of(network);
      return this;
    }

    @Override
    @JsonSetter(
        value = "network",
        nulls = Nulls.SKIP
    )
    public _FinalStage network(Optional<Network> network) {
      this.network = network;
      return this;
    }

    @Override
    public _FinalStage modifieddate(String modifieddate) {
      this.modifieddate = Optional.of(modifieddate);
      return this;
    }

    @Override
    @JsonSetter(
        value = "modifieddate",
        nulls = Nulls.SKIP
    )
    public _FinalStage modifieddate(Optional<String> modifieddate) {
      this.modifieddate = modifieddate;
      return this;
    }

    @Override
    public _FinalStage members(List<Member> members) {
      this.members = Optional.of(members);
      return this;
    }

    @Override
    @JsonSetter(
        value = "members",
        nulls = Nulls.SKIP
    )
    public _FinalStage members(Optional<List<Member>> members) {
      this.members = members;
      return this;
    }

    @Override
    public _FinalStage lastUpdatedStatus(String lastUpdatedStatus) {
      this.lastUpdatedStatus = Optional.of(lastUpdatedStatus);
      return this;
    }

    @Override
    @JsonSetter(
        value = "last_updated_status",
        nulls = Nulls.SKIP
    )
    public _FinalStage lastUpdatedStatus(Optional<String> lastUpdatedStatus) {
      this.lastUpdatedStatus = lastUpdatedStatus;
      return this;
    }

    @Override
    public _FinalStage incurredValue(Integer incurredValue) {
      this.incurredValue = Optional.of(incurredValue);
      return this;
    }

    @Override
    @JsonSetter(
        value = "incurred_value",
        nulls = Nulls.SKIP
    )
    public _FinalStage incurredValue(Optional<Integer> incurredValue) {
      this.incurredValue = incurredValue;
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
    public _FinalStage groupNumber(String groupNumber) {
      this.groupNumber = Optional.of(groupNumber);
      return this;
    }

    @Override
    @JsonSetter(
        value = "group_number",
        nulls = Nulls.SKIP
    )
    public _FinalStage groupNumber(Optional<String> groupNumber) {
      this.groupNumber = groupNumber;
      return this;
    }

    @Override
    public _FinalStage groupName(String groupName) {
      this.groupName = Optional.of(groupName);
      return this;
    }

    @Override
    @JsonSetter(
        value = "group_name",
        nulls = Nulls.SKIP
    )
    public _FinalStage groupName(Optional<String> groupName) {
      this.groupName = groupName;
      return this;
    }

    @Override
    public _FinalStage eobDate(String eobDate) {
      this.eobDate = Optional.of(eobDate);
      return this;
    }

    @Override
    @JsonSetter(
        value = "eob_date",
        nulls = Nulls.SKIP
    )
    public _FinalStage eobDate(Optional<String> eobDate) {
      this.eobDate = eobDate;
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
    public _FinalStage dateOfService(DateRange dateOfService) {
      this.dateOfService = Optional.of(dateOfService);
      return this;
    }

    @Override
    @JsonSetter(
        value = "date_of_service",
        nulls = Nulls.SKIP
    )
    public _FinalStage dateOfService(Optional<DateRange> dateOfService) {
      this.dateOfService = dateOfService;
      return this;
    }

    @Override
    public _FinalStage dateColumn(String dateColumn) {
      this.dateColumn = Optional.of(dateColumn);
      return this;
    }

    @Override
    @JsonSetter(
        value = "date_column",
        nulls = Nulls.SKIP
    )
    public _FinalStage dateColumn(Optional<String> dateColumn) {
      this.dateColumn = dateColumn;
      return this;
    }

    @Override
    public _FinalStage dataobjectId(Integer dataobjectId) {
      this.dataobjectId = Optional.of(dataobjectId);
      return this;
    }

    @Override
    @JsonSetter(
        value = "dataobject_id",
        nulls = Nulls.SKIP
    )
    public _FinalStage dataobjectId(Optional<Integer> dataobjectId) {
      this.dataobjectId = dataobjectId;
      return this;
    }

    @Override
    public _FinalStage createddate(String createddate) {
      this.createddate = Optional.of(createddate);
      return this;
    }

    @Override
    @JsonSetter(
        value = "createddate",
        nulls = Nulls.SKIP
    )
    public _FinalStage createddate(Optional<String> createddate) {
      this.createddate = createddate;
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
    public _FinalStage computedReduction(Integer computedReduction) {
      this.computedReduction = Optional.of(computedReduction);
      return this;
    }

    @Override
    @JsonSetter(
        value = "computed_reduction",
        nulls = Nulls.SKIP
    )
    public _FinalStage computedReduction(Optional<Integer> computedReduction) {
      this.computedReduction = computedReduction;
      return this;
    }

    @Override
    public _FinalStage computedPatientResponsibility(Integer computedPatientResponsibility) {
      this.computedPatientResponsibility = Optional.of(computedPatientResponsibility);
      return this;
    }

    @Override
    @JsonSetter(
        value = "computed_patient_responsibility",
        nulls = Nulls.SKIP
    )
    public _FinalStage computedPatientResponsibility(
        Optional<Integer> computedPatientResponsibility) {
      this.computedPatientResponsibility = computedPatientResponsibility;
      return this;
    }

    @Override
    public _FinalStage computedCopayment(Integer computedCopayment) {
      this.computedCopayment = Optional.of(computedCopayment);
      return this;
    }

    @Override
    @JsonSetter(
        value = "computed_copayment",
        nulls = Nulls.SKIP
    )
    public _FinalStage computedCopayment(Optional<Integer> computedCopayment) {
      this.computedCopayment = computedCopayment;
      return this;
    }

    @Override
    public _FinalStage computedCoinsurancePatient(Integer computedCoinsurancePatient) {
      this.computedCoinsurancePatient = Optional.of(computedCoinsurancePatient);
      return this;
    }

    @Override
    @JsonSetter(
        value = "computed_coinsurance_patient",
        nulls = Nulls.SKIP
    )
    public _FinalStage computedCoinsurancePatient(Optional<Integer> computedCoinsurancePatient) {
      this.computedCoinsurancePatient = computedCoinsurancePatient;
      return this;
    }

    @Override
    public _FinalStage computedAmountPaid(Integer computedAmountPaid) {
      this.computedAmountPaid = Optional.of(computedAmountPaid);
      return this;
    }

    @Override
    @JsonSetter(
        value = "computed_amount_paid",
        nulls = Nulls.SKIP
    )
    public _FinalStage computedAmountPaid(Optional<Integer> computedAmountPaid) {
      this.computedAmountPaid = computedAmountPaid;
      return this;
    }

    @Override
    public _FinalStage computedAmountBilled(Integer computedAmountBilled) {
      this.computedAmountBilled = Optional.of(computedAmountBilled);
      return this;
    }

    @Override
    @JsonSetter(
        value = "computed_amount_billed",
        nulls = Nulls.SKIP
    )
    public _FinalStage computedAmountBilled(Optional<Integer> computedAmountBilled) {
      this.computedAmountBilled = computedAmountBilled;
      return this;
    }

    @Override
    public _FinalStage computedAmountAllowed(Integer computedAmountAllowed) {
      this.computedAmountAllowed = Optional.of(computedAmountAllowed);
      return this;
    }

    @Override
    @JsonSetter(
        value = "computed_amount_allowed",
        nulls = Nulls.SKIP
    )
    public _FinalStage computedAmountAllowed(Optional<Integer> computedAmountAllowed) {
      this.computedAmountAllowed = computedAmountAllowed;
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
    public _FinalStage addAllClaimMedicalLines(List<ClaimLine> claimMedicalLines) {
      this.claimMedicalLines.addAll(claimMedicalLines);
      return this;
    }

    @Override
    public _FinalStage claimMedicalLines(ClaimLine claimMedicalLines) {
      this.claimMedicalLines.add(claimMedicalLines);
      return this;
    }

    @Override
    @JsonSetter(
        value = "claim_medical_lines",
        nulls = Nulls.SKIP
    )
    public _FinalStage claimMedicalLines(List<ClaimLine> claimMedicalLines) {
      this.claimMedicalLines.clear();
      this.claimMedicalLines.addAll(claimMedicalLines);
      return this;
    }

    @Override
    public _FinalStage checkNumber(String checkNumber) {
      this.checkNumber = Optional.of(checkNumber);
      return this;
    }

    @Override
    @JsonSetter(
        value = "check_number",
        nulls = Nulls.SKIP
    )
    public _FinalStage checkNumber(Optional<String> checkNumber) {
      this.checkNumber = checkNumber;
      return this;
    }

    @Override
    public _FinalStage checkDate(String checkDate) {
      this.checkDate = Optional.of(checkDate);
      return this;
    }

    @Override
    @JsonSetter(
        value = "check_date",
        nulls = Nulls.SKIP
    )
    public _FinalStage checkDate(Optional<String> checkDate) {
      this.checkDate = checkDate;
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
    public Claim build() {
      return new Claim(amountAllowed, amountBilled, amountNotCovered, amountPaid, amountPaidOther, checkDate, checkNumber, claimMedicalLines, coinsurancePatient, computedAmountAllowed, computedAmountBilled, computedAmountPaid, computedCoinsurancePatient, computedCopayment, computedPatientResponsibility, computedReduction, copayment, createddate, dataobjectId, dateColumn, dateOfService, discount, eobDate, groupName, groupNumber, id, incurredValue, isIncomplete, lastUpdatedStatus, members, modifieddate, network, patientAccountNumber, patientName, patientPayerNumber, patientResponsibility, policyHolder, processedOn, recrawlRequested, reduction, remarks, serviceProvider, serviceProviderAddress, serviceProviderBillingAddress, serviceProviderBillingName, serviceProviderBillingNpiNumber, serviceProviderBillingNumber, serviceProviderBillingPhone, serviceProviderNpiNumber, serviceProviderNumber, status, type, uuid, vendorSystemId);
    }
  }
}
