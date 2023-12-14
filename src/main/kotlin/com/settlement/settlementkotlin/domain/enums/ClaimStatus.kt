package com.settlement.settlementkotlin.domain.enums
/**
 * claimStatus
 * 0. 철회
 * 1. 접수
 * 2. 진행 중
 * 3. 완료
 */
enum class ClaimStatus(val value: Int) {
    WITHDRAWN(0),
    RECEIVED(1),
    IN_PROGRESS(2),
    COMPLETED(3),
}