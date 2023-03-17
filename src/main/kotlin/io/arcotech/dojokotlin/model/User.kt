package io.arcotech.dojokotlin.model

import java.time.LocalDateTime

//class io.arcotech.dojokotlin.model.User {
//  var id: Long? = null
//  var username: String = ""
//  var email: String = ""
//  var name: String = ""
//  var createdAt: LocalDateTime = LocalDateTime.now()
//  var updatedAt: LocalDateTime
//}

class User(
    val username: String,
    val email: String,
    val name: String,
    val createdAt: LocalDateTime? = LocalDateTime.now(),
    val updatedAt: LocalDateTime? = LocalDateTime.now(),
    val id: Long? = null
)