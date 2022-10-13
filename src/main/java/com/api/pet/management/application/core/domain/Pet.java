package com.api.pet.management.application.core.domain;

public class Pet {
    private String specie;
    private String race;
    private String name;
    private Integer age;
    private String bloodType;
    private String violent;

    public Pet() {
    }

    public Pet(String specie, String race, String name, Integer age, String bloodType, String violent) {
        this.specie = specie;
        this.race = race;
        this.name = name;
        this.age = age;
        this.bloodType = bloodType;
        this.violent = violent;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getViolent() {
        return violent;
    }

    public void setViolent(String violent) {
        this.violent = violent;
    }
}
