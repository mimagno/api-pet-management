package com.api.pet.management.adapters.in.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RegisterResponseEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private ClientEntity client;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pets_id")
    private List<PetEntity> pets;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "establishmentAdress_id")
    private EstablishmentAdressEntity establishmentAdress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "accounting_id")
    private AccountingEntity accounting;
}
