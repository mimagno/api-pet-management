package com.api.pet.management.config;

import com.api.pet.management.adapters.out.SaveRegisterAdapter;
import com.api.pet.management.adapters.out.SearchAdressAdapter;
import com.api.pet.management.application.core.service.SaveRegisterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public SaveRegisterService saveClientService(SaveRegisterAdapter saveClientAdapter, SearchAdressAdapter searchAdressAdapter){
        return new SaveRegisterService(saveClientAdapter, searchAdressAdapter);
    }
}
