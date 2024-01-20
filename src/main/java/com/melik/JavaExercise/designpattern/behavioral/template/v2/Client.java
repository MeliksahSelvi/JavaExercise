package com.melik.JavaExercise.designpattern.behavioral.template.v2;

import com.melik.JavaExercise.designpattern.behavioral.template.v2.developer.Junior;
import com.melik.JavaExercise.designpattern.behavioral.template.v2.developer.Programmer;
import com.melik.JavaExercise.designpattern.behavioral.template.v2.developer.Senior;

/*
* Programmer class'ında template olarak final doIt() methodunu belirledik.İçerisinde belirlediğimiz sırada methodlar var.
* Bazılarına default implemtation verdik.Mesela writesTest().Nedeni her class'ta tekrar eden kod blokları default implementation'a sahip olması
* daha iyidir.Bazı methodları concrete subclass'ların override etmesi için abstract bıraktık.
* writesCode() gibi.Nedeni her yazılımcı nasıl kod yazar bilemeyiz.Onu subclass'lar belirleyecek.Ayrıca bir adet
* hook methodu yazdık hasReview().Hook methodu Bu bir nevi concrete subclass'ların template methoduna kontrollü müdahalesi gibi düşünülebilir.
* Code Review yapıp yapamadığını subclass belirler template method da bu duruma göre codeReview() methodunu çalıştırır veya çalıştırmaz.Buradaki ana mantık
* template methodumuzun çalışma prensibi belli.Farklılaşabilecek methodları subclass'lar implement edebilir veya override edebilir.Bu sayede farklı developer
* seviyelerinin her biri aynı baseclass'taki template methodunun çalışma  mantığına göre çalıştı.Farklı olabilecek durumlar kendilerine göre şekillendi.
* İşte Polymorphism!
*
* */
public class Client {
    public static void main(String[] args) {

        Programmer programmer=new Junior();
        System.out.println("JUNIOR DOES:\n");
        programmer.doIt();
        System.out.println("*************************");
        Programmer otherProgrammer=new Senior();
        System.out.println("\nSENIOR DOES :\n");
        otherProgrammer.doIt();
    }
}
