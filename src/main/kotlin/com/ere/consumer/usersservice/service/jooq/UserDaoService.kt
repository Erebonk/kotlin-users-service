package com.ere.consumer.usersservice.service.jooq

import org.jooq.DSLContext
import org.jooq.Record
import org.jooq.SelectSelectStep
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class UserDaoService(@Qualifier("masterDSLContext") val dslContext: DSLContext) {

    fun getClientByClientCode(clientCode: String) : SelectSelectStep<Record>? {
        return dslContext.select()
    }



}