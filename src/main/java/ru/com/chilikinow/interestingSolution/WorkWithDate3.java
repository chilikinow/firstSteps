package ru.com.chilikinow.interestingSolution;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkWithDate3 {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 3 2020"));
    }

    public static boolean isDateOdd(String date) {
        List<String> units = Arrays.asList(date.split(" "));
        ArrayList<String> units2 = new ArrayList();
        units2.addAll(units);
        units2.trimToSize();
        int year = Integer.parseInt(units.get(2));
        LocalDate date1 = LocalDate.of(year, Month.valueOf(units.get(0)), Integer.parseInt(units.get(1)));
        LocalDate yearBegin = LocalDate.of(year, 1, 1);
        long days = date1.toEpochDay()-yearBegin.toEpochDay();
        return days%2==0;
    }
}
