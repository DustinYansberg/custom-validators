package com.custom_validator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.custom_validator.models.Monster;
import com.custom_validator.repositories.MonsterRepository;

@Service
public class MonsterService {

    @Autowired
    MonsterRepository repo;

    // create
    public ResponseEntity<Monster> createMonster(Monster monster) {
	return ResponseEntity.status(HttpStatus.CREATED).body(repo.save(monster));
    }

    // read
    public ResponseEntity<Iterable<Monster>> getAllMonsters() {
	return ResponseEntity.status(HttpStatus.OK).body(repo.findAll());
    }

}
