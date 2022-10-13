package com.api.pet.management.adapters.in.entity;

import com.api.pet.management.application.core.domain.PetService;
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
public class AccountingEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private Long id;

    @Column(nullable = false)
    private Integer fullAmountCharged;

    @Column(nullable = false)
    private Integer amountCharged;

    @Column(nullable = false)
    private Integer amountPaid;

    @Column(nullable = false)
    private Integer discount;

    @Column(nullable = false)
    private Boolean haveDebt;

    @Column(nullable = false)
    private Integer debt;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "petService_id")
    private List<PetServiceEntity> petServiceList;

}
