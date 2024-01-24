package com.melik.JavaExercise.core.version.java9.stream;

import java.util.stream.Stream;

/**
 * @Author mselvi
 * @Created 21.01.2024
 */

public class StreamJava9 {
    public static void main(String[] args) {


        Stream<Integer> integerStream = Stream.of(2, 4, 6, 7, 8);
        //filter'da tüm stream'i dolaşıyor.
        integerStream.filter(integer -> integer%2==0).forEach(System.out::println);
        //takewhile'da 7 yi gördüğü anda stream'den çıkıyor.
        integerStream.takeWhile(integer -> integer%2==0).forEach(System.out::println);
        //dropwhile'da 7'ye kadar olanları drop edip 7 geldiği anda onu ve geri kalan stream'i alıyor.
        integerStream.dropWhile(integer -> integer%2==0).forEach(System.out::println);
    }
}
