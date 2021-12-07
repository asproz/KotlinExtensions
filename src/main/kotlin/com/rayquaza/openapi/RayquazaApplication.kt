package com.rayquaza.openapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.rayquaza.openapi.*")
class RayquazaApplication

fun main(args : Array<String>) {
    runApplication<RayquazaApplication>(*args)
}