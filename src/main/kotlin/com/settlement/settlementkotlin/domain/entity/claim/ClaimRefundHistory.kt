package com.settlement.settlementkotlin.domain.entity.claim

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.math.BigDecimal
import java.time.ZonedDateTime

@Entity
data class ClaimRefundHistory (
    @Id @Column(name = "claim_refund_no")val id : Long,
    var claimReceiptNo: Long,
    var createdAt: ZonedDateTime? = ZonedDateTime.now(),    //생성시간
    var updatedAt: ZonedDateTime? = ZonedDateTime.now(),    //업데이트시간
    var deletedAt: ZonedDateTime? = null,                   //삭제시간

    var refundedAt: ZonedDateTime? = null,                   //환불시간

    var sellerNo: Long,
    var refundCashAmount: BigDecimal = BigDecimal.ZERO,
    var couponSaleAount: BigDecimal = BigDecimal.ZERO,
    var refundMileageAmount: BigDecimal = BigDecimal.ZERO,
    var subtractDeliveryAmount: BigDecimal = BigDecimal.ZERO,
    var refundDeliveryAmount: BigDecimal = BigDecimal.ZERO,

)
