package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import javax.validation.Valid;
  
/**
 * ConsumerLoanWithIdAndStatus
 */
public class ConsumerLoanWithIdAndStatus   {
  private String productInstanceReference = null;

  private String customerReference = null;

  private String customerAgreementReference = null;

  private String partyReference = null;

  private String customerCreditAssessmentReference = null;

  private String insuranceReference = null;

  private String delinquencyCollectionReference = null;

  private String bankBranchLocationReference = null;

  private String bankAccountingUnitReference = null;

  private String involvedPartyReference = null;

  private String involvedPartyObligationEntitlement = null;

  private String loanType = null;

  private BigDecimal loanAmount = null;

  private String loanCurrency = null;

  private String loanRateType = null;

  private String loanApplicableRate = null;

  private String repaymentType = null;

  private String loanRepaymentSchedule = null;

  private String interestType = null;

  private String interestAccrualMethod = null;

  private String stagedRepaymentStatement = null;

  private String loanOutstandingBalance = null;

  private String loanOriginationDate = null;

  private String loanMaturityDate = null;

  private String collateralReference = null;

  private String collateralAllocation = null;

  private String configurationOptions = null;

  private String taxReference = null;

  private String loanAccessTerms = null;

  private String loanStatus = null;

  private String customerCommentary = null;


  /**
   * `status: Registered` bian-reference:  Loan.LoanAccount(asAccount).Identification iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_E1rHhcTGEeChad0JzLk7QA_-755813725) general-info: loan account number 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Registered` bian-reference:  Loan.Agreement.TradePartyRole(asBorrower)(asRole).Player(asParty) iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633) general-info: loan account holder 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerAgreementReference
  **/

  public String getCustomerAgreementReference() {
    return customerAgreementReference;
  }

