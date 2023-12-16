package com.settlement.settlementkotlin.core.job.purchaseconfirmed

import com.settlement.settlementkotlin.domain.entity.order.OrderItem
import com.settlement.settlementkotlin.infrastructure.database.repository.OrderItemRepository
import jakarta.annotation.Nonnull
import org.springframework.batch.item.Chunk
import org.springframework.batch.item.ItemWriter
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional
import java.time.ZonedDateTime

@Component
@Transactional
class PurchaseConfirmedWriter (private val orderItemRepository: OrderItemRepository
) : ItemWriter<OrderItem> {

    override fun write(@Nonnull chunk: Chunk<out OrderItem>) {
        for(item in chunk.items) {
            //TODO Hidden Task : item purchaseConfirmedAt 업데이트하는 작업을 넣어줘야 한다.
            val newItem = item.copy(id=item.id, purchaseConfirmedAt = ZonedDateTime.now())
            //OrderItem을 저장
            orderItemRepository.save(newItem)
        }
    }

}
