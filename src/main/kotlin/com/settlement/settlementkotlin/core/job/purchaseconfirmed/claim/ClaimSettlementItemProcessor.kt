package com.settlement.settlementkotlin.core.job.purchaseconfirmed.claim

import com.settlement.settlementkotlin.domain.collection.NegativeDailySettlementCollection
import com.settlement.settlementkotlin.domain.entity.claim.ClaimItem
import com.settlement.settlementkotlin.domain.entity.settlement.SettlementDaily
import org.springframework.batch.item.ItemProcessor

class ClaimSettlementItemProcessor: ItemProcessor<ClaimItem, SettlementDaily> {
    override fun process(item: ClaimItem): SettlementDaily {
        return NegativeDailySettlementCollection(item).getSettlementDaily()
    }
}