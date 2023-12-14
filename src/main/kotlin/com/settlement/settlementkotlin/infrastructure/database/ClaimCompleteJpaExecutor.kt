package com.settlement.settlementkotlin.infrastructure.database

import com.settlement.settlementkotlin.domain.ClaimCompleteExecutor
import com.settlement.settlementkotlin.domain.entity.claim.ClaimReceipt
import com.settlement.settlementkotlin.domain.enums.ClaimStatus
import com.settlement.settlementkotlin.infrastructure.database.repository.ClaimReceiptRepository
import org.springframework.stereotype.Service
import java.time.ZonedDateTime

@Service
class ClaimCompleteJpaExecutor (private val claimReceiptRepository: ClaimReceiptRepository) : ClaimCompleteExecutor{
    override fun updateCompleteAt(claimId: Long) {
        //claimReceipt 조회
        val receipt = claimReceiptRepository.findById(claimId).get()

        val updateReceipt = getUpdateReceipt(receipt)

        claimReceiptRepository.save(updateReceipt)
    }

    private fun getUpdateReceipt(receipt: ClaimReceipt) : ClaimReceipt{
        return receipt.copy(id= receipt.id, completedAt = ZonedDateTime.now(), claimStatus = ClaimStatus.COMPLETED)
    }
}