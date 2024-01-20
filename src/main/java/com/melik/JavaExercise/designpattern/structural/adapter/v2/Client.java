package com.melik.JavaExercise.designpattern.structural.adapter.v2;

import com.melik.JavaExercise.designpattern.structural.adapter.v2.adapter.CodeXAdapter;
import com.melik.JavaExercise.designpattern.structural.adapter.v2.codex.CodeX;
import com.melik.JavaExercise.designpattern.structural.adapter.v2.crypt.Crypt;
import com.melik.JavaExercise.designpattern.structural.adapter.v2.crypt.CryptImpl;
/*
*Normalde sadece Crypt interfacesini implement eden class'lar(mesela CryptImpl) encrypt ve decrypt methodlarını kullanabilir.
* Codex bir Crypt değil bizim bir şekilde onu encypt ve decrypt etmemiz gerek.Burada CodexAdapter yardımıza yetişti.Görevi CodeX'i
* Crypt olmadığı halde onun gibi davranmasını sağlamak.Composition ilişkisi ile bunu başardı.
* */
public class Client {
    public static void main(String[] args) {

        Crypt crypt = new CryptImpl();
        crypt.encrypt("Deneme");
        crypt.decrypt("Deneme");

        CodeX codeX=new CodeX();
        System.out.println("\n***********\n");

        crypt=new CodeXAdapter(codeX);
        crypt.encrypt("Deneme2");
        crypt.decrypt("Deneme2");
    }
}
