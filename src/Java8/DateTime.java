package Java8;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateTime {
    public static void LocalDateTime()
    {
        // the current date
        LocalDate date = LocalDate.now();
        System.out.println("the current date is "+ date);

        // the current time
        LocalTime time = LocalTime.now();
        System.out.println("the current time is "+ time);

        // will give us the current time and date
        LocalDateTime current = LocalDateTime.now();
        System.out.println("current date and time : "+ current);

        // to get the current zone
        ZonedDateTime currentZone = ZonedDateTime.now();
        System.out.println("the current zone is "+ currentZone.getZone());

        //to write custom zone
        ZoneId india = ZoneId.of("Asia/Calcutta");
        ZonedDateTime indiaZone = currentZone.withZoneSameInstant(india);
        System.out.println("india time zone is " + indiaZone);

        //Instant - An instant is a point of time counting from the first second.
        Instant now = Instant.now();
        Instant epochNow = Instant.ofEpochSecond(1000000);
        long s = now.getEpochSecond();
        int n = now.getNano();
        Instant twoSecondsAfter = now.plusSeconds(2);
        Instant twoSecondsBefore = now.minusSeconds(2);
        System.out.println("now "+now);
        System.out.println("Instant of twoSecondsAfter "+twoSecondsAfter);

        //Period : It deals with date based amount of time.
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2014, Month.DECEMBER, 12);
        Period gap = Period.between(date2, date1);
        System.out.println("gap between dates "+ "is a period of "+gap);

        //Duration : It deals with time based amount of time.adding five hours to the current time and storing it in time2
        Duration fiveHours = Duration.ofHours(5);
        LocalTime time2 = time.plus(fiveHours);
        System.out.println("after adding five hours " + "of duration " + time2);
        Duration gap1 = Duration.between(time2, time);
        System.out.println("duration gap between time1" + " & time2 is " + gap1);

        //ChronoUnit- to  add 1 years to the current date
        LocalDate year = date.plus(1, ChronoUnit.YEARS); //ChronoUnit.Months
        System.out.println("next to next year is " + year);

        //TemporalUnit - to get first day of current month
        LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("firstDayOfMonth : " + firstDay);
    }
    public static void main(String[] args){
        LocalDateTime();
    }
}
