package com.melik.JavaExercise.coding.livecoding.ntt;

import java.math.BigDecimal;

public class CreditCard implements BaseProduct{
    private BigDecimal anaPara;
    private BigDecimal faiz;
    private BigDecimal gecikmeFaizi;

    public CreditCard(BigDecimal anaPara, BigDecimal faiz, BigDecimal gecikmeFaizi) {
        this.anaPara = anaPara;
        this.faiz = faiz;
        this.gecikmeFaizi = gecikmeFaizi;
    }

    @Override
    public BigDecimal calculateDebt() {
        return anaPara.add(faiz).add(gecikmeFaizi);
    }
}
