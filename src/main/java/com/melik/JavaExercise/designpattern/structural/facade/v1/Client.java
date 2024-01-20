package com.melik.JavaExercise.designpattern.structural.facade.v1;

import com.melik.JavaExercise.designpattern.structural.facade.v1.facade.SiparisFacade;
import com.melik.JavaExercise.designpattern.structural.facade.v1.siparis.SepettekiUrun;

import java.util.ArrayList;
import java.util.List;

/*
* Sipariş verme işlemi arka planda ardışık bir çok işlemden oluşmaktadır.Client bu işlemlerin ne olduğunu bilmek zorunda değil. Onu her şeyi bilmekten
* kurtarmak için Facade design pattern'ından faydalandık. Bu pattern bir Facade sınıf oluşturup tüm bu sipariş işlemlerini onun takip etmesini sağlamayı
* amaçlamaktadır. Client'ın da sadece bu facade nesnesi aracılığıyla tüm işlemleri yapmasını sağlıyor. Client ile karmaşık alt sistemler arasında basit bir
* arayüz sağlamayı amaçlıyoruz.
* */
public class Client {
    public static void main(String[] args) {
        SiparisFacade siparisFacade=new SiparisFacade();

        List<SepettekiUrun> urunList=new ArrayList<>();
        urunList.add(new SepettekiUrun(1L,"urunbir",1,1.0));
        urunList.add(new SepettekiUrun(2L,"urunIki",2,2.0));
        urunList.add(new SepettekiUrun(3L,"urunUc",3,3.0));

        siparisFacade.siparisVer("Melik","Aras Kargo",urunList);
    }
}
