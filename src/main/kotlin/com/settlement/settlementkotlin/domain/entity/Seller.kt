package com.settlement.settlementkotlin.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.ZonedDateTime

@Entity
data class Seller (
    @Id
    @Column(name = "seller_no")
    val id: Long,
    val sellerName: String,
    val businessNo: Long,
    val sellType: String = "C",
    val bankType: String,
    val accountNo: Long,
    val accountOwnerName: String,
    val isActive: Int = 1,
    val defaultDeliveryAmount: Long = 3000,
    val commision: Long = 5,
    val createdAt: ZonedDateTime? = ZonedDateTime.now(),
    val updatedAt: ZonedDateTime? = ZonedDateTime.now(),
    val deletedAt: ZonedDateTime? = null
)