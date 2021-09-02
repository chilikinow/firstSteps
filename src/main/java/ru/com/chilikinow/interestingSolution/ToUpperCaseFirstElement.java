package ru.com.chilikinow.interestingSolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ToUpperCaseFirstElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String[] stroka = new String[string.length()] ;
        for (int i = 0; i < string.length(); i++) {
            stroka[i] = "";
            stroka[i] += string.charAt(i);
            if (i == 0 || stroka[i-1].equals(" "))
                stroka[i] = stroka[i].toUpperCase();
        }
        String itog = "";
        for (int i = 0; i < stroka.length; i++) {
            itog += stroka[i];
        }
        System.out.println(itog);
    }
}
