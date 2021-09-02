package ru.com.chilikinow.interestingSolution;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class WorkWithDate2 {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Date userDate = formatter.parse(date);

        Date yearStartDate = new Date();
        yearStartDate.setSeconds(0);
        yearStartDate.setMinutes(0);
        yearStartDate.setHours(0);
        yearStartDate.setDate(1);
        yearStartDate.setMonth(0);
        yearStartDate.setYear(userDate.getYear());

        long msTimeDistance = userDate.getTime() - yearStartDate.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = (int) (msTimeDistance/msDay);
        if (dayCount % 2 == 0)
            return true;
        else
            return false;
    }
}
