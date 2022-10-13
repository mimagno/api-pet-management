package com.api.pet.management.adapters.out.repository;

import com.api.pet.management.adapters.in.entity.RegisterResponseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<RegisterResponseEntity, Long> {

}
