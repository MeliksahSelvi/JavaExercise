package com.melik.JavaExercise.designpattern.structural.adapter.v1;

import com.melik.JavaExercise.designpattern.structural.adapter.v1.adapters.SquarePegAdapter;
import com.melik.JavaExercise.designpattern.structural.adapter.v1.round.RoundHole;
import com.melik.JavaExercise.designpattern.structural.adapter.v1.round.RoundPeg;
import com.melik.JavaExercise.designpattern.structural.adapter.v1.square.SquarePeg;

/*
* Normalde Elimizde RoundHole ve ona uyumlu olan RoundPeg var.Sonradan RoundHole'ye uyumlu olmayan SquarePeg'in
* RoundHole ile birlikte çalışması istenirse birbiri ile uyumsuz olan iki nesnenin ilişkisi söz konusu olur.
* İşte tam burada Adapter Design Pattern imdadımıza yetişiyor. SquarePegAdapter tanımlıyoruz.Kendisi aynı zamanda bir RoundPeg.
* Adapter, RoundHole ile uyumlu olmayan SquarePeg'i sarmallayarak onu uyumlu hale getiriyor.Bunu yapmak için de RoundPeg'in
* RoundHole ile uyumlu olup olmadığını denetlemekte kullanılan radius özelliğini override ediyor.Bu ezme işlemi ile;
* SquarePeg sanki radius özelliğine sahip ve artık onu RoundHole'ye uyumlu olarak kullanabiliriz.
* Buradaki Adapter Object Adapter yani Composition(has-a) ilişkisi ile oluşturuldu.Adapter'ımız SquarePeg nesnesine sahip.
* */
public class Client {
    public static void main(String[] args) {
        RoundPeg roundPeg=new RoundPeg(5);
        RoundHole roundHole=new RoundHole(5);

        if (roundHole.fits(roundPeg)){
            System.out.println("Round peg r5 fits round hole r5");
        }

        SquarePeg smallSqPeg=new SquarePeg(2);
        SquarePeg largeSqPeg=new SquarePeg(20);

        SquarePegAdapter smallSqPegAdapter=new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter=new SquarePegAdapter(largeSqPeg);

        if (roundHole.fits(smallSqPegAdapter)){
            System.out.println("Square peg w2 fits round hole r5");
        }

        if (!roundHole.fits(largeSqPegAdapter)){
            System.out.println("Square peg w20 does not fits round hole r5");
        }
    }
}
