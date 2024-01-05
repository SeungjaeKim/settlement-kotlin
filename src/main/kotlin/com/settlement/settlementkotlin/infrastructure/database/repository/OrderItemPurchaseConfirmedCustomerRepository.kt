package com.settlement.settlementkotlin.infrastructure.database.repository

import com.settlement.settlementkotlin.domain.criteria.SearchForPurchaseConfirmedCriteria
import com.settlement.settlementkotlin.domain.entity.order.OrderItem

interface OrderItemPurchaseConfirmedCustomerRepository {
    fun getOrderItemForPurchaseConfirmedList(criteria: SearchForPurchaseConfirmedCriteria): List<OrderItem>
    fun getOrderItemForPurchaseConfirmedCount(criteria: SearchForPurchaseConfirmedCriteria): Int
}