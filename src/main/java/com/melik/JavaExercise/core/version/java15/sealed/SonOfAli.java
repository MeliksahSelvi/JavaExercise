package com.melik.JavaExercise.core.version.java15.sealed;

/*
* Ali SonOfAli'yi permit ettiği için kalıtım alabilir.
* SonOfAli sealed class'tan extend aldığı için kendisi de ya final ya sealed ya da non-sealed olmalıdır.
*
* */
public non-sealed class SonOfAli extends Ali {
    @Override
    public void isSon() {
        String superClassName = getClass().getSuperclass().getSimpleName();
        String className = getClass().getSimpleName();
        System.out.println(className+" "+superClassName+"'nin oğludur.");
    }

    public void awfaw(){

    }
}
