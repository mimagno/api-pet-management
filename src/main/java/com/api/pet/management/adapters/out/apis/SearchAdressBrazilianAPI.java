package com.api.pet.management.adapters.out.apis;

import com.api.pet.management.application.core.domain.Adress;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "buscaCep", url = "https://viacep.com.br")
public interface SearchAdressBrazilianAPI {

    @GetMapping("/ws/{cep}/json")
    ResponseEntity<Adress> search(@PathVariable String cep);
}
