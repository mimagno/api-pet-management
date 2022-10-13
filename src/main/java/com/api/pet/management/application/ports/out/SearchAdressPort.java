package com.api.pet.management.application.ports.out;

import com.api.pet.management.application.core.domain.Adress;
import com.api.pet.management.application.core.domain.EstablishmentAdress;
import com.api.pet.management.application.core.domain.HomeAdress;

public interface SearchAdressPort {
    Adress search(String zip);
}
