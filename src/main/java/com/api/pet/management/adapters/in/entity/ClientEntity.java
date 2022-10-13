package com.api.pet.management.adapters.in.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ClientEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private Long id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private LocalDate BirthDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "homeAdress_id")
    private HomeAdressEntity homeAdress;
}
