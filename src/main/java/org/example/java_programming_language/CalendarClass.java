package org.example.java_programming_language;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class CalendarClass {

    public static void main(String[] args) {


        Date date = new Date();
        SimpleDateFormat sdf;

        sdf = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(sdf.format(date)); // 2022-11-05

        sdf = new SimpleDateFormat("YYYY/MM/dd");
        System.out.println(sdf.format(date)); // 2022/11/05

        LocalDateTime dateTime = LocalDateTime.now();
        ZoneId zoneId = ZoneId.of("Asia/Seoul");
        ZonedDateTime zd = dateTime.atZone(zoneId);
        System.out.println(zd);
    }
}