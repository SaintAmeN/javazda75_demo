package com.javazda75.ptaki_polimorfizm;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ptak p = new Ptak();

        List<Ptak> list = new ArrayList<>();
        list.add(new Ptak());
        list.add(new Kukułka());
        list.add(new Sowa());
        list.add(new Sowa());
        list.add(new Sowa());
        list.add(new Kukułka());
        list.add(new Kukułka());
        list.add(new Sowa());
        list.add(new Kukułka());
        list.add(new Kukułka());

        for (Ptak ptak : list) {
            ptak.spiewaj();
        }

    }
}
