package io.arcotech.dojokotlin.controller

import io.arcotech.dojokotlin.model.User
import io.arcotech.dojokotlin.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(
  private val userService: UserService
) {

  @GetMapping("/{id}")
  fun getUser(@PathVariable("id") userId: Long): User {
    println("test get userid: $userId")
    return this.userService.getUserById(userId)
  }

  @GetMapping
  fun indexUser(): String {
    return "test"
  }
}
