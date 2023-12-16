package com.settlement.settlementkotlin.core.job.purchaseconfirmed

import com.settlement.settlementkotlin.domain.entity.order.OrderItem
import com.settlement.settlementkotlin.infrastructure.database.repository.OrderItemRepository
import jakarta.persistence.EntityManager
import org.springframework.batch.item.database.JpaPagingItemReader
import org.springframework.batch.item.database.builder.JpaPagingItemReaderBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.time.LocalDate
import java.time.LocalTime
import java.time.ZoneId
import java.time.ZonedDateTime

@Configuration
class DeliveryCompletedItemReaderConfig(
    private val entityManager: EntityManager
) {

    val chunkSize = 500
    var startDateTime: ZonedDateTime = ZonedDateTime.of(
        LocalDate.now(),
        LocalTime.MIN,
        ZoneId.of("Asia/Seoul"))

    val endDateTime: ZonedDateTime = ZonedDateTime.of(
        LocalDate.now().plusDays(1),
        LocalTime.MIN,
        ZoneId.of("Asia/Seoul"))

    @Bean
    fun deliveryCompletedJpaItemReader(orderItemRepository: OrderItemRepository): JpaPagingItemReader<OrderItem> {

        /*return RepositoryItemReaderBuilder<OrderItem>()
            .name("deliveryCompletedJpaItemReader")
            .repository(orderItemRepository)
            .methodName("findByShippedCompleteAtBetween")
            .arguments(startDateTime, endDateTime)
            .pageSize(this.chunkSize)   //TODO : 주입 받는 파라미터로 분리
            .sorts(mapOf("ShippedCompleteAt" to Sort.Direction.ASC))
            .build()*/

        val queryProvider = DeliveryCompletedJpaQueryProvider(this.startDateTime, this.endDateTime)

        return JpaPagingItemReaderBuilder<OrderItem>()
            .name("deliveryCompletedJpaItemReader")
            .entityManagerFactory(this.entityManager.entityManagerFactory)
            .pageSize(this.chunkSize)
            .queryProvider(queryProvider)
            .build()
    }
}
