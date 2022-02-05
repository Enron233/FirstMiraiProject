package org.example;

import java.util.Calendar;
import java.util.Date;

public class Homework {
    public static String chinese,phy,che,bio,math,eng;

    public static int Djs(){
        Calendar djs = Calendar.getInstance();
        djs.setTime(new Date());
        long timenow = djs.getTimeInMillis();
        djs.set(2022, Calendar.JUNE, 7);
        long time2022 = djs.getTimeInMillis();
        return (int) ((time2022-timenow)/(1000*60*60*24)-1);
    }
}
