package ru.com.chilikinow.interestingSolution;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Перепись населения
*/

public class MapWorking {
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

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        String value;
        for (Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator(); iterator.hasNext();){
            Map.Entry <String, String> pair = iterator.next();
            value = pair.getValue();
            if(value.equals(name))
                ++count;
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        String key;
        for(Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator(); iterator.hasNext();){
            Map.Entry<String, String> pair = iterator.next();
            key = pair.getKey();
            if(key.equals(lastName))
                ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        //Map<String, String> map = createMap();
        //System.out.println("Сколько Александров?: " + getCountTheSameFirstName(map,"Александр"));
        //System.out.println("Сколько Корнеевых?: " + getCountTheSameLastName(map, "Корнеев"));
    }
}
