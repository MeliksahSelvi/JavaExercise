package com.melik.JavaExercise.coding.livecoding.ntt;

import java.math.BigDecimal;

public class MortgageCredit implements BaseProduct{

    private BigDecimal anaPara;
    private BigDecimal komisyon;

    public MortgageCredit(BigDecimal anaPara, BigDecimal komisyon) {
        this.anaPara = anaPara;
        this.komisyon = komisyon;
    }

    @Override
    public BigDecimal calculateDebt() {
        return anaPara.add(komisyon);
    }
}
