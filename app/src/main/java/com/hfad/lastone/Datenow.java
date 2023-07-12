package com.hfad.lastone;

import java.util.Calendar;

public class Datenow {
    public static Calendar getCurrentDate() {
        return Calendar.getInstance();
    }

    public static void main(String[] args) {
        Calendar currentDate = getCurrentDate();
        int year = currentDate.get(Calendar.YEAR);
        int month = currentDate.get(Calendar.MONTH) + 1; // Month starts from 0
        int day = currentDate.get(Calendar.DAY_OF_MONTH);
        System.out.println("Current date: " + year + "-" + month + "-" + day);
    }
}
