package com.custom_validator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.custom_validator.models.Monster;
import com.custom_validator.services.MonsterService;

@RestController
@RequestMapping("/monster")
@CrossOrigin(origins = "*")
public class MonsterController {

    @Autowired
    private MonsterService service;

    // create
    @PostMapping
    public ResponseEntity<Monster> createMonster(@RequestBody Monster monster) {
	return service.createMonster(monster);
    }

    // read
    @GetMapping
    public ResponseEntity<Iterable<Monster>> getAllMonsters() {
	return service.getAllMonsters();
    }

    // update

    // delete
}