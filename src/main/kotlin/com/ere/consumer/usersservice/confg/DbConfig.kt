package com.ere.consumer.usersservice.confg

import org.jooq.DSLContext
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import javax.sql.DataSource

@Configuration
class DbConfig {

    @Primary
    @Bean("masterDS")
    fun masterDS() = DataSourceBuilder.create().build()

    @Primary
    @Bean("masterDSLContext")
    fun masterDSLContext(@Qualifier("masterDS") datasource : DataSource) : DSLContext =
            DSL.using(datasource, SQLDialect.POSTGRES)

}