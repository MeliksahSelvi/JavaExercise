package com.melik.JavaExercise.designpattern.structural.facade.v1.siparis;

public class SepettekiUrun {

    private Long id;
    private String urunAdi;
    private int adet;
    private Double fiyat;

    public SepettekiUrun(Long id, String urunAdi, int adet, Double fiyat) {
        this.id = id;
        this.urunAdi = urunAdi;
        this.adet = adet;
        this.fiyat = fiyat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }
}
