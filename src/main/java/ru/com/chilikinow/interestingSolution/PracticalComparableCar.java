package ru.com.chilikinow.interestingSolution;


import java.util.ArrayList;
import java.util.Collections;

public class PracticalComparableCar {

    public static void main(String[] args) throws Exception {
        ArrayList <ComparableCar> comparableCars = new ArrayList<>();
        comparableCars.add(new ComparableCar("Ferrari", 1968, 325));
        comparableCars.add(new ComparableCar("Maseratti", 1982, 372));
        comparableCars.add(new ComparableCar("Paganni", 1995, 523));
        comparableCars.add(new ComparableCar("Shiguli 5", 1954, 98));
        comparableCars.add(new ComparableCar("Lamborgini", 2015, 402));
        for (int i = 0; i < comparableCars.size(); i++) {
            System.out.println(comparableCars.get(i).toString());
        }


        //Comparator<ComparableCar> comparatorName = Comparator.comparing(obj -> obj.getName());
        //Collections.sort(comparableCars, comparatorName);
        Collections.sort(comparableCars, ComparableCar::compareName);

        System.out.println("After sort to Name Model:");
        for (int i = 0; i < comparableCars.size(); i++) {
            System.out.println(comparableCars.get(i).toString());
        }

        Collections.sort(comparableCars, ComparableCar::compareYear);
        //Comparator<ComparableCar> comparatorDM = Comparator.comparing(obj -> obj.getDateMade());
        //Collections.sort(comparableCars, comparatorDM);

        System.out.println("After sort to Date Made:");
        for (int i = 0; i < comparableCars.size(); i++) {
            System.out.println(comparableCars.get(i).toString());
        }

        //Comparator<ComparableCar> comparatorMussle = Comparator.comparing(obj -> obj.getMussle());
        //Collections.sort(comparableCars, comparatorMussle);
        Collections.sort(comparableCars, ComparableCar::compareMussle);

        System.out.println("After sort to Mussle:");
        for (int i = 0; i < comparableCars.size(); i++) {
            System.out.println(comparableCars.get(i).toString());
        }


    }

}
