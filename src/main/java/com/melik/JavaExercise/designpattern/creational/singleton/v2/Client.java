package com.melik.JavaExercise.designpattern.creational.singleton.v2;

/*
* Multi-Thread bir ortamda prensibimize uygun tasarlanan Singleton class'ının instanceleri oluşuyor.Görüldüğü gibi non multi-thread gibi tek instance değil
* her bir thread için ayrı instance oluşuyor ve o thread süresince aynı instance kullanılarak Singleton pattern'ınına uyulmuş olunuyor.
*
* */

public class Client {
    public static void main(String[] args) {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());

        threadFoo.start();
        threadBar.start();

    }

    static class ThreadFoo implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Foo");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Bar");
            System.out.println(singleton.value);
        }
    }
}
