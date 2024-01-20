package com.melik.JavaExercise.designpattern.behavioral.state.v1;

import com.melik.JavaExercise.designpattern.behavioral.state.v1.ui.Player;
import com.melik.JavaExercise.designpattern.behavioral.state.v1.ui.UI;

/*
* Video oynatma programı tasarlıyoruz. Burada oynatma durdurma next video ve previous video buttonlarına ihtiyacımız olduğunu düşünelim.Her bir button kendisine
* tıklandığında şuanki state'ine göre farklı davranır. Mesela video oynuyorken next'e basarsanız next video açılır fakat video duruyorken yani herhangi bir video
* oynatılmıyorken next'e basarsak herhangi bir video açılmaz. Bir nesnemizin durumu değiştiğinde davranışı değişebiliyorsa bu durumu ilk etapta if else veya switch
* ile kontrol etmeyi düşünebiliriz.Fakat kodumuz karmaşıklaşır ileride işin içine başka bir durum girdiği zaman kodu refactor etmemiz gerekir.
* Burada design pattern devreye giriyor.Her bir durum için somut class tanımlarız. Hepsi aynı interfaceden türetilmesi gerekir.
* Sonra Context tanımlarız içinde state tutar ve state'e özgü tüm işlemleri ilgili state'ye bırakır. Bu context'in statesi güncellenebilir olmalıdır.
* Context her işlemde o anki state'ye göre nesnenin davranış değiştirmesini sağlar.
*
* */
public class Client {
    public static void main(String[] args) {
        Player player=new Player();
        UI ui=new UI(player);
        ui.init();
    }
}
