package com.api.pet.management.application.core.domain;

import java.util.List;

public class Accounting {
    private Integer fullAmountCharged;
    private Integer amountCharged;
    private Integer amountPaid;
    private Integer discount;
    private Boolean haveDebt;
    private Integer debt;
    private List<PetService> petServiceList;

    public Accounting() {
    }

    public Accounting(Integer fullAmountCharged, Integer amountCharged, Integer amountPaid, Integer discount, Boolean haveDebt, Integer debt, List<PetService> petServiceList) {
        this.fullAmountCharged = fullAmountCharged;
        this.amountCharged = amountCharged;
        this.amountPaid = amountPaid;
        this.discount = discount;
        this.haveDebt = haveDebt;
        this.debt = debt;
        this.petServiceList = petServiceList;
    }

    public Integer getFullAmountCharged() {
        return fullAmountCharged;
    }

    public void setFullAmountCharged(Integer fullAmountCharged) {
        this.fullAmountCharged = fullAmountCharged;
    }

    public Integer getAmountCharged() {
        return amountCharged;
    }

    public void setAmountCharged(Integer amountCharged) {
        this.amountCharged = amountCharged;
    }

    public Integer getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Integer amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Boolean getHaveDebt() {
        return haveDebt;
    }

    public void setHaveDebt(Boolean haveDebt) {
        this.haveDebt = haveDebt;
    }

    public Integer getDebt() {
        return debt;
    }

    public void setDebt(Integer debt) {
        this.debt = debt;
    }

    public List<PetService> getPetServiceList() {
        return petServiceList;
    }

    public void setPetServiceList(List<PetService> petServiceList) {
        this.petServiceList = petServiceList;
    }
}

