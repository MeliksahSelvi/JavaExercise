package com.melik.JavaExercise.solid.liskovsubstitution.nonsuitable;

/**
 * @Author mselvi
 * @Created 06.07.2023
 */


/*
* Rectangle nesnesi oluşturup width ve height değerlerini setleyip getArea() methodu ile alanını hesaplamamız beklenen senaryo.
* Liskov prensibine göre Square'yi Upcasting ile Rectangle yerine kullanmaya çalıştığımızda davranış olarak client'ı şaşırtmaması gerekir.
* Client Rectangle ile çalışmada 2 değeri setlemeyi bekliyor biz Square'yi Rectangle yerine kullandığımızda davranış olarak
* Client Rectangle davranışı ile Square'yi kullanamadı. Çünkü Square tek parametre ile oluşabiliyor. Liskov prensibi ihlal edilmiş oldu.
*
* */
public class Test {

    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle(5,8);
        rectangle.setWidth(5);
        rectangle.setHeight(8);

        System.out.println(rectangle.getArea());


        Rectangle rectangleSquare=new Square(5);

        System.out.println(rectangleSquare.getArea());
    }
}
