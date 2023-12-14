package com.settlement.settlementkotlin.domain.entity.order

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.math.BigDecimal
import java.time.ZonedDateTime

@Entity
data class OrderItemSnapshot(
    @Id @Column(name = "order_item_snapshot_no") var id: Long,

    var createdAt: ZonedDateTime? = ZonedDateTime.now(),    //생성시간
    var updatedAt: ZonedDateTime? = ZonedDateTime.now(),    //업데이트시간
    var deletedAt: ZonedDateTime? = null,                   //삭제시간

    var productNo: Long,
    var sellerNo: Long,

    var sellPrice: BigDecimal? = BigDecimal.ZERO,
    var supplyPrice: BigDecimal? = BigDecimal.ZERO,
    var promotionAmount: BigDecimal? = BigDecimal.ZERO,
    var defaultDeliveryAmount: BigDecimal? = BigDecimal.valueOf(3000),

    var itemCategory: Int ? = 0,    //TODO : Enum으로 변경
    var taxRate: Int = 3,
    var taxType: String = "TAX",    //TODO : Enum으로 변경


)