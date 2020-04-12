package com.ere.consumer.usersservice.confg

import org.springframework.amqp.rabbit.connection.CachingConnectionFactory
import org.springframework.amqp.rabbit.core.RabbitAdmin
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

@Configuration
class RabbitConfig {

    @Bean
    @Primary
    fun masterRabbit() = CachingConnectionFactory("localhost")

    @Bean
    @Primary
    fun ampqAdmin() = RabbitAdmin(masterRabbit())

    @Bean
    @Primary
    fun producerJackson2MessageConverter() = Jackson2JsonMessageConverter();

}