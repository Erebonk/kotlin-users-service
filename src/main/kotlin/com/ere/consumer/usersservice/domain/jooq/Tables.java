/*
 * This file is generated by jOOQ.
 */
package com.ere.consumer.usersservice.domain.jooq;


import com.ere.consumer.usersservice.domain.jooq.tables.Cars;
import com.ere.consumer.usersservice.domain.jooq.tables.Clients;

import javax.annotation.processing.Generated;


/**
 * Convenience access to all tables in dbo
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>dbo.cars</code>.
     */
    public static final Cars CARS = Cars.CARS;

    /**
     * client users
     */
    public static final Clients CLIENTS = Clients.CLIENTS;
}