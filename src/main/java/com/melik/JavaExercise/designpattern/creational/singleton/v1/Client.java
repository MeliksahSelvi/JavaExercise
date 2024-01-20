package com.melik.JavaExercise.designpattern.creational.singleton.v1;

/*
* Singleton class'ımızın sadece bir tane nesnesi olabilecek şekilde tasarladık.Bu sayede bu class'tan nesne üretmek isteyen client sadece bir kere
* üretebilecek. Kullanmak istediği zaman ilk üretilen nesneyi sürekli kullanacak. Mesela db connection nesneleri bu prensiple tasarlanır. Nesne bir kere tasarlanır
* bağlantı bir kere kurulur sürekli o nesne kullanılarak yeni nesne üretip gereksiz bellek harcanmasının önüne geçmiş oluruz.
*
* */
public class Client {
    public static void main(String[] args) {

        Singleton singleton=Singleton.getInstance("foo");

        Singleton anotherSingleton=Singleton.getInstance("bar");

        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
