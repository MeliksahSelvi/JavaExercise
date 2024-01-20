package com.melik.JavaExercise.designpattern.creational.builder.v1;

/*
* burada normal ev,havuzlu ev gibi isimli methodlar ile ev oluşturmada kolaylık sağlandı.bu methodlar olmadığı takdirde de
* builder pattern'in şu faydası görülmüş olur.Ev inşa ederken hangi alanlar zorunlu hangi alanlar seçmeli ise bunları
* EvBuilder class'ında düzenledik.Ev Class'ının constructor'u private olduğu için ev oluşturmak isteyen birisi Evbuilder
* kullanmak zorunda Evbuilder'ın şartlarını biz istediğimiz gibi belirleriz.Bu pattern ile Ev nesnesi türetirken daha sistematik olmak ve
* nesnenin türetilme şartlarına uyulmasını sağlıyoruz.normal ev veya havuzlu ev gibi hazır şablonlar belirleyerek de client'ın
* ev nesnesi üretirken daha az efor sarfetmesini sağlayabiliriz.
*
* */
public class Main {
    public static void main(String[] args) {

        Ev normalEv= Ev.EvBuilder.buildNormalEv("İstanbul","Sancaktepe","Abdurrahmangazi",5,6)
                .setDublex(true)
                .setEsyali(true)
                .setBalkonSayisi(2)
                .setTuvaletSayisi(3)
                .setBanyoSayisi(3)
                .build();

        Ev havuzluEv = Ev.EvBuilder.buildHavuzluEv("İstanbul", "Beykoz", "Merkez", 3, 15)
                .setDublex(true)
                .setBalkonSayisi(3)
                .setEsyali(false)
                .setTuvaletSayisi(5)
                .setBanyoSayisi(3)
                .build();


    }
}
