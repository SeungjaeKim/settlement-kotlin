package com.settlement.settlementkotlin.domain.entity.claim

import com.settlement.settlementkotlin.domain.enums.ClaimStatus
import com.settlement.settlementkotlin.domain.enums.ClaimStatusConverter
import jakarta.persistence.Column
import jakarta.persistence.Convert
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.ZonedDateTime

@Entity
data class ClaimReceipt (
    @Id @Column(name = "claim_receipt_no") val id: Long,
    val orderNo : Long,

    val createdAt: ZonedDateTime? = ZonedDateTime.now(),    //생성시간
    val updatedAt: ZonedDateTime? = ZonedDateTime.now(),    //업데이트시간
    val deletedAt: ZonedDateTime? = null,                   //삭제시간
    val completedAt: ZonedDateTime? = null,

    val requestType: String,    //TODO : Enum으로
    @Convert(converter = ClaimStatusConverter::class)
    val claimStatus: ClaimStatus,
    val extraFeePayer: Int,     //TODO : Enum으로
    val claimReason: Int,       //TODO : Enum으로

)