package com.melik.JavaExercise.designpattern.structural.flyweight.v1;

import com.melik.JavaExercise.designpattern.structural.flyweight.v1.forest.Forest;

import java.awt.*;

/*
* Client bir orman nesnesi oluşturup içine 1 milyon ağaç koymaya karar verdi. Burada 1 milyon ağaç eklenebilir bu da büyük bir RAM harcanması demektir.
* Ama burada farkedilmesi gereken şey her elimizde 2 ağaç türü var.500 bin ağaç kendi içerisinde tekrar eden aynı verilere sahipler.
* Bu tekrar eden verilerin RAM'in gereksiz yere çalışmasına sebebiyet vereceği aşikar.Bu durumu  önlemek için Flyweight design pattern'ını kullandık.
* Her Tree nesnesi için tekrar eden veya edebilecek verileri(name,color,otherTreeData) TreeType class'ı içinde tutuyoruz.
* Bu class'ın içine koyacağımız field'ları seçerken immutable olmasına dikkat etmemiz gerekiyor. Mutable olanlar Tree class'ında kalabilir.
* Immutable nesnelerine Flyweight nesneleri denir. Bu Flyweight nesnelerinin oluşumunu yönetmek için TreeFactory oluşturuyoruz. Eğer immutable veri factory'de
* varsa onu veriyor yoksa ekliyor. Bu şekilde tekrar eden verileri tutmaktan kurtulmuş oluyoruz. Aynı zamanda RAM tasarrufu için kurguladığımız bu değişen düzenden
* Client değişen yapıdan etkilenmiyor.
* */
public class Client {

    private static int CANVAS_SIZE = 500;
    private static int TREES_TO_DRAW = 1000000;
    private static int TREE_TYPES = 2;

    public static void main(String[] args) {
        Forest forest = new Forest();

        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak Texture Stub");

            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak Texture Stub");
        }

        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("-------------------");
        System.out.println("memory usage: ");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
