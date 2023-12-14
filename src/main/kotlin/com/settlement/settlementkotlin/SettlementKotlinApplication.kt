package com.settlement.settlementkotlin

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableBatchProcessing
class SettlementKotlinApplication

fun main(args: Array<String>) {
	runApplication<SettlementKotlinApplication>(*args)
}
