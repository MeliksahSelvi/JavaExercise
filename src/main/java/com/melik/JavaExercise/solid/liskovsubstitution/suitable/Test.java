package com.melik.JavaExercise.solid.liskovsubstitution.suitable;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author mselvi
 * @Created 06.07.2023
 */

/*
* Az önceki Liskov prensibini ihlal durumundan kurtarmak için Square'yi Rectangle'dan kalıtım almak yerine ikisini de ayrı ayrı üretiyoruz.
* Client Square'yi kullanırken onu Rectangle gibi kullanmaya çalışmadığı için beklenilen senaryoya göre nesne üretim yapılıyor.
* Ayrıca iki yapıyıda Shape interfacesi ile kullanarak Client'ı soyut kavramlar ile çalıştırıp her bir Shape türünün ayrıntılarını
* bilmek zorunda bırakmıyoruz.Aynı zamanda bu SOLID prensiplerinden Dependency Inversion kavramına denk gelmiş oluyor.
* */
public class Test {

    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle();
        rectangle.setHeight(8);
        rectangle.setWidth(5);

        Square square=new Square();
        square.setEdge(5);

        List<Shape> shapeList=new ArrayList<>();
        shapeList.add(rectangle);
        shapeList.add(square);

        for (Shape shape : shapeList) {
            System.out.println(shape.getArea());
        }
    }
}
