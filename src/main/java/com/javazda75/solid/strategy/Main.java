package com.javazda75.solid.strategy;

public class Main {
    public static void main(String[] args) {
        Bohater bohater = new Bohater("Marian");
        bohater.setStrategiaWalki(new StrategiaWalkiLukiem());
        bohater.walcz();
        bohater.walcz();
        bohater.walcz();
        bohater.setStrategiaWalki(new StrategiaWalkiMieczem());
        bohater.walcz();
        bohater.setStrategiaWalki(new StrategiaWalkiOwca());
        bohater.walcz();

    }
}
