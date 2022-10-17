package com.api.pet.management.application.ports.out;

import com.api.pet.management.application.core.domain.Adress;

public interface SearchAdressPort {
    Adress search(String zip);
}
