package ocaprep.ch03.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeExample {
    public static void main(String[] args) {
        /**
         * LocalDate, LocalDateTIme, LocalTime does not use constructors
         *
         * date and time classes have private constructors to force you to use the static methods
         *
         * localDate d = new LocalDate(); // DOES NOT COMPILE
         */
        // LocalDate - contains just the date -- no time and no time zone
        System.out.println(LocalDate.now());

        // LocalTime - contains just a time -- no date and no time zone
        System.out.println(LocalTime.now());

        // LocalDateTime - contains both a date and time but no time zone
        System.out.println(LocalDateTime.now());

        LocalDate date1 = LocalDate.of(2019, Month.MARCH, 23);

        LocalDate date2 = LocalDate.of(2019, 12, 24);

        LocalTime time1 = LocalTime.of(6, 15); // hour and minute
        LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds

        LocalDateTime dateTime1 = LocalDateTime.of(2019, Month.JULY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);

        /**
         * manipulating dates and times
         *      > date and time classes are immutable
         *      > must assign the results of these methods to a reference variables
         */
        LocalDate date = LocalDate.of(2019, Month.JULY, 20);
        System.out.println(date); // day 20

        date = date.plusDays(2);
        System.out.println(date); // day 22

        date = date.plusWeeks(1);
        System.out.println(date);

        date = date.plusMonths(1);

        System.out.println(date);

        date = date.plusYears(5);
        System.out.println(date);


        // there's also easy methods to go backwards in time
        LocalDate date3 = LocalDate.of(2020, Month.JULY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date3, time);

        System.out.println(dateTime);
        dateTime = dateTime.minusDays(1);

        System.out.println(dateTime);

        dateTime = dateTime.minusHours(10);

        System.out.println(dateTime);

        dateTime = dateTime.minusSeconds(30);

        System.out.println(dateTime);


        // date and time methods can be chained
        LocalDate date4 = LocalDate.of(2019, Month.AUGUST, 20);

        LocalTime time4 = LocalTime.of(5, 15);

        LocalDateTime dateTime3 = LocalDateTime.of(date4, time).minusDays(1).minusHours(10).minusSeconds(30);
    }
}
