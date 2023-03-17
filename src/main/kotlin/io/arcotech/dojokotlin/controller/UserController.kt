package io.arcotech.dojokotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable

@RestController
@RequestMapping("/users")
class UserController {

  @GetMapping("/{id}")
  fun GetUser(@PathVariable("id") userId: Int): String {
    return "test get userid: $userId"
  }

  @GetMapping
  fun IndexUser(): String {
    return "test"
  }
}
