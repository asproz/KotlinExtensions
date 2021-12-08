package com.rayquaza.openapi.controller

import com.rayquaza.openapi.PetsApi
import com.rayquaza.openapi.resource.PetResource
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class PetsController : PetsApi {

    override fun createPets(petResource: PetResource): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.CREATED)
    }

    override fun listPets(limit: Int?): ResponseEntity<List<PetResource>> {
        return ResponseEntity(listOf(PetResource("Jamal", 1, "8xx9cj")), HttpStatus.OK)
    }
}