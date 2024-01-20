package com.melik.JavaExercise.core.version.java15.sealed;

/*
* Human Ali'yi permit ettiği için Ali Human'ı implement edebilir.
* Ali sealed class SonfOfAli'yi permit ediyor.
*
* */
public abstract sealed class Ali implements Human permits SonOfAli {
    @Override
    public void talk() {
        String s = getClass().getSimpleName() + " can talk";
        System.out.println(s);
    }

    public abstract void isSon();
}
