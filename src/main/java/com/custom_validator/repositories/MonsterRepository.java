package com.custom_validator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.custom_validator.models.Monster;

@Repository
public interface MonsterRepository extends CrudRepository<Monster, Integer> {

}
