package com.api.pet.management.application.ports.out;

import com.api.pet.management.application.core.domain.RegisterResponse;

public interface SaveRegisterPort {
    RegisterResponse save(RegisterResponse registerResponse);
}
