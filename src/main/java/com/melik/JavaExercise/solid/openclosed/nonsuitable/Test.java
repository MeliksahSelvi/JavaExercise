package com.melik.JavaExercise.solid.openclosed.nonsuitable;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author mselvi
 * @Created 03.07.2023
 */

/*
* Geometrik şekiller ile doldurulan bir liste içerisindekilerin alanları hesaplamak istiyoruz.Görüldüğü üzere her bir elemanda
* instanceof ile tek tek türünü anlamamız ve ona göre alanını hesaplamamız gerekiyor.Eğer yeni bir geometrik şekil eklenirse koda
* bir else if clause daha eklememiz gerekecek. Open-closed principle yazdığımız kodların eklenebilir olmaya açık fakat bu eklemeden dolayı
* kodumuzun yapısında bir değişikliğe gidilmemesi gerektiğini savunur. Biz bu kuralı ihlal etmiş olduk.
* */
public class Test {

    public static void main(String[] args) {

        Square square = new Square(5);
        Circle circle = new Circle(6);

        List<Object> objectList = new ArrayList<Object>();

        objectList.add(square);
        objectList.add(circle);

    }

    private static void calculateAreas(List<Object> objectList) {

        for (Object object : objectList) {

            if (object instanceof Square) {
                Square square = (Square) object;
                int edge = square.getEdge();

                int area = edge * edge;
                System.out.println(area);
            } else if (object instanceof Circle) {
                Circle circle = (Circle) object;
                int radius = circle.getRadius();

                double area = circle.piNumber * radius * radius;

                System.out.println(area);

            }
        }
    }
}
