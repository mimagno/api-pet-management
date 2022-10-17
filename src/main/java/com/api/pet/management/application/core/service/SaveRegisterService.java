package com.api.pet.management.application.core.service;

import com.api.pet.management.application.core.domain.EstablishmentAdress;
import com.api.pet.management.application.core.domain.HomeAdress;
import com.api.pet.management.application.core.domain.RegisterResponse;
import com.api.pet.management.application.ports.in.SaveRegisterServicePort;
import com.api.pet.management.application.ports.out.SaveRegisterPort;
import com.api.pet.management.application.ports.out.SearchAdressPort;

public class SaveRegisterService implements SaveRegisterServicePort {
    private final SaveRegisterPort saveRegisterPort;
    private final SearchAdressPort searchAdressPort;

    public SaveRegisterService(SaveRegisterPort saveClientPort, SearchAdressPort searchAdressPort) {
        this.saveRegisterPort = saveClientPort;
        this.searchAdressPort = searchAdressPort;
    }

    @Override
    public RegisterResponse saveRegister(RegisterResponse registerResponse, String homeZip, String establishmentZip) {
        var homeAdress = searchAdressPort.search(homeZip);
        var establishmentAdress = searchAdressPort.search(establishmentZip);
        registerResponse.getClient().setHomeAdress((HomeAdress) homeAdress);
        registerResponse.setEstablishmentAdress((EstablishmentAdress) establishmentAdress);

        return saveRegisterPort.save(registerResponse);
    }
}
