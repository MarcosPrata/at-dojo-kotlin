package io.arcotech.dojokotlin.repository

import io.arcotech.dojokotlin.model.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: CrudRepository<User, Long> {}
