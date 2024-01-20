package com.melik.JavaExercise.designpattern.behavioral.mediator.v1;

import com.melik.JavaExercise.designpattern.behavioral.mediator.v1.mediators.ChatMediator;
import com.melik.JavaExercise.designpattern.behavioral.mediator.v1.mediators.ChatMediatorImpl;
import com.melik.JavaExercise.designpattern.behavioral.mediator.v1.users.User;
import com.melik.JavaExercise.designpattern.behavioral.mediator.v1.users.UserImpl;

/*
* Bir toplu sohbet odası uygulamamız var.Katılımcılarımız sohbet odasına mesaj atmak istiyorlar. Toplamda 5 katılımcı olduğunu varsayalım.
* Bir kullanıcı odaya bir mesaj attığında geride kalan 4 kişiye mesajın iletilmesi gerekir. Bunu tek tek mi yapması mı mantıklı yoksa mesajı bir kere göndermesi
* ve bu mesajın arka planda bir düzenek tarafından diğer kullanıcılara iletilmesi mi ?Tek tek mesaj atması biraz saçma ve uğraştırıcı bir durum.
* İşte arka planda olup bir mesajı diğer kullanıcılara ileten düzenek Mediator pattern'ı ile oluşturulmuş ChatMediator interfacesini implement eden
* ChatMediatorImpl class'ıdır. Bu şekilde bir kullanıcı toplu mesaj atarken tek tek kime attığını bilmek zorunda değildir. Sadece mesajı bilmesi yeterlidir.
* Bizim örneğimizde User diğer User nesneleri ile direkt iletişim kurmak yerine sadece Mediator nesnesini elinde tutar ve diğer User'larla bu nesne üzerinden
* iletişim kurar.
*
* */
public class Client {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImpl();
        User user1 = new UserImpl(chatMediator, "Ali");
        User user2 = new UserImpl(chatMediator, "Veli");
        User user3 = new UserImpl(chatMediator, "Aslı");
        User user4 = new UserImpl(chatMediator, "Zeynep");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        chatMediator.addUser(user4);

        user1.send("Hi All");
    }
}
