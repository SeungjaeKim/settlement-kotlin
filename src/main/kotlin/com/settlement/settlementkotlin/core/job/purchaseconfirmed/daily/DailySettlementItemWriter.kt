package com.settlement.settlementkotlin.core.job.purchaseconfirmed.daily

import com.settlement.settlementkotlin.domain.entity.settlement.SettlementDaily
import com.settlement.settlementkotlin.infrastructure.database.repository.SettlementDailyRepository
import org.springframework.batch.item.Chunk
import org.springframework.batch.item.ItemWriter
import org.springframework.context.annotation.Configuration


@Configuration
class DailySettlementItemWriter(
    private val settlementDailyRepository: SettlementDailyRepository
): ItemWriter<SettlementDaily> {

    override fun write(chunk: Chunk<out SettlementDaily>) {
        for (item in chunk.items) {
            settlementDailyRepository.save(item)
        }
    }
}