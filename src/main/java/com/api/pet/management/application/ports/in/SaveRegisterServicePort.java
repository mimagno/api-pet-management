package com.api.pet.management.application.ports.in;

import com.api.pet.management.application.core.domain.RegisterResponse;

public interface SaveRegisterServicePort {
    RegisterResponse saveRegister(RegisterResponse registerResponse, String homeZip, String establishmentZip);
}
