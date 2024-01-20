package com.melik.JavaExercise.designpattern.creational.factory.v1;

import com.melik.JavaExercise.designpattern.creational.factory.v1.factories.Dialog;
import com.melik.JavaExercise.designpattern.creational.factory.v1.factories.HtmlDialog;
import com.melik.JavaExercise.designpattern.creational.factory.v1.factories.WindowsDialog;

/*
* Burada Client Dialog factory class'larının arka planda ne yaptığını ve nelere bağımlı olduğunu bilmesine gerek kalmadan render işlemi yapabiliyor.
* Mesela Dialog'un arka planda bir button oluşturduğunu bilmesine gerek yok.Tek yapması gereken hangi tarz Dialog görmek istiyorsa onun implementation'unu
* Dialog'a vermesidir.Ayrıca yeni bir dialog türü eklenmek istendiğinde kolayca eklenebilir durumdadır ve open-closed principle desteklenmiştir.
* */

public class Client {
    public static void main(String[] args) {

        Dialog dialog=new HtmlDialog();
        dialog.renderWindow();

        dialog=new WindowsDialog();
        dialog.renderWindow();
    }
}

/*
 *Kodunuzun birlikte çalışması gereken nesnelerin tam türlerini ve bağımlılıklarını önceden bilmiyorsanız Fabrika Yöntemini kullanın.
 * Fabrika Yöntemi, ürün yapım kodunu, ürünü gerçekten kullanan koddan ayırır.
 * Bu nedenle, ürün yapım kodunu kodun geri kalanından bağımsız olarak genişletmek daha kolaydır.
 * Örneğin, uygulamaya yeni bir ürün türü eklemek için yalnızca yeni bir oluşturucu alt sınıfı oluşturmanız ve içindeki fabrika yöntemini geçersiz kılmanız gerekir.
 * */

/*
 * Kitaplığınızın veya çerçevenizin kullanıcılarına dahili bileşenlerini genişletmenin bir yolunu sağlamak istediğinizde Fabrika Yöntemini kullanın.
 *Kalıtım muhtemelen bir kitaplığın veya çerçevenin varsayılan davranışını genişletmenin en kolay yoludur.
 * Ancak çerçeve, standart bir bileşen yerine alt sınıfınızın kullanılması gerektiğini nasıl anlar?
 *Çözüm, çerçevede bileşenleri oluşturan kodu tek bir fabrika yöntemine indirgemek ve
 * bileşenin kendisini genişletmenin yanı sıra herhangi birinin bu yöntemi geçersiz kılmasına izin vermektir.
 * */