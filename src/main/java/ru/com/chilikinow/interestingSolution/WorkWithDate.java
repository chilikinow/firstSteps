package ru.com.chilikinow.interestingSolution;

/*
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false


Требования:
1. Программа должна выводить текст на экран.
2. Класс WorkWithDate должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().
*/

import java.util.Date;

public class WorkWithDate {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) {

        //Разбиваем строку на 3(месяц, день, год);

        String [] dateArray = new String[date.length()];
        for (int i = 0; i < date.length(); i++) {
            dateArray[i] = "";
            dateArray[i] += date.charAt(i);
        }
        String month = "";
        String day = "";
        String year = "";
        int probel = 0;
        for (int i = 0; i < dateArray.length; i++) {
            if (probel == 0) {
                if (!dateArray[i].equals(" "))
                    month += dateArray[i];
                else {
                    ++probel;
                    ++i;
                }
            }
            if (probel == 1) {
                if (!dateArray[i].equals(" "))
                    day += dateArray[i];
                else{
                    ++probel;
                    ++i;
                }
            }
            if (probel == 2)
                if (!dateArray[i].equals(" "))
                    year += dateArray[i];
                else
                    break;
        }

        // переводим все значения в int;

        int dayInt = Integer.parseInt(day);
        int yearInt = Integer.parseInt(year);
        int monthInt = 0;
        switch (month.toLowerCase()) {
            case ("january"):
                monthInt = 1;
                break;
            case ("february"): //"FEBRUARY" || "February" ||
                monthInt = 2;
                break;
            case ("march"): //"MARCH" || "March" ||
                monthInt = 3;
                break;
            case ("april"): //"APRIL" || "April" ||
                monthInt = 4;
                break;
            case ("may"): //"MAY" || "May" ||
                monthInt = 5;
                break;
            case ("june"):
                monthInt = 6;
                break;
            case ("july"):
                monthInt = 7;
                break;
            case ("august"):
                monthInt = 8;
                break;
            case ("september"):
                monthInt = 9;
                break;
            case ("october"):
                monthInt = 10;
                break;
            case ("november"):
                monthInt = 11;
                break;
            case ("december"):
                monthInt = 12;
                break;
        }
        --monthInt;

        Date yearStartDate = new Date();
        yearStartDate.setSeconds(0);
        yearStartDate.setMinutes(0);
        yearStartDate.setHours(0);
        yearStartDate.setDate(1);
        yearStartDate.setMonth(0);
        yearStartDate.setYear(yearInt);

        Date userDate = new Date();
        userDate.setSeconds(0);
        userDate.setMinutes(0);
        userDate.setHours(0);
        userDate.setDate(dayInt);
        userDate.setMonth(monthInt);
        userDate.setYear(yearInt);

        long msTimeDistance = userDate.getTime() - yearStartDate.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = (int) (msTimeDistance/msDay);
        if (dayCount % 2 == 0)
            return true;
        else
            return false;
    }
}
