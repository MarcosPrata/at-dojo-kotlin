package io.arcotech.dojokotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DojoKotlinApplication

fun main(args: Array<String>) {
	runApplication<DojoKotlinApplication>(*args)
}
