/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ConsumerLoanApiService {

	ConsumerLoanDisbursementWithId executePostDisbursements(String crReferenceId, ConsumerLoanDisbursementWithoutCommonAndId request);
	
	ConsumerLoanDisbursementWithId executePutDisbursements(String crReferenceId, String bqReferenceId, ConsumerLoanDisbursementWithoutCommonAndId request);
	
	ConsumerLoanPaymentsWithId executePostPayments(String crReferenceId, ConsumerLoanPaymentWithoutCommonAndId request);
	
	ConsumerLoanPaymentsWithId executePutPayments(String crReferenceId, String bqReferenceId, ConsumerLoanPaymentWithoutCommonAndId request);
	
	ConsumerLoanWithdrawalWithId executePostWithdrawals(String crReferenceId, ConsumerLoanWithdrawalWithoutCommonAndId request);
	
	ConsumerLoanWithdrawalWithId executePutWithdrawals(String crReferenceId, String bqReferenceId, ConsumerLoanWithdrawalWithoutCommonAndId request);
	
	ConsumerLoanWithIdAndStatus initiate(ConsumerLoanBase request);
	
	ConsumerLoanRecordResponse record(String crReferenceId, ConsumerLoanRecordRequest request);
	
	ConsumerLoanRestructuringWithId requestPostRestructurings(String crReferenceId, ConsumerLoanRestructuringWithoutCommonAndId request);
	
	ConsumerLoanRestructuringWithId requestPutRestructurings(String crReferenceId, String bqReferenceId, ConsumerLoanRestructuringWithoutCommonAndId request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	ConsumerLoanWithIdAndStatus retrieve(String crReferenceId);
	
	List<String> retrieveRefIds();
	
	ConsumerLoanDisbursementWithId retrieveDisbursements(String crReferenceId, String bqReferenceId);
	
	ConsumerLoanMaintenanceWithId retrieveMaintenances(String crReferenceId, String bqReferenceId);
	
	ConsumerLoanPaymentsWithId retrievePayments(String crReferenceId, String bqReferenceId);
	
	ConsumerLoanRestructuringWithId retrieveRestructurings(String crReferenceId, String bqReferenceId);
	
	ConsumerLoanStatementWithId retrieveStatements(String crReferenceId, String bqReferenceId);
	
	ConsumerLoanWithdrawalWithId retrieveWithdrawals(String crReferenceId, String bqReferenceId);
	
	Void terminate(String crReferenceId);
	
	ConsumerLoanWithIdAndStatus update(String crReferenceId, ConsumerLoanBase request);
	
}
