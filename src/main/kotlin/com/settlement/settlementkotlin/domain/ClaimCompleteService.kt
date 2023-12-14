package com.settlement.settlementkotlin.domain

import org.springframework.stereotype.Service

@Service
class ClaimCompleteService(
    private val executor: ClaimCompleteExecutor
) {
    fun complete(claimId: Long) = executor.updateCompleteAt(claimId)
}