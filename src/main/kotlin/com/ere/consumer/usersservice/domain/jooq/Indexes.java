/*
 * This file is generated by jOOQ.
 */
package com.ere.consumer.usersservice.domain.jooq;


import com.ere.consumer.usersservice.domain.jooq.tables.Cars;
import com.ere.consumer.usersservice.domain.jooq.tables.Clients;
import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;

import javax.annotation.processing.Generated;


/**
 * A class modelling indexes of tables of the <code>dbo</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index CARS_ID_UINDEX = Indexes0.CARS_ID_UINDEX;
    public static final Index CARS_PK = Indexes0.CARS_PK;
    public static final Index CLIENTS_PK = Indexes0.CLIENTS_PK;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index CARS_ID_UINDEX = Internal.createIndex("cars_id_uindex", Cars.CARS, new OrderField[] { Cars.CARS.ID }, true);
        public static Index CARS_PK = Internal.createIndex("cars_pk", Cars.CARS, new OrderField[] { Cars.CARS.ID }, true);
        public static Index CLIENTS_PK = Internal.createIndex("clients_pk", Clients.CLIENTS, new OrderField[] { Clients.CLIENTS.ID }, true);
    }
}
