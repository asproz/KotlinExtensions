package com.rayquaza.openapi.service

import com.rayquaza.openapi.api.PetsApiDelegate
import com.rayquaza.openapi.model.Pet
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class PetsService : PetsApiDelegate {

    override fun createPets(pet: Pet?): ResponseEntity<Void> {
        return ResponseEntity(HttpStatus.CREATED)
    }

    override fun listPets(limit: Int?): ResponseEntity<MutableList<Pet>> {
        return ResponseEntity(mutableListOf(Pet().id(1L).name("José")), HttpStatus.OK)
    }
}