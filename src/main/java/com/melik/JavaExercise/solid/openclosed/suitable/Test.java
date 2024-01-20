package com.melik.JavaExercise.solid.openclosed.suitable;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author mselvi
 * @Created 03.07.2023
 */

/*
 * Az önceki örnekte ihlal ettiğimiz open-closed principleyi kodumuza uygulayarak yapımızı düzeltiyoruz. Shape interfacesini oluşturup
 * her bir geometrik şekili bu interfaceden implement edip getArea() methoduna implementation sağlıyoruz. Bu sayede yeni bir geometrik şekil
 * eklemek istediğimiz alan hesapladığımız kodda bir değişikliğe gerek kalmadan isteğimizi gerçekleştirebilmiş olacağız. Client soyut katman olan
 * Shape ile çalışmakta bu sayede kodumuz open-closed principle'ye uygun hale gelmiş oluyor.
 * */
public class Test {
    public static void main(String[] args) {

        Shape rectangle=new Rectangle(5,10);
        Shape triangle=new Triangle(15,4);

        List<Shape> shapeList=new ArrayList<Shape>();
        shapeList.add(rectangle);
        shapeList.add(triangle);

        calculateAreas(shapeList);
    }

    private static void calculateAreas(List<Shape> shapeList){

        for (Shape shape : shapeList) {
            int area = shape.getArea();
            System.out.println(area);
        }
    }
}
