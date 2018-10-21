/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ConsumerLoanApiServiceImpl implements ConsumerLoanApiService {

	public ConsumerLoanDisbursementWithId executePostDisbursements(String crReferenceId, ConsumerLoanDisbursementWithoutCommonAndId request){
		return JsonReader.read("executePost-ConsumerLoanDisbursementWithId.json",new TypeReference<ConsumerLoanDisbursementWithId>(){});
	}
	
	public ConsumerLoanDisbursementWithId executePutDisbursements(String crReferenceId, String bqReferenceId, ConsumerLoanDisbursementWithoutCommonAndId request){
		return JsonReader.read("executePut-ConsumerLoanDisbursementWithId.json",new TypeReference<ConsumerLoanDisbursementWithId>(){});
	}
	
	public ConsumerLoanPaymentsWithId executePostPayments(String crReferenceId, ConsumerLoanPaymentWithoutCommonAndId request){
		return JsonReader.read("executePost-ConsumerLoanPaymentsWithId.json",new TypeReference<ConsumerLoanPaymentsWithId>(){});
	}
	
	public ConsumerLoanPaymentsWithId executePutPayments(String crReferenceId, String bqReferenceId, ConsumerLoanPaymentWithoutCommonAndId request){
		return JsonReader.read("executePut-ConsumerLoanPaymentsWithId.json",new TypeReference<ConsumerLoanPaymentsWithId>(){});
	}
	
	public ConsumerLoanWithdrawalWithId executePostWithdrawals(String crReferenceId, ConsumerLoanWithdrawalWithoutCommonAndId request){
		return JsonReader.read("executePost-ConsumerLoanWithdrawalWithId.json",new TypeReference<ConsumerLoanWithdrawalWithId>(){});
	}
	
	public ConsumerLoanWithdrawalWithId executePutWithdrawals(String crReferenceId, String bqReferenceId, ConsumerLoanWithdrawalWithoutCommonAndId request){
		return JsonReader.read("executePut-ConsumerLoanWithdrawalWithId.json",new TypeReference<ConsumerLoanWithdrawalWithId>(){});
	}
	
	public ConsumerLoanWithIdAndStatus initiate(ConsumerLoanBase request){
		return JsonReader.read("initiate-ConsumerLoanWithIdAndStatus.json",new TypeReference<ConsumerLoanWithIdAndStatus>(){});
	}
	
	public ConsumerLoanRecordResponse record(String crReferenceId, ConsumerLoanRecordRequest request){
		return JsonReader.read("record-ConsumerLoanRecordResponse.json",new TypeReference<ConsumerLoanRecordResponse>(){});
	}
	
	public ConsumerLoanRestructuringWithId requestPostRestructurings(String crReferenceId, ConsumerLoanRestructuringWithoutCommonAndId request){
		return JsonReader.read("requestPost-ConsumerLoanRestructuringWithId.json",new TypeReference<ConsumerLoanRestructuringWithId>(){});
	}
	
	public ConsumerLoanRestructuringWithId requestPutRestructurings(String crReferenceId, String bqReferenceId, ConsumerLoanRestructuringWithoutCommonAndId request){
		return JsonReader.read("requestPut-ConsumerLoanRestructuringWithId.json",new TypeReference<ConsumerLoanRestructuringWithId>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public ConsumerLoanWithIdAndStatus retrieve(String crReferenceId){
		return JsonReader.read("retrieve-ConsumerLoanWithIdAndStatus.json",new TypeReference<ConsumerLoanWithIdAndStatus>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public ConsumerLoanDisbursementWithId retrieveDisbursements(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ConsumerLoanDisbursementWithId.json",new TypeReference<ConsumerLoanDisbursementWithId>(){});
	}
	
	public ConsumerLoanMaintenanceWithId retrieveMaintenances(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ConsumerLoanMaintenanceWithId.json",new TypeReference<ConsumerLoanMaintenanceWithId>(){});
	}
	
	public ConsumerLoanPaymentsWithId retrievePayments(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ConsumerLoanPaymentsWithId.json",new TypeReference<ConsumerLoanPaymentsWithId>(){});
	}
	
	public ConsumerLoanRestructuringWithId retrieveRestructurings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ConsumerLoanRestructuringWithId.json",new TypeReference<ConsumerLoanRestructuringWithId>(){});
	}
	
	public ConsumerLoanStatementWithId retrieveStatements(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ConsumerLoanStatementWithId.json",new TypeReference<ConsumerLoanStatementWithId>(){});
	}
	
	public ConsumerLoanWithdrawalWithId retrieveWithdrawals(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ConsumerLoanWithdrawalWithId.json",new TypeReference<ConsumerLoanWithdrawalWithId>(){});
	}
	
	public Void terminate(String crReferenceId){
		return null;
	}
	
	public ConsumerLoanWithIdAndStatus update(String crReferenceId, ConsumerLoanBase request){
		return JsonReader.read("update-ConsumerLoanWithIdAndStatus.json",new TypeReference<ConsumerLoanWithIdAndStatus>(){});
	}
	
}
