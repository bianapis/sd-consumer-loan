package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ConsumerLoanRestructuringWithoutCommonAndId
 */
public class ConsumerLoanRestructuringWithoutCommonAndId   {
  private String restructuringTask = null;

  private String restructuringEvaluation = null;

  private String restructuringSolution = null;

  private String restructingWriteDown = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return restructuringTask
  **/

  public String getRestructuringTask() {
    return restructuringTask;
  }

  public void setRestructuringTask(String restructuringTask) {
    this.restructuringTask = restructuringTask;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: definition of issue to resolve 
   * @return restructuringEvaluation
  **/

  public String getRestructuringEvaluation() {
    return restructuringEvaluation;
  }

  public void setRestructuringEvaluation(String restructuringEvaluation) {
    this.restructuringEvaluation = restructuringEvaluation;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: definition of loan terms and configuration impact 
   * @return restructuringSolution
  **/

  public String getRestructuringSolution() {
    return restructuringSolution;
  }

  public void setRestructuringSolution(String restructuringSolution) {
    this.restructuringSolution = restructuringSolution;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: loss/costs of restructuring 
   * @return restructingWriteDown
  **/

  public String getRestructingWriteDown() {
    return restructingWriteDown;
  }

  public void setRestructingWriteDown(String restructingWriteDown) {
    this.restructingWriteDown = restructingWriteDown;
  }


}

