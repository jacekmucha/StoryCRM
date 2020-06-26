package com.jmdev.storycrm.utils;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormatter {


    public static Date fromStringToDate(String dateInString){

        dateInString = dateInString.concat("Z");
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy'T'HH:mm:ssZ");

        Date date = null;
        try {
            date = formatter.parse(dateInString.replaceAll("Z$", "+0000"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static LocalDateTime mkyongFromStringToLocalDateTime(String input){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime formatDateTime = LocalDateTime.parse(input, formatter);
        return formatDateTime;
    }

}
