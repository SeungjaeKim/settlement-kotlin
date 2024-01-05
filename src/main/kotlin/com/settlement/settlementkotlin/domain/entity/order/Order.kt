package com.settlement.settlementkotlin.domain.entity.order

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import jdk.jfr.DataAmount
import java.math.BigDecimal
import java.time.ZonedDateTime

@Entity
@Table(schema = "studymc", name = "order")
data class Order(
    @Id @Column(name = "order_no") val id: Long,
    val createdAt: ZonedDateTime? = ZonedDateTime.now(),
    val updatedAt: ZonedDateTime? = ZonedDateTime.now(),
    val deletedAt: ZonedDateTime? = null,
    val paidConfirmedAt: ZonedDateTime? = null,

    val paidPgAmount: BigDecimal? =BigDecimal.ZERO,
    val usedMileageAmount: BigDecimal? = BigDecimal.ZERO,
    val couponDiscountAmount: BigDecimal? = BigDecimal.ZERO,

    //주문자 정보 X
)