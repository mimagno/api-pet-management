package com.api.pet.management.application.core.domain;

import java.time.LocalDate;

public class PetService {
    private String employeeName;
    private String serviceType;
    private String price;
    private LocalDate date;

    public PetService() {
    }

    public PetService(String employeeName, String serviceType, String price, LocalDate date) {
        this.employeeName = employeeName;
        this.serviceType = serviceType;
        this.price = price;
        this.date = date;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
