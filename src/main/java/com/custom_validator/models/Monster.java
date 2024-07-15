package com.custom_validator.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "monsters")
public class Monster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "monster_id")
    private int id;

    @Column(name = "name")
    @NotBlank(message = "Name is ABSOLUTELY REQUIRED")
    private String name;

    @Column(name = "height")
    private int height;

    @Column(name = "description")
    private String description;

    @Column(name = "location")
    private String location;

    // TODO: Must check validity of monster's type
    @Column(name = "type")
    private String type;

    public Monster() {
	super();
    }

    public Monster(int id, String name, int height, String description, String location, String type) {
	super();
	this.id = id;
	this.name = name;
	this.height = height;
	this.description = description;
	this.location = location;
	this.type = type;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getHeight() {
	return height;
    }

    public void setHeight(int height) {
	this.height = height;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getLocation() {
	return location;
    }

    public void setLocation(String location) {
	this.location = location;
    }

    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }

}
