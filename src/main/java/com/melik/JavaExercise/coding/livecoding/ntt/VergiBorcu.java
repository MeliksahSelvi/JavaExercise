package com.melik.JavaExercise.coding.livecoding.ntt;

import java.math.BigDecimal;

public class VergiBorcu implements BaseProduct{

    private BigDecimal tutar;

    public VergiBorcu(BigDecimal tutar) {
        this.tutar = tutar;
    }

    @Override
    public BigDecimal calculateDebt() {
        return tutar;
    }
}
