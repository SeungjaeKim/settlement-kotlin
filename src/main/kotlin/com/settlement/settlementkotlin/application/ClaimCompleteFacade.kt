package com.settlement.settlementkotlin.application

import com.settlement.settlementkotlin.domain.ClaimCompleteService
import org.springframework.stereotype.Service

@Service
class ClaimCompleteFacade (private val claimCompleteService: ClaimCompleteService){

    fun receiptComplete(claimId: Long){
        //읽기 서비스 : ClaimReceipt
        //쓰기 서비스 :
        claimCompleteService.complete(claimId)
    }

}