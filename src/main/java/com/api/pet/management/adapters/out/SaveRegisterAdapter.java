package com.api.pet.management.adapters.out;

import com.api.pet.management.application.core.domain.RegisterResponse;
import com.api.pet.management.application.ports.out.SaveRegisterPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SaveRegisterAdapter implements SaveRegisterPort {

    @Override
    public RegisterResponse save(RegisterResponse registerResponse) {
        return null;
    }
}
