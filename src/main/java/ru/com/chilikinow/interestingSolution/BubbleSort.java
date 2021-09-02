package ru.com.chilikinow.interestingSolution;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class BubbleSort {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        for (int i = array.length; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                int buffer = 0;
                if (array[j]>array[j-1]){
                    buffer = array[j];
                    array[j] = array[j-1];
                    array[j-1] = buffer;
                }
            }
        }
    }
}




/*

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;



public class BubbleSort {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMMMMMM dd yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 1990"));
        map.put("Чижев", dateFormat.parse("August 25 2012"));
        map.put("Петров", dateFormat.parse("April 5 2012"));
        map.put("Сидоров", dateFormat.parse("MAY 7 2012"));
        map.put("Ячнев", dateFormat.parse("June 22 2012"));
        map.put("Уркин", dateFormat.parse("MAY 12 2012"));
        map.put("Бодрый", dateFormat.parse("July 23 2012"));
        map.put("Чернев", dateFormat.parse("July 11 2012"));
        map.put("Сержин", dateFormat.parse("MAY 12 2012"));
        map.put("Минаев", dateFormat.parse("MAY 9 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        for (Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator(); iterator.hasNext();){
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().toString().substring(4, 7).equals("Jun")
                    || pair.getValue().toString().substring(4, 7).equals("Jul")
                    || pair.getValue().toString().substring(4, 7).equals("Aug"))
                iterator.remove();
        }
    }

    public static void main(String[] args) throws ParseException {

        Map<String, Date> map = createMap();

        for (Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator(); iterator.hasNext();){
            Map.Entry<String, Date> pair = iterator.next();
            System.out.println(pair);
        }
        removeAllSummerPeople(map);
        System.out.println("After:");
        for (Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator(); iterator.hasNext();){
            Map.Entry<String, Date> pair = iterator.next();
            System.out.println(pair);
           }


    }
}


*/











/*
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class BubbleSort {

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Петров", "Сергей");
        map.put("Александров", "Александр");
        map.put("Семенов", "Степан");
        map.put("Марашев", "Алексей");
        map.put("Корнеев", "Павел");
        map.put("Попов", "Александр");
        map.put("Ирисов", "Мармелад");
        map.put("Пушкин", "Александр");
        map.put("Иванов", "Сергей");
        map.put("Тютьчев", "Петр");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> nameList = new ArrayList<>(map.values());
        Collections.sort(nameList);
        for (int i = 1; i < nameList.size() - 1; i++) {
            if (nameList.get(i).equals(nameList.get(i - 1)) || nameList.get(i).equals(nameList.get(i + 1)))
                removeItemFromMapByValue(map, nameList.get(i));
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        for (Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getValue().equals(value)) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        /*
        Map<String, String> map = createMap();
        for (Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }
        removeTheFirstNameDuplicates(map);

        System.out.println("New");

        for (Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }

    }


}
*/