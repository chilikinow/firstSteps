package ru.com.chilikinow.interestingSolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLights2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double a1 = Double.parseDouble(s);
        int a = (int) a1;

        String color = null;
        double countGreen = 0;
        double countYellow = 0;
        double colorCountRed = 0;
        int colorFlag = 1;
        int i= 0;

        while (i <= a) {
             if ((countGreen < 3) & (colorFlag == 1)) {
                 color = "зеленый";
                 ++countGreen;
             }
             else {
                 countGreen = 0;
                 colorFlag = 2;
                 if ((countYellow < 1) & (colorFlag == 2)) {
                     color = "желтый";
                     ++countYellow;
                 } else {
                     countYellow = 0;
                     colorFlag = 3;
                     if ((colorCountRed < 1) & (colorFlag == 3)) {
                         color = "красный";
                         ++colorCountRed;
                     } else {
                         colorCountRed = 0;
                         colorFlag = 1;
                     }
                 }
             }
            ++i;
        }
        System.out.println(color);
    }
}
