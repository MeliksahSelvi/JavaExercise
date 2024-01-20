package com.melik.JavaExercise.designpattern.structural.facade.v1.siparis;

import com.melik.JavaExercise.designpattern.structural.facade.v1.musteri.Musteri;

import java.util.Date;

public class SiparisIslemleri {

    public int siparisEkle(Date siparisTarihi, Musteri musteri, KargoSirketi kargoSirketi) {
        System.out.println(siparisTarihi + " tarihinde " + kargoSirketi.getName() + " kargo şirketi ile " + musteri.getName() + " " + musteri.getSurName() + " için sipariş oluştu");
        return 1;
    }
}
