package com.api.pet.management.adapters.in.request;

import com.api.pet.management.application.core.domain.Accounting;
import com.api.pet.management.application.core.domain.Client;
import com.api.pet.management.application.core.domain.EstablishmentAdress;
import com.api.pet.management.application.core.domain.Pet;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RegisterRequest {
    private Client client;
    private List<Pet> pets;
    private EstablishmentAdress establishmentAdress;
    private Accounting accounting;
}
