package com.melik.JavaExercise.coding.livecoding.ntt;

import java.math.BigDecimal;
import java.util.List;

public class BorcHesaplamaManager {

    public BigDecimal calculateBorc(List<BaseProduct> urunler){
        return urunler.stream()
                .map(BaseProduct::calculateDebt)
                .reduce(BigDecimal.ZERO,BigDecimal::add);
    }
}
