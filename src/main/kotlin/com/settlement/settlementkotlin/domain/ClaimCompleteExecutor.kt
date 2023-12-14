package com.settlement.settlementkotlin.domain

interface ClaimCompleteExecutor {
    fun updateCompleteAt(claimId: Long)
}