package com.sda.tallinn6.fundamentals.datetime;

import java.text.ParseException; //dont import in advance
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;


public class DateTime {

    public static void main(String[] args) throws ParseException {

        convertDateTimeObjects();

        //how to get current time with calendar
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current date : " + calendar.getTime());

        //we have an option to get only year or month

        System.out.println("Year " + calendar.get(Calendar.YEAR));
        System.out.println("Month " + calendar.get(Calendar.MONTH)); //!!!!!month starts from 0, so it is march not apr
        System.out.println("Day " + calendar.get(Calendar.DATE));

        System.out.println("|||||||||||||||||||||||||||||||||||||||");

        //We can get 10 days before
        calendar.add(Calendar.DATE, -10);
        System.out.println("10 day before: " + calendar.getTime());

        //We can get two months later
        calendar.add(Calendar.MONTH, 2);
        System.out.println("2 month later: " + calendar.getTime());

        //one year before
        calendar.add(Calendar.YEAR, -1);
        System.out.println("1 year before: " + calendar.getTime());

        System.out.println("|||||||||||||||||||||||||||||||||||||||");


        //how to get CURRENT date and TIME
        Date currentdate = new Date();
        System.out.println("Current time: " + currentdate);
        SimpleDateFormat format = new SimpleDateFormat("");

        SimpleDateFormat firstFormatter = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        String formattedDate = firstFormatter.format(currentdate);
        System.out.println("Formatted date :" + formattedDate);

        System.out.println("|||||||||||||||||||||||||||||||||||||||");


        //how we can convert a string to date

        String textDate = "12/03/2018";
        SimpleDateFormat anotherFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = anotherFormat.parse(textDate); //we put exception here to parse: alt + enter
        System.out.println("Parsed from string to date: " + date);


        System.out.println("|||||||||||||||||||||||||||||||||||||||");

        //another way to get date time

        LocalDate today = LocalDate.now(); //THE BEST WAY TO GET A DATE
        System.out.println("Local date : " + today);
        int year = today.getYear();
        Month month = today.getMonth();

        System.out.println("Year and month " + year + " month" + month);

        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        System.out.println("tomorrow :" + tomorrow);
        LocalDate yesterday = tomorrow.minusDays(2);
        System.out.println("yesterday : " + yesterday);

        //date time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Now : " + now);
        int hour = now.getHour();
        int minutes = now.getMinute();

        System.out.println("hourminute: " + hour + ":" + minutes);

        System.out.println("|||||||||||||||||||||||||||||||||||||||");
        System.out.println("DURATION TOPIC");

        //Duration

        Duration oneHour = Duration.ofHours(1);
        System.out.println(oneHour.getSeconds() + " seconds in one hour");

        //Duration between two different dates

        LocalDateTime startDate = LocalDateTime.of(2019,
                Month.JANUARY, 1, 10, 20, 00);
        LocalDateTime endDate = LocalDateTime.of(2019,
                Month.APRIL, 13, 10, 20, 10);

        Duration duration = Duration.between(startDate, endDate);

        System.out.println("Duration between two dates : " + duration.getSeconds());

        //Period - it means in years months and days

        Period fivedays = Period.ofDays(5);
        System.out.println("days..." + fivedays.getDays());

        Period twoYearsFourMonthsThreeeDays = Period.of(2, 4, 3);
        System.out.println(twoYearsFourMonthsThreeeDays.getYears()); //2
        System.out.println(twoYearsFourMonthsThreeeDays.getMonths()); //4
        System.out.println(twoYearsFourMonthsThreeeDays.getDays()); //3

        System.out.println("|||||||||||||||||||||||||||||||||||||||");
        System.out.println("MY LIFE LENGTH SO FAR!!!!!!!!!!!!!!!!!!");

        //How many years months and days passed after you were born
        LocalDate birthdate = LocalDate.of(1996, Month.DECEMBER, 17);
        LocalDate todayDate = LocalDate.of(2019, Month.APRIL, 14);
        Period period = Period.between(birthdate, todayDate);
        System.out.println(period.getYears() + " years,");
        System.out.println(period.getMonths() + " months, ");
        System.out.println(period.getDays() + " days passed");

        System.out.println("|||||||||||||||||||||||||||||||||||||||");

    }
    //convert between the date and time objects
    private static void convertDateTimeObjects() {
        //From date to Local datetime
        Date date = new Date();
        System.out.println("Today " + date);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(),
                ZoneId.systemDefault());
        System.out.println("Local data time : " + localDateTime);
        //from local date to date

        Date sameDate= Date.from(localDateTime.toInstant(ZoneOffset.UTC));

        System.out.println(" " + sameDate);

    }


}

