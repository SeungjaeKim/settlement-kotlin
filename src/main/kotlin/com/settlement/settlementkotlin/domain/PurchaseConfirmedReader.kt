package com.settlement.settlementkotlin.domain

import com.settlement.settlementkotlin.domain.criteria.SearchForPurchaseConfirmedCriteria
import com.settlement.settlementkotlin.domain.entity.order.OrderItem

/**
 * List, Count조회를 위한 Reader Interface
 */
interface PurchaseConfirmedReader {
    fun getPurchaseConfirmedItemList(criteria: SearchForPurchaseConfirmedCriteria): List<OrderItem>
    fun getPurchaseConfirmedItemCount(criteria: SearchForPurchaseConfirmedCriteria): Int
}