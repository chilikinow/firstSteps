package ru.com.chilikinow.interestingSolution;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLights {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double a = Double.parseDouble(s);

        String color = null;
        double countGreen = 0;
        double countYellow = 0;
        double countRed = 0;
        int colorFlag = 1;

        for (double i = 0; i <= a; i += 0.1) {
            switch (colorFlag){
                case (1):
                    if (countGreen < 3) {
                        color = "зеленый";
                        countGreen += 0.1;
                    } else {
                        countGreen = 0;
                        colorFlag = 2;
                        a += 0.1;
                    }
                break;
                case (2):
                    if (countYellow < 1) {
                        color = "желтый";
                        countYellow += 0.1;
                    } else {
                        countYellow = 0;
                        colorFlag = 3;
                        a += 0.1;
                    }
                    break;
                case (3):
                    if (countRed < 1) {
                        color = "красный";
                        countRed += 0.1;
                    } else {
                        countRed = 0;
                        colorFlag = 1;
                        a += 0.1;
                    }
                    break;
            }
        }
    System.out.println(color);
    }
}
