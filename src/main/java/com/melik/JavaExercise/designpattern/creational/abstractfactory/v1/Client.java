package com.melik.JavaExercise.designpattern.creational.abstractfactory.v1;

import com.melik.JavaExercise.designpattern.creational.abstractfactory.v1.button.Button;
import com.melik.JavaExercise.designpattern.creational.abstractfactory.v1.checkbox.CheckBox;
import com.melik.JavaExercise.designpattern.creational.abstractfactory.v1.factories.GUIFactory;
import com.melik.JavaExercise.designpattern.creational.abstractfactory.v1.factories.WindowsFactory;
/*
* Client soyut interface'ler ile çalışıyor. Hangi factory implementation'u verirsek abstract pattern ile dizayn edilmiş olan
* GUIFactory bize istediğimiz varsayondaki tüm componentleri oluşturuyor.Client'ın tek yapması gereken şey  hangi varyasonu istediğini söylemesi.
* istediği varyasyonun hepsinin birbiri ile uyunlu geleceği konusunda endişesi yok çünkü bu endişeden kurtulmak için GUIFactory'yi oluşturduk.
* hem yeni bir varyasyon eklemek istediğimiz zaman tek yapmamız gereken GUIFactory'yi implement eden bir concrete class tanımlamak ve o ilgili
* varyasyonu client'ın bizden istemesi.Aynı zamanda varyasyon ayarlama ve create product işlemlerini tek bir yer yapıyor bu da singleton pattern'ınını da
* uyguladığımızı gösteriyor.
*
* */

public class Client {
    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();

        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckBox();

        button.paint();
        checkBox.paint();

    }
}
/*
 * Kodunuzun çeşitli ilgili ürün aileleriyle çalışması gerektiğinde, ancak bu ürünlerin somut sınıflarına bağlı olmasını istemediğinizde Soyut Fabrika'yı kullanın;
 * bunlar önceden bilinmiyor olabilir veya yalnızca gelecekte genişletilebilirliğe izin vermek istersiniz.
 * Soyut Fabrika size ürün ailesinin her sınıfından nesneler yaratmanız için bir arayüz sağlar.
 * Kodunuz bu arabirim aracılığıyla nesneler oluşturduğu sürece, uygulamanız tarafından zaten oluşturulmuş ürünlerle eşleşmeyen bir ürünün yanlış varyantını
 *  oluşturma konusunda endişelenmenize gerek yoktur.
 * */