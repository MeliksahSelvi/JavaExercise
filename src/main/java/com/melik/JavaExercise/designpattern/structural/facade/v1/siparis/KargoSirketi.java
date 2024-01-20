package com.melik.JavaExercise.designpattern.structural.facade.v1.siparis;

public class KargoSirketi {

    private String name;
    private String iletisim;

    public KargoSirketi(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIletisim() {
        return iletisim;
    }

    public void setIletisim(String iletisim) {
        this.iletisim = iletisim;
    }
}
