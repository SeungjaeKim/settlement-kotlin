package com.settlement.settlementkotlin.infrastructure.database.repository

import com.settlement.settlementkotlin.domain.criteria.SearchForPurchaseConfirmedCriteria
import com.settlement.settlementkotlin.domain.entity.order.OrderItem

class OrderItemPurchaseConfirmedCustomerRepositoryImpl: OrderItemPurchaseConfirmedCustomerRepository {

    override fun getOrderItemForPurchaseConfirmedList(criteria: SearchForPurchaseConfirmedCriteria): List<OrderItem> {
        TODO("Not yet implemented")
    }

    override fun getOrderItemForPurchaseConfirmedCount(criteria: SearchForPurchaseConfirmedCriteria): Int {
        TODO("Not yet implemented")
    }
}