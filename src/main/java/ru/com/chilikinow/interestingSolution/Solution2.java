package ru.com.chilikinow.interestingSolution;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        File inputFile = new File("/Users/mac/IdeaProjects/First/src/olegChilikin/practice/Start");
        BufferedReader readerSystemIn = new BufferedReader(new InputStreamReader(System.in));
        Scanner fileScanner = null;
        ArrayList <String> firstList = new ArrayList<>();
        ArrayList <String> secondList = new ArrayList<>();
        try {
            fileScanner = new Scanner(inputFile);
        }
        catch (FileNotFoundException e) {
            System.out.print("Файл не найден, вы уверенны? что он на месте?, проверить еще раз? Y/N: ");
            try {
                if (readerSystemIn.readLine().equals("Y"))
                    inputFile = new File("/Users/mac/IdeaProjects/First/src/olegChilikin/practice/Start");
                else
                    System.out.println("Файл не найден!");
            } catch (IOException f) {
                System.out.println("Файл не найден!");
            }
        }
            while (fileScanner.hasNextLine()){
                firstList.add(fileScanner.nextLine());
            }
            fileScanner.close();
        System.out.println("Dano: ");
        System.out.println(firstList);

        secondList = sortABC(firstList);
        System.out.println("SortABC: ");
        System.out.println(secondList);

        secondList = sortKolVoSim(firstList);
        System.out.println("SortKolVoSim: ");
        System.out.println(secondList);

        File outputFile = new File("/Users/mac/IdeaProjects/First/src/olegChilikin/practice/End.txt");

    }

    public static ArrayList<String> sortABC(ArrayList<String> list1){
        //Сортировка слов в предложении по алфавиту
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            String[] bufferStringArray = list1.get(i).split(" ");

            ArrayList<String> bufferString = new ArrayList<>();
            for (int j = 0; j < bufferStringArray.length; j++) {
                bufferString.add(bufferStringArray[j]);
            }

            Collections.sort(bufferString);
            String string = "";
            for (int j = 0; j < bufferString.size(); j++) {
                string += bufferString.get(j) + " ";
            }
            list2.add(string);
        }
        list2 = kolVoPovtoreniy(list2);
        return list2;
    }

    public static ArrayList<String> sortKolVoSim(ArrayList<String> list1){
        //Сортировка по количеству слов в строке
        ArrayList<String> list2 = new ArrayList<>();
        String buffer = "";
        for (int i = 0; i < list1.size(); i++) {
            buffer += list1.get(i).length()+" ";
            buffer += list1.get(i);
            list1.set(i,buffer);
            buffer = "";
        }
        buffer = "";
        Collections.sort(list1);
        for (int i = 0; i < list1.size(); i++) {
            buffer = list1.get(i).substring(3,list1.get(i).length());
            list2.add(buffer);
            buffer = "";
        }
        list2 = kolVoPovtoreniy(list2);
        return list2;
    }

    public static ArrayList<String> kolVoPovtoreniy(ArrayList<String> list){
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(list.get(i))){
                    count++;
                }
            }
            list.set(i, list.get(i)+" "+ count);
            count = 0;
        }
        return list;
    }


}
