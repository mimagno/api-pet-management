package com.api.pet.management.application.core.domain;

import java.util.Date;

public class Client {
    private String fullName;
    private Integer age;
    private Date BirthDate;
    private HomeAdress homeAdress;

    public Client() {
    }

    public Client(String fullName, Integer age, Date birthDate, HomeAdress homeAdress) {
        this.fullName = fullName;
        this.age = age;
        BirthDate = birthDate;
        this.homeAdress = homeAdress;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public HomeAdress getHomeAdress() {
        return homeAdress;
    }

    public void setHomeAdress(HomeAdress homeAdress) {
        this.homeAdress = homeAdress;
    }
}
