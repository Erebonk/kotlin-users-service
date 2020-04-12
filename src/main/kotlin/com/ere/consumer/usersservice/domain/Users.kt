//package com.ere.consumer.usersservice.domain
//
//import org.jetbrains.exposed.sql.Table
//
//object Users : Table() {
//
//    val id = varchar("id", 10)
//    val name = varchar("name", length = 50)
//    val username = varchar("username", length = 50)
//    val password = varchar("password", length = 50)
//    val clientCode = varchar("clientCode", length = 10)
//
//    override val primaryKey = PrimaryKey(id, name = "PK_User_ID")
//}