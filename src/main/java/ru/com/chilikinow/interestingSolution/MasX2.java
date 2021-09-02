package ru.com.chilikinow.interestingSolution;

import java.io.IOException;

public class MasX2 {
    public static void main(String[] args) throws IOException {
        int[][] masX2 = new int[10][10];
        for (int i = 0; i<masX2.length; i++){
            for (int j = 0; j < masX2[i].length; j++) {
                masX2[i][j] = (int)(Math.random() * 100);
            }
        }
        String str="";
        for (int x = 0; x < masX2.length; x++) {
            for (int y = 0; y < masX2[x].length; y++) {
                str = Integer.toString(masX2[x][y]);
                if (str.length()>1)
                    System.out.print(masX2[x][y] + " ");
                else
                System.out.print(" "+ masX2[x][y]+ " ");
            }
            System.out.println();
        }

    }
}

