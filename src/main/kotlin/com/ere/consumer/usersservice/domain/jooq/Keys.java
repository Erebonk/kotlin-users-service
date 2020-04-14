/*
 * This file is generated by jOOQ.
 */
package com.ere.consumer.usersservice.domain.jooq;


import com.ere.consumer.usersservice.domain.jooq.tables.Cars;
import com.ere.consumer.usersservice.domain.jooq.tables.Clients;
import com.ere.consumer.usersservice.domain.jooq.tables.records.CarsRecord;
import com.ere.consumer.usersservice.domain.jooq.tables.records.ClientsRecord;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;

import javax.annotation.processing.Generated;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>dbo</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<CarsRecord, Integer> IDENTITY_CARS = Identities0.IDENTITY_CARS;
    public static final Identity<ClientsRecord, Integer> IDENTITY_CLIENTS = Identities0.IDENTITY_CLIENTS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CarsRecord> CARS_PK = UniqueKeys0.CARS_PK;
    public static final UniqueKey<ClientsRecord> CLIENTS_PK = UniqueKeys0.CLIENTS_PK;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<CarsRecord, Integer> IDENTITY_CARS = Internal.createIdentity(Cars.CARS, Cars.CARS.ID);
        public static Identity<ClientsRecord, Integer> IDENTITY_CLIENTS = Internal.createIdentity(Clients.CLIENTS, Clients.CLIENTS.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<CarsRecord> CARS_PK = Internal.createUniqueKey(Cars.CARS, "cars_pk", Cars.CARS.ID);
        public static final UniqueKey<ClientsRecord> CLIENTS_PK = Internal.createUniqueKey(Clients.CLIENTS, "clients_pk", Clients.CLIENTS.ID);
    }
}
