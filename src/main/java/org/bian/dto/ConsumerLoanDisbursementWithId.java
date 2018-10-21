package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CurrencyAndAmount;

import javax.validation.Valid;
  
/**
 * ConsumerLoanDisbursementWithId
 */
public class ConsumerLoanDisbursementWithId   {
  private String productInstanceReference = null;

  private String disbursementOrderReference = null;

  private String customerReference = null;

  private String payeeReference = null;

  private String payeeProductInstanceReference = null;

  private String payeeBankReference = null;

  private CurrencyAndAmount amount = null;

  private String currency = null;

  private String valueDate = null;


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
   * `status: Provisionally Registered` bian-reference:  Loan.Disbursement.DisbursementOrder 
   * @return disbursementOrderReference
  **/

  public String getDisbursementOrderReference() {
    return disbursementOrderReference;
  }

  public void setDisbursementOrderReference(String disbursementOrderReference) {
    this.disbursementOrderReference = disbursementOrderReference;
  }


  /**
   * `status: Registered` bian-reference:  LoanAgreement.TradePartyRole(asBorrower)(asRole).Player(asParty) iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633) general-info: loan account holder 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Registered` bian-reference:  Loan.Disbursement(asPayment).PaymentPartyRole(asCreditorRole) iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EteNycTGEeChad0JzLk7QA_-591715083) 
   * @return payeeReference
  **/

  public String getPayeeReference() {
    return payeeReference;
  }

  public void setPayeeReference(String payeeReference) {
    this.payeeReference = payeeReference;
  }


  /**
   * `status: Registered` bian-reference:  Loan.Disbursement(asPayment).PaymentPartyRole(asCreditorRole)(asPaymentPartyRole).CashAccount iso-link-1:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EvtpdMTGEeChad0JzLk7QA_-1076538618/elements/_EvtpdsTGEeChad0JzLk7QA_1151666800) `status: Provisionally Registered` bian-reference:  Loan.LoanAccount `status: Registered` bian-reference:  Loan.LoanAccount iso-link-2:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E4gZEcTGEeChad0JzLk7QA_2010102988) general-info: payee account 
   * @return payeeProductInstanceReference
  **/

  public String getPayeeProductInstanceReference() {
    return payeeProductInstanceReference;
  }

  public void setPayeeProductInstanceReference(String payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
  }


  /**
   * `status: Registered` bian-reference:  Loan.Disbursement(asPayment).PaymentPartyRole(asCreditorAgentRole) iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EteNyMTGEeChad0JzLk7QA_-246206935) 
   * @return payeeBankReference
  **/

  public String getPayeeBankReference() {
    return payeeBankReference;
  }

  public void setPayeeBankReference(String payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
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


}

