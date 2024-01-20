package com.melik.JavaExercise.designpattern.structural.facade.v1.facade;

import com.melik.JavaExercise.designpattern.structural.facade.v1.musteri.Musteri;
import com.melik.JavaExercise.designpattern.structural.facade.v1.siparis.*;

import java.util.Date;
import java.util.List;

public class SiparisFacade {

    private Musteri musteri;
    private KargoSirketi kargoSirketi;
    private SiparisDetaylari siparisDetaylari = new SiparisDetaylari();
    private SiparisIslemleri siparisIslemleri = new SiparisIslemleri();
    private UrunIslemleri urunIslemleri = new UrunIslemleri();

    public void siparisVer(String musteriAdi, String secilenKargoSirketi, List<SepettekiUrun> urunList) {
        musteri = new Musteri(musteriAdi);
        kargoSirketi = new KargoSirketi(secilenKargoSirketi);

        int siparisId = siparisIslemleri.siparisEkle(new Date(), musteri, kargoSirketi);
        siparisDetaylari.siparisDetaylariniEkle(siparisId, urunList);
        for (SepettekiUrun sepettekiUrun : urunList) {
            urunIslemleri.stokGuncelle(sepettekiUrun.getId(), sepettekiUrun.getAdet());
        }
        System.out.println("\n İşlem tamamlandı.");
    }
}
