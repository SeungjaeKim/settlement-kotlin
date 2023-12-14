package com.settlement.settlementkotlin.domain.entity.claim

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.ZonedDateTime

@Entity
data class ClaimItem (
    @Id @Column(name = "claim_item_no")val id : Long,
    var claimReceiptNo: Long,
    var createdAt: ZonedDateTime? = ZonedDateTime.now(),    //생성시간
    var updatedAt: ZonedDateTime? = ZonedDateTime.now(),    //업데이트시간
    var deletedAt: ZonedDateTime? = null,                   //삭제시간

    var orderItemNo: Long,
    var claimCount: Int? = 1,

)
