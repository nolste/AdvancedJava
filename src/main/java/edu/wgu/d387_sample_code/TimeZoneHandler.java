package edu.wgu.d387_sample_code;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TimeZoneHandler {

    static List<String> list = new ArrayList<>();
    public static List<String>getTimeZoneHandler(){
        ZoneId zEastern=ZoneId.of("America/New_York");
        ZoneId zMountain=ZoneId.of("America/Denver");
        ZoneId zUCT=ZoneId.of("UCT");

        //looks like I will have to change this to supply a time and then give that time in different time zones.
        //not just give the current time in those zones
        LocalTime time1 = LocalTime.parse(LocalTime.now(zEastern).format(DateTimeFormatter.ofPattern("HH:mm")));
        LocalTime time2 = LocalTime.parse(LocalTime.now(zMountain).format(DateTimeFormatter.ofPattern("HH:mm")));
        LocalTime time3 = LocalTime.parse(LocalTime.now(zUCT).format(DateTimeFormatter.ofPattern("HH:mm")));

        list.add("Eastern Time " + time1);
        list.add("Mountain Time "+ time2);
        list.add("Coordinated Universal Time " + time3);

        return list;
    }

}
