package com.settlement.settlementkotlin.infrastructure.database.repository

import com.settlement.settlementkotlin.domain.entity.order.OrderItem
import org.springframework.data.jpa.repository.JpaRepository
import java.time.ZonedDateTime

interface OrderItemRepository: JpaRepository<OrderItem, Long> {

    fun findByShippedCompleteAtBetween(startDateTime: ZonedDateTime, endDateTime: ZonedDateTime): List<OrderItem>

}