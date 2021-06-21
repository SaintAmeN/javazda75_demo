package com.javazda75.solid;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // SOLID
        // S - single responsibility
        //      - każda metoda powinna robić jedną rzecz ? - ponieważ możemy to wtedy łatwo przetestować jednostkowo
        //      - każda klasa powinna robić jedną rzecz
        //              - jeśli coś się zepsuje to powinien istnieć tylko jeden powód do edycji klasy/funkcji
        //
        // O - open close - zamknięty na modyfikacje, otwarty na rozszerzenia
        //      - wzorce projektowe: strategia
        //      - możliwość dodania funkcjonalności bez konieczności edycji starego kodu
        //
        // L - Liskov Substitution -
        //      - po lewej stronie równania/przypisania zawsze stawiamy możliwie najwyższą klasę/interfejs nadrzędną/y
        //
        // I - Interface segregation
        //      - dzielmy interfejsy na mniejsze, w pełni wspieralne
        //
        // D - Dependency inversion (dependency injection)
        //      - nie robimy cyklicznych zależności
        //      - komponenty wyższych poziomów nie powinny być uzależnione od komponentów niższych poziomów


        // KOLEKCJE
        //
        //
        // LISTY:
        //  - Array     List
        //  - Linked    List
        //
        //  - Hash          Set     -
        //  - Tree          Set     - drzewo (sortuje)
        //  - LinkedHash    Set     - zachowuje kolejność dodawania
        //
        //  - Hash          Map     -
        //  - Tree          Map     - drzewo (sortuje) [klucze]
        //  - LinkedHash    Map     - zachowuje kolejność dodawania [klucze]
        //

        List<Integer> list = new LinkedList<>();

        dodaj(list, 1000000);
        long czasStart = System.currentTimeMillis();

//        dodaj(list, 1000000);
//        przeszukaj(list);
        przeszukajObiekty(list);

        long czasStop = System.currentTimeMillis();
        System.out.println("Czas: " + (czasStop - czasStart));
    }

    private static void dodaj(List<Integer> list, int ilosc) {
        for (int j = 0; j < ilosc; j++) {
            list.add(j);
        }
    }

    private static int przeszukaj(List<Integer> list) {
        int val = 0;
        for (int j = 0; j < list.size(); j++) {
            val = list.get(j);
        }
        return val;
    }

    private static int przeszukajObiekty(List<Integer> list) {
        int val = 0;
        for (Integer integer : list) {
            val = integer;
        }
        return val;
    }
}
