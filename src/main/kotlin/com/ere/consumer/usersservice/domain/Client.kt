package com.ere.consumer.usersservice.domain

data class Client(

        val id: Long,
        val username: String,
        val password: String,
        val email: String,
        val clientCode: String,
        val isAlive: Boolean
)