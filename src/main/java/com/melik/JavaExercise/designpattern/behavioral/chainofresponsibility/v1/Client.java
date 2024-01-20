package com.melik.JavaExercise.designpattern.behavioral.chainofresponsibility.v1;


import com.melik.JavaExercise.designpattern.behavioral.chainofresponsibility.v1.middleware.Middleware;
import com.melik.JavaExercise.designpattern.behavioral.chainofresponsibility.v1.middleware.RoleCheckMiddleware;
import com.melik.JavaExercise.designpattern.behavioral.chainofresponsibility.v1.middleware.ThrottlingMiddleware;
import com.melik.JavaExercise.designpattern.behavioral.chainofresponsibility.v1.middleware.UserExistsMiddleware;
import com.melik.JavaExercise.designpattern.behavioral.chainofresponsibility.v1.server.Server;

import java.util.Scanner;

/*
* Bir requestin filtreleme,user kontrolü,rol kontrolü gibi sıralı işlem yapması gerektiğini varsayalım.
* Bu doğrulama işlemler tek bir class'a method'a koyulduğunda tüm sıralı işlemler bitene kadar doğrulama işlemimiz bekleyecek.
* Fakat arada bir tanesi olumsuz sonuçlanırsa direkt doğrulamayı bitirmemiz gerekse ve öteki işleme geçmemesi gerektiğinde bu durumu handle etmek
* zorlaşır. Ve yeni bir doğrulama işlemi daha geldiğinde open-closed principleyi ihlal ederek ekleyebilir hale getirmiş oluruz mimariyi.
* Bu durumun önüne geçmek için Chain Of Responsbility design pattern bize bir çözüm öneriyor. Her bir doğrulama işlemini birbirinde ayırarak
* sıralı hale getirmek ve her bir doğrulama olumlu olursa diğerine geçme şeklinde tasarlamak daha güzel bir çözüm. Tüm doğrulama işlemlerini
* aynı interfaceden tasarlıyoruz.Her bir doğrulama sadece kendinden sonraki doğrulamayı biliyor.Başka doğrulamalarla ilgilenmiyor.
* Client istediği doğrulamaları istediği sıralamada oluşturabilir. Her zaman sıralama aynı olmayabilir.
* Client bu konuda özgürdür.Aynı zamanda başka doğrulama eklersek diğer kod bloklarını değiştirmeden yani open-closed principle'yi ihlal etmeden
* yapabiliriz.Client aynı zamanda runtime'da doğrulamadaki işlemleri ve sıralarını değiştirebilir.
* */

/*
* CoR örneklerinin çoğu doğrulmayı bulma,onu başlatma ve zincirden çıkma şeklindedir.Bu örnekte biraz farklılık vardır.Bu örnekte istek zincire en baştan girer
* isteği işleyemeyene kadar her zincir katmanı çalıştırılır.
* */
public class Client {
    private static Server server;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        init();

        boolean success;
        do {

            System.out.println("Enter email");
            String email = scanner.nextLine();
            System.out.println("Input password");
            String password = scanner.nextLine();
            success = server.logIn(email, password);

        } while (!success);
    }

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "123");
        server.register("mselvi@uni-yaz.com", "456");

        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        server.setMiddleware(middleware);
    }


}
