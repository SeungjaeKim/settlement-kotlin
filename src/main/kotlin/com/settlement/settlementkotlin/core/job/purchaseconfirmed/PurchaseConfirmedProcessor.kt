package com.settlement.settlementkotlin.core.job.purchaseconfirmed

import com.settlement.settlementkotlin.domain.entity.order.OrderItem
import org.springframework.batch.item.ItemProcessor
import java.time.ZonedDateTime

class PurchaseConfirmedProcessor : ItemProcessor<OrderItem, OrderItem>{
    override fun process(item: OrderItem): OrderItem {
        return item.copy(id = item.id, purchaseConfirmedAt = ZonedDateTime.now())
    }
}