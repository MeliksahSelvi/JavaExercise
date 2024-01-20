package com.melik.JavaExercise.solid.liskovsubstitution.suitable;

/**
 * @Author mselvi
 * @Created 06.07.2023
 */

/*
* Az önceki Liskov prensibini ihlal durumundan kurtarmak için Square'yi Rectangle'dan üretmek yerine ikisini de ayrı ayrı üretiyoruz.
* Client Square'yi kullanırken onu Rectangle gibi kullanmaya çalışmadığı için beklenilen senaryoya göre nesne üretim yapılıyor.
* Ayrıca iki yapıyıda Shape interfacesi ile kullanarak Client'ı soyut kavramlar ile çalıştırıp her bir Shape türünün ayrıntılarını
* bilmek zorunda bırakmıyoruz.Aynı zamanda bu SOLID prensiplerinden Dependency Inversion kavramına denk gelmiş oluyor.
* */
public class Test {

    public static void main(String[] args) {

        Shape rectangle=new Rectangle(5,8);
        System.out.println(rectangle.getArea());

        Shape square=new Square(5);
        System.out.println(square.getArea());
    }
}
