package com.jmdev.storycrm.utils;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {


    public static DateTime fromStringToJodaDateTime(String dateInString){
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss");
        DateTime dateTime = DateTime.parse(dateInString,formatter);
        return dateTime;
    }


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

}
