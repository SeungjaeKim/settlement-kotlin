package com.settlement.settlementkotlin.domain.entity.order

import com.settlement.settlementkotlin.domain.entity.Product
import com.settlement.settlementkotlin.domain.entity.Seller
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.math.BigDecimal
import java.time.ZonedDateTime

@Entity
data class OrderItemSnapshot(
    @Id @Column(name = "order_item_snapshot_no") val id: Long,

    val createdAt: ZonedDateTime? = ZonedDateTime.now(),    //생성시간
    val updatedAt: ZonedDateTime? = ZonedDateTime.now(),    //업데이트시간
    val deletedAt: ZonedDateTime? = null,                   //삭제시간

    val productNo: Long,
    val sellerNo: Long,

    val sellPrice: BigDecimal? = BigDecimal.ZERO,
    val supplyPrice: BigDecimal? = BigDecimal.ZERO,
    val promotionAmount: BigDecimal? = BigDecimal.ZERO,
    val mileageUsageAmount: BigDecimal? = BigDecimal.ZERO,
    val defaultDeliveryAmount: BigDecimal? = BigDecimal.valueOf(3000),

    val itemCategory: Int ? = 0,    //TODO : Enum으로 변경
    val taxRate: Int = 3,
    val taxType: String = "TAX",    //TODO : Enum으로 변경

    @ManyToOne
    @JoinColumn(name = "seller_no", referencedColumnName = "id", insertable = false, updatable = false)
    val seller: Seller,

    @ManyToOne
    @JoinColumn(name = "product_no", referencedColumnName = "id", insertable = false, updatable = false)
    val prodect: Product,
    )