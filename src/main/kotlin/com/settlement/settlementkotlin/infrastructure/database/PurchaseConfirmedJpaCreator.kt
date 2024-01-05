package com.settlement.settlementkotlin.infrastructure.database

import com.settlement.settlementkotlin.domain.PurchaseConfirmedReader
import com.settlement.settlementkotlin.domain.criteria.SearchForPurchaseConfirmedCriteria
import com.settlement.settlementkotlin.domain.entity.order.OrderItem
import com.settlement.settlementkotlin.infrastructure.database.repository.OrderItemRepository
import org.springframework.stereotype.Service

@Service
class PurchaseConfirmedJpaCreator(private val repository: OrderItemRepository) : PurchaseConfirmedReader {
    override fun getPurchaseConfirmedItemList(criteria: SearchForPurchaseConfirmedCriteria): List<OrderItem> {
        TODO("Not yet implemented")
    }

    override fun getPurchaseConfirmedItemCount(criteria: SearchForPurchaseConfirmedCriteria): Int {
        TODO("Not yet implemented")
    }
}