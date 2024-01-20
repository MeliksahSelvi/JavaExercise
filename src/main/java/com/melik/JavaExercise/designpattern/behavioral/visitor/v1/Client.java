package com.melik.JavaExercise.designpattern.behavioral.visitor.v1;

import com.melik.JavaExercise.designpattern.behavioral.visitor.v1.shapes.*;
import com.melik.JavaExercise.designpattern.behavioral.visitor.v1.visitors.XMLExportVisitor;

/*
* Shape interfacesinden türemiş class'lara xml export işlemi uygulamak istediğimizi varsayalım.Her birinin xml formatına dönüşme şekli farklıdır.
* Yani her bir concrete subclass'a bir davranış kazandırmamız gerkeir.Bu işlemi yaparken her bir class içerisinde export methodu koyup kendi içlerinde
* özelleştirebiliriz. Eğer bu concrete shape'leri değiştirmemiz isteniyorsa veya gerekiyorsa(Örn: kaynak kodu elimizde yoksa) bu export xml davranışını
* her bir concrete shape class nesnesinden ayırmamız gerekir. Bunu yapmamızı sağlayan şey Visitor design pattern.  Bu pattern'ı uygulayabilmek için Visitor yani
* yeni davranışı kazandıracak olan visitorların arayüzü, Concrete Visitor yani ihtiyaç duyulan davranışı somutlaştıran visitor nesneleri,Element yani
* ihtiyaç duyulan davranışı gerçek nesnelere enjekte edebilmek için gerekli methodun imzasını barındıran arayüz ve son olarak Concrete Element yani
* davranışı kazanacak asıl nesneler.Örneğimizde Visitor Visitor interfacesi, Concrete Visitor XMLExportVisitor, Element Shape interfacesi, Concrete Element
* Dot,Rectangle,Circle,CompoundShape nesneleridir. Örnekte görüldüğü gibi Shapelerin xml export davranışı var ama bu davranış kendi nesnelerinde yok.
* Bu davranışı visitorlar tabiri caizse misafirin gelip evde iş yapması gibi sağlayıp gidiyor. Yeni bir davranış daha kazandırmak istediğimizde
* tek yapmamız gereken Visitor interfacesini implement etmek.
*
* */
public class Client {
    public static void main(String[] args) {

        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        export(circle, compoundShape);
    }

    private static void export(Shape... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }
}