  public void setCustomerAgreementReference(String customerAgreementReference) {
    this.customerAgreementReference = customerAgreementReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: LoanAgreement.TradePartyRole(as Borrower)(as Role).Player(as Party).AccountableParty 
   * @return partyReference
  **/

  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerCreditAssessmentReference
  **/

  public String getCustomerCreditAssessmentReference() {
    return customerCreditAssessmentReference;
  }

  public void setCustomerCreditAssessmentReference(String customerCreditAssessmentReference) {
    this.customerCreditAssessmentReference = customerCreditAssessmentReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return insuranceReference
  **/

  public String getInsuranceReference() {
    return insuranceReference;
  }

  public void setInsuranceReference(String insuranceReference) {
    this.insuranceReference = insuranceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return delinquencyCollectionReference
  **/

  public String getDelinquencyCollectionReference() {
    return delinquencyCollectionReference;
  }

  public void setDelinquencyCollectionReference(String delinquencyCollectionReference) {
    this.delinquencyCollectionReference = delinquencyCollectionReference;
  }


  /**
   * `status: Registered` bian-reference:  LoanAgreement.TradePartyRole(asLender)(asRole).Player(asParty).Location iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633/elements/_z2I6YGx5EeKmZJ0Ago--9g_239738909) general-info: for processing/logistics 
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: LoanAgreement.TradePartyRole(as Borrower)(as Role).Player(as Organisation).BusinessUnit general-info: for booking 
   * @return bankAccountingUnitReference
  **/

  public String getBankAccountingUnitReference() {
    return bankAccountingUnitReference;
  }

  public void setBankAccountingUnitReference(String bankAccountingUnitReference) {
    this.bankAccountingUnitReference = bankAccountingUnitReference;
  }


  /**
   * `status: Registered` bian-reference:  LoanAgreement.CollateralPartyRole(asGiverRole) iso-link-1:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EuN0ocTGEeChad0JzLk7QA_1159142715) `status: Registered` bian-reference:  LoanAgreement.CollateralPartyRole(asTakerRole) iso-link-2:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Ex8eFcTGEeChad0JzLk7QA_-1939123823) `status: Registered` bian-reference:  LoanAgreement.GuaranteePartyRole(asGuaranteeBeneficiary) iso-link-3:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EuN0p8TGEeChad0JzLk7QA_-1821987913) `status: Registered` bian-reference:  LoanAgreement.GuaranteePartyRole(asGuarantorRole) iso-link-4:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EuN0psTGEeChad0JzLk7QA_150894546) `status: Registered` bian-reference:  LoanAgreement.LoanProduct.Loan(asAsset).Trade.TradePartyRole(asBorrower) iso-link-5:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_t-Si4N1CEeGAp99n2TKigg_-919072642) `status: Registered` bian-reference:  LoanAgreement.LoanProduct.Loan(asAsset).Trade.TradePartyRole(asLender) iso-link-6:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_t-Si4d1CEeGAp99n2TKigg_-1009340668) general-info: guarantor/cosigner 
   * @return involvedPartyReference
  **/

  public String getInvolvedPartyReference() {
    return involvedPartyReference;
  }

  public void setInvolvedPartyReference(String involvedPartyReference) {
    this.involvedPartyReference = involvedPartyReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return involvedPartyObligationEntitlement
  **/

  public String getInvolvedPartyObligationEntitlement() {
    return involvedPartyObligationEntitlement;
  }

  public void setInvolvedPartyObligationEntitlement(String involvedPartyObligationEntitlement) {
    this.involvedPartyObligationEntitlement = involvedPartyObligationEntitlement;
  }


  /**
   * `status: Provisionally Registered` bian-reference: Loan.LoanType general-info: term, revolving, evergreen 
   * @return loanType
  **/

  public String getLoanType() {
    return loanType;
  }

  public void setLoanType(String loanType) {
    this.loanType = loanType;
  }


  /**
   * `status: Registered` bian-reference:  Loan(asAsset).InvestmentAmount iso-link-1:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FPv0acTGEeChad0JzLk7QA_-150026816/elements/_FepzGcTGEeChad0JzLk7QA_298530288) `status: Registered` bian-reference:  Loan.PrincipalAmount iso-link-2:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_mw1ysHJTEeWwf47VrwMaTQ/elements/_QLjLYHJUEeWwf47VrwMaTQ) 
   * @return loanAmount
  **/

  public BigDecimal getLoanAmount() {
    return loanAmount;
  }

  public void setLoanAmount(BigDecimal loanAmount) {
    this.loanAmount = loanAmount;
  }


  /**
   * `status: Registered` bian-reference:  Loan(asAsset).InvestmentAmount iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FPv0acTGEeChad0JzLk7QA_-150026816/elements/_FepzGcTGEeChad0JzLk7QA_298530288) `status: Registered` bian-reference:  Loan(asDebt).PaymentCurrency iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Ff_P1MTGEeChad0JzLk7QA_-1514166912/elements/_X0hLUKRMEeO1ke9HGqKZhg) `status: Registered` bian-reference:  Loan.PrincipalAmount iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_mw1ysHJTEeWwf47VrwMaTQ/elements/_QLjLYHJUEeWwf47VrwMaTQ) 
   * @return loanCurrency
  **/

  public String getLoanCurrency() {
    return loanCurrency;
  }

  public void setLoanCurrency(String loanCurrency) {
    this.loanCurrency = loanCurrency;
  }


  /**
   * `status: Registered` bian-reference:  Loan(asDebt).NextInterest.VariableInterest.VariableRateChangeFrequency iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fd5lKcTGEeChad0JzLk7QA_-958104524/elements/_FeNHIMTGEeChad0JzLk7QA_-12422289) 
   * @return loanRateType
  **/

  public String getLoanRateType() {
    return loanRateType;
  }

  public void setLoanRateType(String loanRateType) {
    this.loanRateType = loanRateType;
  }


  /**
   * `status: Registered` bian-reference:  Loan(asDebt).NextInterest.VariableInterest iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FXWRMsTGEeChad0JzLk7QA_-398781879/elements/_FXgCNMTGEeChad0JzLk7QA_-129916673) 
   * @return loanApplicableRate
  **/

  public String getLoanApplicableRate() {
    return loanApplicableRate;
  }

  public void setLoanApplicableRate(String loanApplicableRate) {
    this.loanApplicableRate = loanApplicableRate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return repaymentType
  **/

  public String getRepaymentType() {
    return repaymentType;
  }

  public void setRepaymentType(String repaymentType) {
    this.repaymentType = repaymentType;
  }


  /**
   * `status: Registered` bian-reference:  Loan.InterestPaymentsSchedule.PaymentPeriod iso-link-1:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_jF5agJh7EeOUgsYi4EbJBw/elements/_AcedgZh9EeORjJTqwAvaiQ) `status: Registered` bian-reference:  Loan.PrincipalPaymentsSchedule.PaymentPeriod iso-link-2:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_jF5agJh7EeOUgsYi4EbJBw/elements/_AcedgZh9EeORjJTqwAvaiQ) 
   * @return loanRepaymentSchedule
  **/

  public String getLoanRepaymentSchedule() {
    return loanRepaymentSchedule;
  }

  public void setLoanRepaymentSchedule(String loanRepaymentSchedule) {
    this.loanRepaymentSchedule = loanRepaymentSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return interestType
  **/

  public String getInterestType() {
    return interestType;
  }

  public void setInterestType(String interestType) {
    this.interestType = interestType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return interestAccrualMethod
  **/

  public String getInterestAccrualMethod() {
    return interestAccrualMethod;
  }

  public void setInterestAccrualMethod(String interestAccrualMethod) {
    this.interestAccrualMethod = interestAccrualMethod;
  }


  /**
   * `status: Registered` bian-reference:  Loan.InterestPaymentsSchedule.RelatedPaymentObligation.PaymentOffset iso-link-1:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FDPCYMTGEeChad0JzLk7QA_-1131921749/elements/_FDPCacTGEeChad0JzLk7QA_-72272631) `status: Registered` bian-reference:  Loan.PrincipalPaymentsSchedule.RelatedPaymentObligation.PaymentOffset iso-link-2:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FDPCYMTGEeChad0JzLk7QA_-1131921749/elements/_FDPCacTGEeChad0JzLk7QA_-72272632) 
   * @return stagedRepaymentStatement
  **/

  public String getStagedRepaymentStatement() {
    return stagedRepaymentStatement;
  }

  public void setStagedRepaymentStatement(String stagedRepaymentStatement) {
    this.stagedRepaymentStatement = stagedRepaymentStatement;
  }


  /**
   * `status: Registered` bian-reference:  Loan.PrincipalAmount iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_mw1ysHJTEeWwf47VrwMaTQ/elements/_QLjLYHJUEeWwf47VrwMaTQ) 
   * @return loanOutstandingBalance
  **/

  public String getLoanOutstandingBalance() {
    return loanOutstandingBalance;
  }

  public void setLoanOutstandingBalance(String loanOutstandingBalance) {
    this.loanOutstandingBalance = loanOutstandingBalance;
  }


  /**
   * Get loanOriginationDate
   * @return loanOriginationDate
  **/

  public String getLoanOriginationDate() {
    return loanOriginationDate;
  }

  public void setLoanOriginationDate(String loanOriginationDate) {
    this.loanOriginationDate = loanOriginationDate;
  }


  /**
   * Get loanMaturityDate
   * @return loanMaturityDate
  **/

  public String getLoanMaturityDate() {
    return loanMaturityDate;
  }

  public void setLoanMaturityDate(String loanMaturityDate) {
    this.loanMaturityDate = loanMaturityDate;
  }


  /**
   * `status: Registered` bian-reference:  LoanAgreement(asMasterAgreement).CollateralAgreement.Collateral iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E6vNtsTGEeChad0JzLk7QA_393174175/elements/_lrcFQC1hEeGp2Zpvgj9Dtw_-638405304) 
   * @return collateralReference
  **/

  public String getCollateralReference() {
    return collateralReference;
  }

  public void setCollateralReference(String collateralReference) {
    this.collateralReference = collateralReference;
  }


  /**
   * `status: Registered` bian-reference:  LoanAgreement(asMasterAgreement).CollateralAgreement.Collateral.Valuation iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FLlGEcTGEeChad0JzLk7QA_1826831344/elements/_AAYPOmIjEeGD28DQaMef-g) general-info: value applied 
   * @return collateralAllocation
  **/

  public String getCollateralAllocation() {
    return collateralAllocation;
  }

  public void setCollateralAllocation(String collateralAllocation) {
    this.collateralAllocation = collateralAllocation;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  Loan.LoanProduct(asProduct).AvailableOption `status: Provisionally Registered` bian-reference:  Loan.SelectedOption 
   * @return configurationOptions
  **/

  public String getConfigurationOptions() {
    return configurationOptions;
  }

  public void setConfigurationOptions(String configurationOptions) {
    this.configurationOptions = configurationOptions;
  }


  /**
   * `status: Registered` bian-reference:  LoanAgreement.TradePartyRole(asBorrower).Player(asParty).Identification.TaxIdentificationNumber iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FEHzNMTGEeChad0JzLk7QA_-1382123937/elements/_FEHzNcTGEeChad0JzLk7QA_-1792766550) general-info: Tax-Id 
   * @return taxReference
  **/

  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }


  /**
   * `status: Registered` bian-reference:  Loan(asDebt).PrePaymentSpeed iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Ff_P1MTGEeChad0JzLk7QA_-1514166912/elements/_Fg4nt8TGEeChad0JzLk7QA_742037711) `status: Provisionally Registered` bian-reference:  Loan.Limit general-info: allowed payments/withdrawals 
   * @return loanAccessTerms
  **/

  public String getLoanAccessTerms() {
    return loanAccessTerms;
  }

  public void setLoanAccessTerms(String loanAccessTerms) {
    this.loanAccessTerms = loanAccessTerms;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  Loan.LoanStatus general-info: active, overdue, in-suspense, etc. 
   * @return loanStatus
  **/

  public String getLoanStatus() {
    return loanStatus;
  }

  public void setLoanStatus(String loanStatus) {
    this.loanStatus = loanStatus;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerCommentary
  **/

  public String getCustomerCommentary() {
    return customerCommentary;
  }

  public void setCustomerCommentary(String customerCommentary) {
    this.customerCommentary = customerCommentary;
  }


}

