package com.melik.JavaExercise.designpattern.creational.prototype.v1;

import com.melik.JavaExercise.designpattern.creational.prototype.v1.shapes.Circle;
import com.melik.JavaExercise.designpattern.creational.prototype.v1.shapes.Rectangle;
import com.melik.JavaExercise.designpattern.creational.prototype.v1.shapes.Shape;

import java.util.ArrayList;
import java.util.List;
/*
* prototype methodunda Prototype design pattern uygulanarak tasarlanmış class'ların clone methodu kullanıldı.kopyası oluşturulurken
* nesneyi olduğu gibi öteki nesneye koymuyoruz da içindeki veriler ile aynı olacak şekilde başka bir nesneyi koyuyoruz.sonra da compare edince görüyoruz ki
* clone'ladığımız nesne asıl nesneden farklı nesne ama değerleri aynı.orjinal nesneyi kullanmıyoruz prototipini kullanmış oluyoruz.Aynı zamanda yeni bir nesne
* elde ederken başlatma kodundan kurtulduk ve yeni kaynak harcamadan yeni bir nesne elde ettik.
* Elimizde bir nesne vardı. Normalde aynı türde başka bir nesne oluşturmak istersek o nesnenin somut bağımlılıklarını
* bilmeye ve uygulamaya mecbur oluruz.Prototype pattern'ı ile o bağımlılıklara takılmadan yeni bir nesne ürettik.
* */


public class Client {
    public static void main(String[] args) {
        prototype();
    }

    private static void prototype() {
        List<Shape> copyShapeList = new ArrayList<>();

        List<Shape> shapeList = new ArrayList<>();
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        shapeList.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapeList.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.height = 20;
        rectangle.width = 30;
        rectangle.color = "blue";
        shapeList.add(rectangle);

        cloneAndCompare(shapeList,copyShapeList);
    }

    private static void cloneAndCompare(List<Shape> shapeList, List<Shape> copyShapeList) {

        for (Shape shape : shapeList) {
            copyShapeList.add(shape.clone());
        }

        for (int i=0;i<shapeList.size();i++){
            if (shapeList.get(i)!=copyShapeList.get(i)){
                System.out.println(i+" Shapes are different objects!");

                if (shapeList.get(i).equals(copyShapeList.get(i))){
                    System.out.println(i+" And They are identical!");
                }
                else {
                    System.out.println("But they are not identical!");
                }
            }
            else {
                System.out.println(" Objects are the same!");
            }

        }
    }
}
