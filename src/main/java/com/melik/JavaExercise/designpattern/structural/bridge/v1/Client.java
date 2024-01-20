package com.melik.JavaExercise.designpattern.structural.bridge.v1;

import com.melik.JavaExercise.designpattern.structural.bridge.v1.devices.Device;
import com.melik.JavaExercise.designpattern.structural.bridge.v1.devices.Radio;
import com.melik.JavaExercise.designpattern.structural.bridge.v1.devices.Tv;
import com.melik.JavaExercise.designpattern.structural.bridge.v1.remotes.AdvancedRemote;
import com.melik.JavaExercise.designpattern.structural.bridge.v1.remotes.BasicRemote;
/*
 * device ve remote kombinasyonunda karşılıklı olarak ikisini birbiri ile direkt kullandığımızda kodumuz karmaşıklaşır
 * ve genişletme yapmamız gerektiğinde open closed principle'yi ihlal ederek genişletmiş oluruz.Bridge Pattern, uygulamanın daha kolay
 * kontrol edilebilmesi için ve ilkemizi ihlalini engellemek için; uygulamayı Abstraction(Soyutlama) ve Implementation(Uygulama) olarak
 * iki hiyerarşiye ayırmamızı öneriyor. Biz burada Abstraction olarak Remote'yi Implementation olarak da Device'yi belirledik.
 * Soyutlama katmanı içinde Uygulama katmanı nesnesini bulundurur. Bu şekilde Soyutlama katmanı üst seviyeli işlemler ile ilgilenirken arka planda yapması için
 * asıl işi Uygulama katmanına bırakır. Her katmanın görevi birdir. Client'ın burada yapması gereken şey başlangıçta istenen Remote Tipini,
 * Remote constructor'u sayesinde belirli bir Device nesnesine bağlamak.Bridge'nin bize faydaları:
 *
 * 1- Çalışma zamanında Soyutlama'nın(Remote) Implementation'unu(Device) farklı tipleri ile değiştirebiliriz.
 * 2- Birbirinden bağımsız sınıfları(Remote ve Device) ortogonal olarak büyütmemiz gerektiğinde diğer sınıflar etkilenmeden yapabileceğiz.(open-closed principle)
 * 3- Client üst düzey soyutlamalar ile çalışıyor.
 * */

/*
 * Bu pattern Adapter Pattern'ı ile karıştırılabilir:
 * 1
 * -Adapter'da elimizde soyut bir interface'miz var ve bu interface'yi benzer işleve sahip ama farklı arayüzü olan başka bir nesneyle eşlemek istediğimizde işe yarar.
 * Bir nevi önceden yazılmış olan eski veya 3.parti kodlara uyum sağlıyoruz.
 *
 * -Bridge'da ise tüm kodun tasarımcısı biziz hem soyut arayüzü hem de implementation'u biz belirliyoruz sadece farklı implementation'ları birbiri ile değiştirebilmemiz
 * gerekiyor
 *
 * 2
 * -Adapter pattern dizayn edilmiş parçaların birbiri ile uyumlu olması içindir.
 * -Bridge pattern ise daha dizayn işlemi olmadan parçaları birbiri ile çalışır hale getirir.
 *
 * */
public class Client {
    public static void main(String[] args) {

        testDevice(new Radio());
        testDevice(new Tv());
    }

    private static void testDevice(Device device) {
        System.out.println("Test With Basic Remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        System.out.println("Test With Advanced Remote");
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
