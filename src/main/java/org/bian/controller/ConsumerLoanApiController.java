/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class ConsumerLoanApiController {

	@Autowired
	ConsumerLoanApiService service;
	
	@BQ("disbursements")
	@Fulfill.ExecutePost
	public BianResponse<ConsumerLoanDisbursementWithId> executePostDisbursements(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ConsumerLoanDisbursementWithoutCommonAndId> bianRequest) {
		return BianResponse.forSuccess(service.executePostDisbursements(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("disbursements")
	@Fulfill.ExecutePut
	public BianResponse<ConsumerLoanDisbursementWithId> executePutDisbursements(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ConsumerLoanDisbursementWithoutCommonAndId> bianRequest) {
		return BianResponse.forSuccess(service.executePutDisbursements(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("payments")
	@Fulfill.ExecutePost
	public BianResponse<ConsumerLoanPaymentsWithId> executePostPayments(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ConsumerLoanPaymentWithoutCommonAndId> bianRequest) {
		return BianResponse.forSuccess(service.executePostPayments(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("payments")
	@Fulfill.ExecutePut
	public BianResponse<ConsumerLoanPaymentsWithId> executePutPayments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ConsumerLoanPaymentWithoutCommonAndId> bianRequest) {
		return BianResponse.forSuccess(service.executePutPayments(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("withdrawals")
	@Fulfill.ExecutePost
	public BianResponse<ConsumerLoanWithdrawalWithId> executePostWithdrawals(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ConsumerLoanWithdrawalWithoutCommonAndId> bianRequest) {
		return BianResponse.forSuccess(service.executePostWithdrawals(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("withdrawals")
	@Fulfill.ExecutePut
	public BianResponse<ConsumerLoanWithdrawalWithId> executePutWithdrawals(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ConsumerLoanWithdrawalWithoutCommonAndId> bianRequest) {
		return BianResponse.forSuccess(service.executePutWithdrawals(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<ConsumerLoanWithIdAndStatus> initiate(@RequestBody BianRequest<ConsumerLoanBase> bianRequest) {
		return BianResponse.forSuccess(service.initiate(bianRequest.getData()));
	}
	
	@Fulfill.Record
	public BianResponse<ConsumerLoanRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ConsumerLoanRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("restructurings")
	@Fulfill.RequestPost
	public BianResponse<ConsumerLoanRestructuringWithId> requestPostRestructurings(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ConsumerLoanRestructuringWithoutCommonAndId> bianRequest) {
		return BianResponse.forSuccess(service.requestPostRestructurings(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("restructurings")
	@Fulfill.RequestPut
	public BianResponse<ConsumerLoanRestructuringWithId> requestPutRestructurings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ConsumerLoanRestructuringWithoutCommonAndId> bianRequest) {
		return BianResponse.forSuccess(service.requestPutRestructurings(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Fulfill.Retrieve
	public BianResponse<ConsumerLoanWithIdAndStatus> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("disbursements")
	@Fulfill.Retrieve
	public BianResponse<ConsumerLoanDisbursementWithId> retrieveDisbursements(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDisbursements(crReferenceId, bqReferenceId));
	}
	
	@BQ("maintenances")
	@Fulfill.Retrieve
	public BianResponse<ConsumerLoanMaintenanceWithId> retrieveMaintenances(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveMaintenances(crReferenceId, bqReferenceId));
	}
	
	@BQ("payments")
	@Fulfill.Retrieve
	public BianResponse<ConsumerLoanPaymentsWithId> retrievePayments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePayments(crReferenceId, bqReferenceId));
	}
	
	@BQ("restructurings")
	@Fulfill.Retrieve
	public BianResponse<ConsumerLoanRestructuringWithId> retrieveRestructurings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRestructurings(crReferenceId, bqReferenceId));
	}
	
	@BQ("statements")
	@Fulfill.Retrieve
	public BianResponse<ConsumerLoanStatementWithId> retrieveStatements(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveStatements(crReferenceId, bqReferenceId));
	}
	
	@BQ("withdrawals")
	@Fulfill.Retrieve
	public BianResponse<ConsumerLoanWithdrawalWithId> retrieveWithdrawals(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveWithdrawals(crReferenceId, bqReferenceId));
	}
	
	@Fulfill.Terminate
	public BianResponse<Void> terminate(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.terminate(crReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<ConsumerLoanWithIdAndStatus> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ConsumerLoanBase> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
