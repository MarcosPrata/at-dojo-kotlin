package io.arcotech.dojokotlin.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

@Entity(name = "users")
class User(
    @Column
    val username: String,
    @Column
    val email: String,
    @Column
    val name: String,
    @CreatedDate
    val createdAt: LocalDateTime? = LocalDateTime.now(),
    @LastModifiedDate
    val updatedAt: LocalDateTime? = LocalDateTime.now(),
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = 0
)
