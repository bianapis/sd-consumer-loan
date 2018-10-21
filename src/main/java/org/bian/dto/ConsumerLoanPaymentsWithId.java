package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.bian.dto.CurrencyAndAmount;

import javax.validation.Valid;
  
/**
 * ConsumerLoanPaymentsWithId
 */
public class ConsumerLoanPaymentsWithId   {
  private String productInstanceReference = null;

  private String paymentTransactionReference = null;

  private String paymentType = null;

  private String loanApplicableRate = null;

  private String customerReference = null;

  private String payerReference = null;

  private String payerProductInstanceReference = null;

  private String payerBankReference = null;

  private CurrencyAndAmount amount = null;

  private String currency = null;

  private String valueDate = null;

  private String stagedRepaymentStatement = null;

  private String loanOutstandingBalance = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return paymentTransactionReference
  **/

  public String getPaymentTransactionReference() {
    return paymentTransactionReference;
  }

  public void setPaymentTransactionReference(String paymentTransactionReference) {
    this.paymentTransactionReference = paymentTransactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return paymentType
  **/

  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
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
   * `status: Registered` bian-reference:  Loan.LoanAccount(asAccount).AccountPartyRole(asAccountOwnerRole) iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EysE9cTGEeChad0JzLk7QA_-200588046) general-info: loan account holder 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Registered` bian-reference:  Loan.InterestPaymentsSchedule.RelatedPaymentObligation.PaymentOffset.PartyRole(asDebtorRole) iso-link-1:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Etn-xcTGEeChad0JzLk7QA_1929472526) `status: Registered` bian-reference:  Loan.PrincipalPaymentsSchedule.RelatedPaymentObligation.PaymentOffset.PartyRole(asDebtorRole) iso-link-2:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Etn-xcTGEeChad0JzLk7QA_1929472526) 
   * @return payerReference
  **/

  public String getPayerReference() {
    return payerReference;
  }

  public void setPayerReference(String payerReference) {
    this.payerReference = payerReference;
  }


  /**
   * `status: Registered` bian-reference:  Loan.InterestPaymentsSchedule.RelatedPaymentObligation.PaymentOffset.PartyRole(asDebtorRole)(asPaymentPartyRole).CashAccount iso-link-1:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EvtpdMTGEeChad0JzLk7QA_-1076538618/elements/_EvtpdsTGEeChad0JzLk7QA_1151666800) `status: Registered` bian-reference-2:  Loan.PrincipalPaymentsSchedule.RelatedPaymentObligation.PaymentOffset.PartyRole(asDebtorRole)(asPaymentPartyRole).CashAccount iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EvtpdMTGEeChad0JzLk7QA_-1076538618/elements/_EvtpdsTGEeChad0JzLk7QA_1151666800) 
   * @return payerProductInstanceReference
  **/

  public String getPayerProductInstanceReference() {
    return payerProductInstanceReference;
  }

  public void setPayerProductInstanceReference(String payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
  }


  /**
   * `status: Registered` bian-reference:  Loan.InterestPaymentsSchedule.RelatedPaymentObligation.PaymentOffset.PartyRole(asDebtorRole).CashAccount(asAccount).AccountPartyRole(asAccountServicerRole) iso-link-1:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Ey118MTGEeChad0JzLk7QA_1536519000) `status: Registered` bian-reference:  Loan.PrincipalPaymentsSchedule.RelatedPaymentObligation.PaymentOffset.PartyRole(asDebtorRole).CashAccount(asAccount).AccountPartyRole(asAccountServicerRole) iso-link-2:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Ey118MTGEeChad0JzLk7QA_1536519000) 
   * @return payerBankReference
  **/

  public String getPayerBankReference() {
    return payerBankReference;
  }

  public void setPayerBankReference(String payerBankReference) {
    this.payerBankReference = payerBankReference;
  }


  /**
   * Get amount
   * @return amount
  **/

  public CurrencyAndAmount getAmount() {
    return amount;
  }

  public void setAmount(CurrencyAndAmount amount) {
    this.amount = amount;
  }


  /**
   * Get currency
   * @return currency
  **/

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  /**
   * Get valueDate
   * @return valueDate
  **/

  public String getValueDate() {
    return valueDate;
  }

  public void setValueDate(String valueDate) {
    this.valueDate = valueDate;
  }


  /**
   * `status: Registered` bian-reference:  Loan.InterestPaymentsSchedule.RelatedPaymentObligation.PaymentOffset iso-link-1:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FDPCYMTGEeChad0JzLk7QA_-1131921749/elements/_FDPCacTGEeChad0JzLk7QA_-72272631) `status: Registered` bian-reference:  Loan.PrincipalPaymentsSchedule.RelatedPaymentObligation.PaymentOffset iso-link-2:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FDPCYMTGEeChad0JzLk7QA_-1131921749/elements/_FDPCacTGEeChad0JzLk7QA_-72272631) 
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


}

