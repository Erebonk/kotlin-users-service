package com.ere.consumer.usersservice.service.jooq

import com.ere.consumer.usersservice.domain.Client
import com.ere.consumer.usersservice.domain.jooq.tables.Cars.CARS
import com.ere.consumer.usersservice.domain.jooq.tables.Clients.CLIENTS
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class UserDaoService(@Qualifier("masterDSLContext") val dslContext: DSLContext) {

    fun getClientByClientCode(clientCode: String): MutableList<Client>? =
            dslContext.select(CLIENTS.ID, CLIENTS.USERNAME, CLIENTS.PASSWORD, CLIENTS.CLIENTID, CARS.NUMBER)
                .from(CLIENTS)
                .join(CARS)
                    .on(CLIENTS.ID.eq(CARS.USERID))
                    .where(CARS.NUMBER.isNotNull)
                    .fetch {
                        Client(it.getValue(CLIENTS.ID).toLong(),
                                it.getValue(CLIENTS.USERNAME),
                                it.getValue(CLIENTS.PASSWORD),
                                "",
                                it.getValue(CLIENTS.CLIENTID),
                                true,
                                it.getValue(CARS.NUMBER))
                    }

}