package com.settlement.settlementkotlin.infrastructure.database.repository

import com.settlement.settlementkotlin.domain.entity.claim.ClaimReceipt
import org.springframework.data.jpa.repository.JpaRepository

interface ClaimReceiptRepository: JpaRepository<ClaimReceipt, Long> {
}