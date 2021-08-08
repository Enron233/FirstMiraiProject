package org.example;

import java.util.Calendar;

public class text {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int date = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(date);
    }
}
