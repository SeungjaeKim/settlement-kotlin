package com.settlement.settlementkotlin.core.job.purchaseconfirmed.daily

import com.settlement.settlementkotlin.domain.collection.CommissionAmountCalculator
import com.settlement.settlementkotlin.domain.collection.PgSalesAmountCalculator
import com.settlement.settlementkotlin.domain.collection.PositiveDailySettlementCollection
import com.settlement.settlementkotlin.domain.collection.TaxCalculator
import com.settlement.settlementkotlin.domain.entity.order.OrderItem
import com.settlement.settlementkotlin.domain.entity.settlement.SettlementDaily
import org.springframework.batch.item.ItemProcessor
import java.math.BigDecimal
import java.time.LocalDate

class DailySettlementItemProcessor: ItemProcessor<OrderItem, SettlementDaily> {
    /**
     * + 정산금액을 만들기
     */
    override fun process(item: OrderItem): SettlementDaily {
        val positiveDailySettlementCollection = PositiveDailySettlementCollection(item)

        return positiveDailySettlementCollection.getSettlementDaily()
    }
}