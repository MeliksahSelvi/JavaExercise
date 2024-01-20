package com.melik.JavaExercise.designpattern.behavioral.command.v1;


/*
* Kopyalama, yapıştırma, kesme ve geri alma işlemleri olan bir editörümüz var. Her bireri için birer button yazmayı düşünebiliriz.
* Fakat bu button'ların görevleri farklı. Bunun için buttonların clicklistenerları farklı olmalı. Her birinin clicklistener'larını tasarlayabilmek için
* subclass yazmak en basit çözüm gibi duruyor. Fakat başka yerlerden de bu işlemleri yapmamız gerekseydi? Mesela kopyalama için button'da kullanabilir veya
* klavyeden ctrl+c ye de basabilir.Bu durumda aynı görevi yapan farklı subclass'lar türetmek zorunda kalırız. Bu durumda button listenerdaki kodu
* diğer menü(mesela ctrl+c ile kopyalama) subclassları için çoğaltmamız gerekiyor. Ve kodumuz giderek button'ların business logic koduna bağımlı hale geliyor.
* Amacımız bu durumu ortadan kaldırmak. Yani Subclass'ların gereğinden fazla çoğalıp kodu karmaşıklaştırmaması. Ayrıca yeni bir button veya özellik eklememiz gerekse
* kodumuzu refactor etmek zorunda kalabiliriz.Command pattern'ına göre buttonların olduğu katman GUI katmanı, listenerdaki yapılması gerekenler
* yani business logic için katmanı ile direkt iletişim kurmak yerine ara katman olarak command class'larını kullanması gerekir.Bu command class'ları aynı birimden
* türemeli ve bu birim üzerindeki aynı methodu kullanmalılar. Command'ı gönderen class da parametresiz tek method ile işlerini halletmeli.GUI katmanı pattern'dan önce
* parametre gönderiyor ise bu parametrik bilgileri comamnd class'ını inşa ederken kullanmalıyız. Command class'ları GUI ile business logic katmanı arasında
* bağlantıyı azaltan ara katman haline gelir.
* */

import com.melik.JavaExercise.designpattern.behavioral.command.v1.editor.Editor;

public class Client {
    public static void main(String[] args) {
        Editor editor=new Editor();
        editor.init();
    }
}
