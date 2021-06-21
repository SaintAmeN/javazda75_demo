package com.javazda75.solid.strategy;

public class Bohater {
    private String imie;
    private IStrategiaWalki strategiaWalki;

    public Bohater(String imie) {
        this.imie = imie;
    }

    public void setStrategiaWalki(IStrategiaWalki strategiaWalki) {
        this.strategiaWalki = strategiaWalki;
    }

    public void walcz(){
        this.strategiaWalki.walcz();
    }
}
