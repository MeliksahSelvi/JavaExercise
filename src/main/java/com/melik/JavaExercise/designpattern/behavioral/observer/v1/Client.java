package com.melik.JavaExercise.designpattern.behavioral.observer.v1;

import com.melik.JavaExercise.designpattern.behavioral.observer.v1.editor.Editor;
import com.melik.JavaExercise.designpattern.behavioral.observer.v1.listeners.EmailNotificationListener;
import com.melik.JavaExercise.designpattern.behavioral.observer.v1.listeners.LogOpenListener;

/*
*  Bir obje değiştiğinde onu kullanan diğer objelerin de otomatik güncellenmesi gibi bir durumla karşı karşıya kaldığımızda diğer objeleri de
* tek tek güncellemek yerine bir düzenek kurup yapılan değişikliklerde diğer objelerin hepsinin tek işlemle güncellenmesi gerekti. Bunun için
* Observer design pattern'ını kullandık. Dosya açma ve kapama işlemeri meydana geldiğinde değişikliklerden haberdar olmak isteyen nesneler
* subscribe unsubscribe mantığı ile ilgili açma ve kapama işlemlerine abone olurlar. Bu abonelikleri publisher yani EventManager class'ında tutarız.
* Bu publisherı editor yönetir. Bir open veya save işlemi olduğunda publisher tek bir methodla tüm subscriberleri bilgilendirir.
*
* */
public class Client {
    public static void main(String[] args) {

        LogOpenListener logOpenListener = new LogOpenListener("/path/to/log/file.txt");
        LogOpenListener logOpenListener2 = new LogOpenListener("/path/to/log/file2.txt");

        EmailNotificationListener emailNotificationListener = new EmailNotificationListener("admin@example.com");
        EmailNotificationListener emailNotificationListener2 = new EmailNotificationListener("admin@example.com2");

        Editor editor = new Editor();
        editor.eventManager.subscribe("open", logOpenListener);
        editor.eventManager.subscribe("open", logOpenListener2);
        editor.eventManager.subscribe("save", emailNotificationListener);
        editor.eventManager.subscribe("save", emailNotificationListener2);

        openAndSave(editor);

        System.out.println("--------------------------------------");

        editor.eventManager.unsubscribe("open",logOpenListener2);
        editor.eventManager.unsubscribe("save",emailNotificationListener2);

        openAndSave(editor);
    }

    private static void openAndSave(Editor editor) {
        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
