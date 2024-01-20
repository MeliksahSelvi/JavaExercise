package com.melik.JavaExercise.designpattern.structural.proxy.v1;

import com.melik.JavaExercise.designpattern.structural.proxy.v1.api.YoutubeDownloader;
import com.melik.JavaExercise.designpattern.structural.proxy.v1.youtube.ThirdPartyYoutubeClass;
import com.melik.JavaExercise.designpattern.structural.proxy.v1.youtube.YoutubeCacheProxy;

/*
* Youtube viode indirme programımız var. Client bir video indirmek isteyeceği zaman service nesnemiz aracılığı veritabanına erişiriz
* ve videoyu response ederiz. Eğer Client aynı videoyu tekrar indirmek isterse bu işlem tekrarlanır.Veya başka bir Client aynı videoyu
* indirmek isteyebilir. Bu gibi durumlarda tekrarlı bir şekilde db connection, transaction, gereksiz memory israfı gibi durumlar ortaya çıkabilir.
* Bu durumu engellemek için her işlemde gerçek servis nesnesinden önce bir katman daha ekliyebiliriz.Proxy design pattern burada yardımımıza yetişiyor.
* Asıl nesne ile aynı türde proxy class yazılıyor. Bu proxy'nin bir veri cache görevi var. Bir veri istendiği zaman önce cache'de varmı diye kontrol ediliyor.
* Eğer yoksa requestin gerçek nesneyi kullanmasına izin veriyor. Eğer bu veri cache'da mevcut ise gerçek nesneye erişim sağlamak yerine eldeki veriyi
* response ediyor. Bu şekilde tekrarlı işlemlerden kurtulmuş oluyoruz. Örneğimizde de önce proxy olmadan her request gerçek nesneye erişebiliyor. Sonra
* proxy class'ını devreye sokuyoruz. İkisi arasındaki farkı hesaplıyoruz. Bu da bize Proxy design pattern'ının faydalarını gözler önüne sermiş oluyor.
* */

/*
* Proxy design pattern'ının çeşitli kullanım şekilleri vardır.Bizim bu örneğimiz caching proxy kullanımına giriyor.Diğer türler:
*
* Remote proxy -> Kullanılmak istenen nesne uzak bir sunucuda çalışıyor olabilir. Bu nesneye direkt erişim için bir köprü görevi görür
* ve doğrudan erişimin potansiyel olumsuz sonuçlarından kurtarır.
*
* Virtual Proxy ->  Bazı nesneler sürekli olarak bellekte ayakta kalır ve sistemi yoğun olarak kullanır.Uygulama çalıştığı anda bu nesneyi
* oluşturmaktansa ihtiyaç duyulduğu zamana kadar nesne oluşturma işlemini erteleyebiliriz.Sistem performansı için önemli bir yeri vardır.
*
* Protection Proxy -> Ana nesneye erişim iznini kontrol eder ve bu izni yalnızca belirli nesnelere verir.Sistem güvenliği açısından öneme sahiptir.
* */
public class Client {
    public static void main(String[] args) {

        YoutubeDownloader naiveDownloader = new YoutubeDownloader(new ThirdPartyYoutubeClass());
        YoutubeDownloader smartDownloader = new YoutubeDownloader(new YoutubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.println("Time saved by caching proxy: " + (naive - smart) + "ms");
    }

    private static long test(YoutubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        downloader.renderPopularVideos();
        downloader.renderVideoPage("1");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("d");

        downloader.renderVideoPage("1");
        downloader.renderVideoPage("5");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}

