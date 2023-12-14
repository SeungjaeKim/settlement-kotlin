package com.settlement.settlementkotlin.interfaces

import com.settlement.settlementkotlin.application.ClaimCompleteFacade
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/claim")
class ClaimController (private val facade: ClaimCompleteFacade) {

    @GetMapping("/complete/{id}")
    fun completeClaim(@PathVariable id: Long): ResponseEntity.HeadersBuilder<*> {
        facade.receiptComplete(id)
        // 임시로 성공 응답 반환 예시
        return ResponseEntity.noContent()
    }

}