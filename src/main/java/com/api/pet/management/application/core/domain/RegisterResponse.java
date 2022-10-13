package com.api.pet.management.application.core.domain;

import java.util.List;

public class RegisterResponse {
    private Client client;
    private List<Pet> pets;
    private EstablishmentAdress establishmentAdress;
    private Accounting accounting;

    public RegisterResponse() {
    }

    public RegisterResponse(Client client, List<Pet> pets, EstablishmentAdress establishmentAdress, Accounting accounting) {
        this.client = client;
        this.pets = pets;
        this.establishmentAdress = establishmentAdress;
        this.accounting = accounting;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public EstablishmentAdress getEstablishmentAdress() {
        return establishmentAdress;
    }

    public void setEstablishmentAdress(EstablishmentAdress establishmentAdress) {
        this.establishmentAdress = establishmentAdress;
    }

    public Accounting getAccounting() {
        return accounting;
    }

    public void setAccounting(Accounting accounting) {
        this.accounting = accounting;
    }
}
