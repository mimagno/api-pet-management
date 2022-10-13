package com.api.pet.management.adapters.in.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PetServiceEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private Long id;

    @Column(nullable = false)
    private String employeeName;

    @Column(nullable = false)
    private String serviceType;

    @Column(nullable = false)
    private String price;

    @Column(nullable = false)
    private LocalDate date;
}
