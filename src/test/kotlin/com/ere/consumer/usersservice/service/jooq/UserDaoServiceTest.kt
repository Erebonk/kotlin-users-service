package com.ere.consumer.usersservice.service.jooq

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class UserDaoServiceTest {

    @Autowired
    lateinit var userDaoService: UserDaoService

    @Test
    fun getClientByClientCode() {
        val users = userDaoService.getClientByClientCode("101010")
        assertNotNull(users)
    }
}