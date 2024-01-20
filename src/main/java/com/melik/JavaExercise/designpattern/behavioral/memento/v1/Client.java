package com.melik.JavaExercise.designpattern.behavioral.memento.v1;

import com.melik.JavaExercise.designpattern.behavioral.memento.v1.editor.Editor;
import com.melik.JavaExercise.designpattern.behavioral.memento.v1.shapes.Circle;
import com.melik.JavaExercise.designpattern.behavioral.memento.v1.shapes.CompoundShape;
import com.melik.JavaExercise.designpattern.behavioral.memento.v1.shapes.Dot;
import com.melik.JavaExercise.designpattern.behavioral.memento.v1.shapes.Rectangle;

import java.awt.*;


/*
* Grafik düzenleyicimiz var.Ekrandaki şekillerin rengini ve konumunu değiştirmeye izin veriyor. Geri alınabilir tekrar yüklenebilir.
* Geri alma işlemi için Memento ve Command design pattern'ını beraber kullandık.Memento design pattern'ı 3 nesneden oluşur:
* -Originator(nesnenin nasıl kaydedileceğini bilen sınıf) bizim örneğimizde Editor nesneleri
* -Memento(Kaydedilecek nesnenin state'ini tutar) bizim örneğimizde Memento nesneleri
* -CareTaker(Memento nesnesinin versiyonlarını tutar) bizim örneğimizde Command nesneleri
*
* Originatorumuz yani Editor bir yedekleme yaparken yedeklemeyi History aracılığı ile command nesnesine bağlar ve bu command nesnelerinin takibini yapar.
* Geri alma işlemi yapılmak istendiğinde Originator History'den bir command getirir ve bu command'in içinde tutulan yedek veriden state'i geri yükler.
* Burada CareTaker yani memento'nun versiyonlarını tutan Command memento'nun içini göremez. Memento'nun içine sadece onu üreten Originator erişebilir.
* */
public class Client {
    public static void main(String[] args) {

        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
