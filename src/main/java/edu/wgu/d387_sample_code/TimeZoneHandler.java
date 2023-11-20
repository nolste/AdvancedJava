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
        DateTimeFormatter CUSTOM_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");
        String time = localDateTime.format(CUSTOM_FORMATTER);
        System.out.println("local time "+time);
        list.add("UCT " + time);

        ZonedDateTime zonedDateTime=localDateTime.atZone(zUCT);
        ZonedDateTime zonedDateTimeEastern=zonedDateTime.withZoneSameInstant(zEastern);
        LocalDateTime localDateTimeEastern=zonedDateTimeEastern.toLocalDateTime();
        String eastTime = localDateTimeEastern.format(CUSTOM_FORMATTER);
        list.add("Eastern Time " + eastTime);


        ZonedDateTime zonedDateTimeMountain=zonedDateTime.withZoneSameInstant(zMountain);
        LocalDateTime localDateTimeMountain=zonedDateTimeMountain.toLocalDateTime();
        String mountTime = localDateTimeMountain.format(CUSTOM_FORMATTER);
        list.add("Mountain Time " + mountTime);

        return list;
    }

}
