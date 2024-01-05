package com.settlement.settlementkotlin.infrastructure.database.repository

import com.settlement.settlementkotlin.domain.entity.settlement.SettlementDaily
import org.springframework.data.jpa.repository.JpaRepository

interface SettlementDailyRepository: JpaRepository<SettlementDaily, Long> {
}