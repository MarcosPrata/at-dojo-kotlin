package io.arcotech.dojokotlin.service

import io.arcotech.dojokotlin.model.User
import org.springframework.stereotype.Service

@Service
class UserService {
    fun createUser(): User {
        return User("mestre.marquinhos", "marcos.prata@arcoteh.io", "Marcos Prata")
    }

    fun getUserById(id: Long): User {
        return User("mestre.marquinhos", "marcos.prata@arcoteh.io", "Marcos Prata")
    }
}
