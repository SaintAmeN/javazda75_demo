package com.javazda75.streamvsfor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Punkt> punktList = new ArrayList<>();
        dodaj(punktList, 10000);

        Long start = System.currentTimeMillis();
        // czas 80
        List<Punkt> punktList1 = punktList.stream().filter(punkt -> punkt.y % 1000 == 0).collect(Collectors.toList());

        // czas 2
//        List<Punkt> punktList1 = new ArrayList<>();
//        for (int i = 0; i < punktList.size(); i++) {
//            Punkt punkt = punktList.get(i);
//            if ((punkt.y % 1000d) == 0) {
//                punktList1.add(punkt);
//            }
//        }
        Long stop = System.currentTimeMillis();

        System.out.println("Czas : " + (stop - start) + " iloscWynikow: " + punktList1.size());
    }

    private static void dodaj(List<Punkt> punktList, int ilosc) {
        for (int i = 0; i < ilosc; i++) {
            punktList.add(new Punkt(0, i));
        }
    }

    static final class Punkt {
        private double x, y;

        public Punkt(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }
    }
}
