package com.ere.consumer.usersservice.service.rabbit

import com.ere.consumer.usersservice.domain.Client
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Service

@Service
class UserMessageService {

    val logger: Logger = LoggerFactory.getLogger(javaClass.simpleName)

    @RabbitListener(queues = arrayOf("kotlin-client-queue"))
    fun findByClientCode(clientCode: String) : Client {
        logger.info("ktl: -> new message $clientCode")
        return Client(1, "s", "s", "s", "s", true)
    }

}