package edu.wgu.d387_sample_code;

import java.awt.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class TimeZoneHandler {

    static List<String> list = new ArrayList<>();
    public static List<String>getTimeZoneHandler(){


        ZoneId zEastern=ZoneId.of("America/New_York");
        ZoneId zMountain=ZoneId.of("America/Denver");
        ZoneId zUCT=ZoneId.of("UCT");

        Month december = Month.of(12);

        LocalDateTime localDateTime=LocalDateTime.of(2023,december,25,12,22);

        System.out.println("local time "+localDateTime.toString());
        list.add("Local Time/UCT " + localDateTime.toString());

        ZonedDateTime zonedDateTime=localDateTime.atZone(zUCT);
        ZonedDateTime zonedDateTimeEastern=zonedDateTime.withZoneSameInstant(zEastern);
        LocalDateTime localDateTimeEastern=zonedDateTimeEastern.toLocalDateTime();
        list.add("Eastern Time " + localDateTimeEastern.toString());


        ZonedDateTime zonedDateTimeMountain=zonedDateTime.withZoneSameInstant(zMountain);
        LocalDateTime localDateTimeMountain=zonedDateTimeMountain.toLocalDateTime();
        list.add("Mountain Time " + localDateTimeMountain.toString());


/*        ZoneId zEastern=ZoneId.of("America/New_York");
        ZoneId zMountain=ZoneId.of("America/Denver");
        ZoneId zUCT=ZoneId.of("UCT");

        String fromDateString = "17:00";
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        try {
            Date d = dateFormat.parse(fromDateString);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


        TimeZone eastern = TimeZone.getTimeZone("America/New_York");
        TimeZone mountain = TimeZone.getTimeZone("America/Denver");
        TimeZone uct = TimeZone.getTimeZone("UCT");*/





/*        Date fromDate =(Date)formatter.parse(fromDateString);

        formatter.setTimeZone(eastern);
        list.add(formatter.format(fromDateString));

        formatter.setTimeZone(mountain);
        list.add(formatter.format(fromDateString));

        formatter.setTimeZone(uct);
        list.add(formatter.format(fromDateString));*/




/*        //looks like I will have to change this to supply a time and then give that time in different time zones.
        //not just give the current time in those zones
        LocalTime time1 = LocalTime.parse(LocalTime.now(zEastern).format(DateTimeFormatter.ofPattern("HH:mm")));
        LocalTime time2 = LocalTime.parse(LocalTime.now(zMountain).format(DateTimeFormatter.ofPattern("HH:mm")));
        LocalTime time3 = LocalTime.parse(LocalTime.now(zUCT).format(DateTimeFormatter.ofPattern("HH:mm")));*/

/*
        LocalDateTime localDateTime=LocalDateTime.now();
//        System.out.println("local time "+localDateTime.toString());

        ZonedDateTime zonedDateTime=localDateTime.atZone(z);
        ZonedDateTime zonedDateTimeEastern=zonedDateTime.withZoneSameInstant(zEastern);
        LocalDateTime localDateTimeEastern=zonedDateTimeEastern.toLocalDateTime();
        System.out.println("Eastern time "+localDateTimeEastern.toString());
        ZonedDateTime zonedDateTimePacific=zonedDateTime.withZoneSameInstant(zPacific);
        LocalDateTime localDateTimePacific=zonedDateTimePacific.toLocalDateTime();
        System.out.println("Pacific time "+localDateTimePacific.toString());
*/

/*        list.add("Eastern Time " + time1);
        list.add("Mountain Time "+ time2);
        list.add("Coordinated Universal Time " + time3);*/

        return list;
    }

}
