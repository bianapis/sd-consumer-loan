package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ConsumerLoanMaintenanceWithId
 */
public class ConsumerLoanMaintenanceWithId   {
  private String productInstanceReference = null;

  private String productFulfillmentSchedule = null;

  private String reportType = null;

  private Object loanTaxReport = null;

  private String loanFeeType = null;

  private String loanFees = null;

  private String penalties = null;

  private String collateralValuation = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: loan account number 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: tasks, e.g. reporting and loan review actions 
   * @return productFulfillmentSchedule
  **/

  public String getProductFulfillmentSchedule() {
    return productFulfillmentSchedule;
  }

  public void setProductFulfillmentSchedule(String productFulfillmentSchedule) {
    this.productFulfillmentSchedule = productFulfillmentSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code general-info: e.g tax, regulatory, accounting 
   * @return reportType
  **/

  public String getReportType() {
    return reportType;
  }

  public void setReportType(String reportType) {
    this.reportType = reportType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return loanTaxReport
  **/

  public Object getLoanTaxReport() {
    return loanTaxReport;
  }

  public void setLoanTaxReport(Object loanTaxReport) {
    this.loanTaxReport = loanTaxReport;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return loanFeeType
  **/

  public String getLoanFeeType() {
    return loanFeeType;
  }

  public void setLoanFeeType(String loanFeeType) {
    this.loanFeeType = loanFeeType;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  Loan.LoanAccount(asAccount).Adjustment(asCharges) `status: Registered` bian-reference:  Loan.LoanAccount(asAccount).Adjustment(asCharges) iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FMBK9sTGEeChad0JzLk7QA_-398781908) general-info: as booked against loan account 
   * @return loanFees
  **/

  public String getLoanFees() {
    return loanFees;
  }

  public void setLoanFees(String loanFees) {
    this.loanFees = loanFees;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  Loan.LoanAccount(asAccount).Adjustment(asPenalty) `status: Registered` bian-reference:  Loan.LoanAccount(asAccount).Adjustment(asPenalty) iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_eEiTMHRkEeKIFpWttHerUA_-261419352) general-info: as booked against loan account 
   * @return penalties
  **/

  public String getPenalties() {
    return penalties;
  }

  public void setPenalties(String penalties) {
    this.penalties = penalties;
  }


  /**
   * `status: Registered` bian-reference:  LoanAgreement(asMasterAgreement).GovernedContract(asCollateralAgreement).Collateral.Valuation iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FLlGEcTGEeChad0JzLk7QA_1826831344/elements/_AAYPOmIjEeGD28DQaMef-g) general-info: value confirmed as of date 
   * @return collateralValuation
  **/

  public String getCollateralValuation() {
    return collateralValuation;
  }

  public void setCollateralValuation(String collateralValuation) {
    this.collateralValuation = collateralValuation;
  }


}

