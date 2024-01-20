package com.melik.JavaExercise.designpattern.creational.builder.v1;


public class Ev {

    private String il;
    private String ilce;
    private String mahalle;

    private int binaYili;
    private int odaSayisi;
    private int balkonSayisi;
    private int banyoSayisi;
    private int tuvaletSayisi;

    private boolean isDublex;
    private boolean isEsyali;
    private boolean hasOtopark;
    private boolean hasCocukParki;
    private boolean hasKlima;
    private boolean hasHavuz;

    private Ev(EvBuilder evBuilder) {
        this.il = evBuilder.il;
        this.ilce = evBuilder.ilce;
        this.mahalle = evBuilder.mahalle;
        this.binaYili = evBuilder.binaYili;
        this.balkonSayisi = evBuilder.balkonSayisi;
        this.odaSayisi = evBuilder.odaSayisi;
        this.banyoSayisi = evBuilder.banyoSayisi;
        this.tuvaletSayisi = evBuilder.tuvaletSayisi;
        this.isDublex = evBuilder.isDublex;
        this.isEsyali = evBuilder.isEsyali;
        this.hasOtopark = evBuilder.hasOtopark;
        this.hasCocukParki = evBuilder.hasCocukParki;
        this.hasKlima = evBuilder.hasKlima;
        this.hasHavuz = evBuilder.hasHavuz;
    }

    public static class EvBuilder {

        private String il;
        private String ilce;
        private String mahalle;

        private int binaYili;
        private int balkonSayisi;
        private int odaSayisi;
        private int banyoSayisi;
        private int tuvaletSayisi;

        private boolean isDublex;
        private boolean isEsyali;
        private boolean hasOtopark;
        private boolean hasCocukParki;
        private boolean hasKlima;
        private boolean hasHavuz;


        public static EvBuilder buildNormalEv(String il, String ilce, String mahalle, int binaYili, int odaSayisi) {
            EvBuilder evBuilder = new EvBuilder();
            evBuilder.il = il;
            evBuilder.ilce = ilce;
            evBuilder.mahalle = mahalle;
            evBuilder.binaYili = binaYili;
            evBuilder.odaSayisi = odaSayisi;
            evBuilder.hasOtopark=true;
            return evBuilder;
        }

        public static EvBuilder buildHavuzluEv(String il, String ilce, String mahalle, int binaYili, int odaSayisi) {
            EvBuilder evBuilder = new EvBuilder();
            evBuilder.il = il;
            evBuilder.ilce = ilce;
            evBuilder.mahalle = mahalle;
            evBuilder.binaYili = binaYili;
            evBuilder.odaSayisi = odaSayisi;
            evBuilder.hasHavuz = true;
            evBuilder.hasKlima=true;
            evBuilder.hasOtopark=true;
            evBuilder.hasCocukParki=true;
            return evBuilder;
        }

        public EvBuilder setBalkonSayisi(int balkonSayisi) {
            this.balkonSayisi = balkonSayisi;
            return this;
        }

        public EvBuilder setBanyoSayisi(int banyoSayisi) {
            this.banyoSayisi = banyoSayisi;
            return this;
        }

        public EvBuilder setTuvaletSayisi(int tuvaletSayisi) {
            this.tuvaletSayisi = tuvaletSayisi;
            return this;
        }

        public EvBuilder setDublex(boolean dublex) {
            isDublex = dublex;
            return this;
        }

        public EvBuilder setEsyali(boolean esyali) {
            isEsyali = esyali;
            return this;
        }

        public Ev build() {
            return new Ev(this);
        }
    }
}
