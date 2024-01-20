package com.melik.JavaExercise.designpattern.structural.decorator.v1;

import com.melik.JavaExercise.designpattern.structural.decorator.v1.decorators.EncodeDecorator;
import com.melik.JavaExercise.designpattern.structural.decorator.v1.decorators.SignDecorator;
import com.melik.JavaExercise.designpattern.structural.decorator.v1.mail.BaseMail;
import com.melik.JavaExercise.designpattern.structural.decorator.v1.mail.Mail;

/*
* Client runtime'da nesne'nin yapısına dokunmadan ona yeni özellikler kazandırabiliyor.Normalde bir nesneye yeni özellik kazandırmanın yolu
* kalıtımdır.Ancak kalıtım her zaman işimizi görmeyebilir.Mesela örneğimizde hem şifrelenmiş hem imzalanmış mail göndermek istediğimiz zaman bunu
* kalıtımla yapmaya çalışsaydık hem Sign özelliği olan bir yapıyı hem de Encode özelliği olan bir yapıyı kalıtım almamız gerekirdi.Çok karmaşık bir yapı
* elde etmiş olurduk. Bunun yerine diğer adı Wrapper olan Decorator pattern'ını kullandık. Ve kutu içinde kutu örneği gibi elimizdeki nesneyi istediğimiz kadar
* sarmallayarak nesneye yeni özellikler kazandırdık.ve her sarmallamamızda da Mail nesnesinin yapısını değiştirmeden nesneye yeni özellikler kazandırdık.
* Artık ister düz mail veya şifreleme ve imzalama ile kombinleyerek istediğimiz formatta mail gönderebiliriz.Aynı zamanda yeni bir özellik eklemek istersek
* bunu open-closed principle'yi ihlal etmeden yani elimizdeki düzende değişiklik yapmadan BaseDecorator'dan yeni bir Decorator türeterek yapabiliriz.
* */

/*
* Adapter ile benzer yönleri var fakat aralarında bazı farklar var.
*
* -Adapter mevcut nesnenin arayüzünü değiştirirken,Decorator arayüzü değiştirmeden onu geliştirir.
* */
public class Client {
    public static void main(String[] args) {

        System.out.println("Standart Mail");
        Mail standartMail = new BaseMail("Ali", "Veli");
        standartMail.send();

        System.out.println("-----------------");
        System.out.println("Şifrelenmiş Mail");
        Mail encodedMail = new EncodeDecorator(standartMail);
        encodedMail.send();

        System.out.println("-----------------");
        System.out.println("İmzalanmış Mail");
        Mail signedMail = new SignDecorator(standartMail, "Ali");
        signedMail.send();

        System.out.println("-----------------");
        System.out.println("Hem Şifrelenmiş Hem İmzalanmış Mail");
        Mail signedAndEncodedMail=new SignDecorator(encodedMail,"Ali");
        signedAndEncodedMail.send();
    }
}
