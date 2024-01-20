package com.melik.JavaExercise.designpattern.structural.facade.v1.siparis;

import java.util.List;

public class SiparisDetaylari {

    public void siparisDetaylariniEkle(int siparisId, List<SepettekiUrun> urunList) {
        System.out.println(siparisId + " numaralı siparişte alınan ürünler :");
        System.out.println("----------------------------------");
        for (SepettekiUrun sepettekiUrun : urunList) {
            System.out.println(sepettekiUrun.getUrunAdi() + " ürününden " + sepettekiUrun.getAdet() + " adet alındı. Ara Toplam :" + sepettekiUrun.getFiyat());
            var toplam = (sepettekiUrun.getAdet() * sepettekiUrun.getFiyat());
            System.out.println("toplam: "+toplam);
        }
    }
}
