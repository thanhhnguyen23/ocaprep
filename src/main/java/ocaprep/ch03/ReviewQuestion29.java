package ocaprep.ch03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReviewQuestion29 {
    public static void main(String[] args) {
        // what is the output of the following code

        LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);

        // date.plusDays(2); // 2018-05-02?
        // date.plusHours(3); // plusHours() doesn't exist for date
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
    }
}
