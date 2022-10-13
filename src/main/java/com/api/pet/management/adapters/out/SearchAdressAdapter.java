package com.api.pet.management.adapters.out;

import com.api.pet.management.adapters.out.apis.SearchAdressBrazilianAPI;
import com.api.pet.management.application.core.domain.Adress;
import com.api.pet.management.application.ports.out.SearchAdressPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SearchAdressAdapter implements SearchAdressPort {

    private final SearchAdressBrazilianAPI searchAdressBrazilianAPI;

    @Override
    public Adress search(String zip) {
        var adress = searchAdressBrazilianAPI.search(zip);
        return adress.getBody();
    }
}
