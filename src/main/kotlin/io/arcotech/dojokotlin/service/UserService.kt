package io.arcotech.dojokotlin.service

import io.arcotech.dojokotlin.model.User
import io.arcotech.dojokotlin.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {
    fun create(username: String, email: String, name: String): User {
        val newUser = User(username, email, name)
        return userRepository.save(newUser)
    }

    fun getById(id: Long): User {
        return User("mestre.marquinhos", "marcos.prata@arcoteh.io", "Marcos Prata")
    }

    fun index(): List<User> {
        return userRepository.findAll().toList()
    }
}
