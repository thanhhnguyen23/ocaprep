package ocaprep.ch03;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ReviewQuestion32 {
    public static void main(String[] args) {

        // what is the output of the following code?
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);

        Period p = Period.ofDays(1).ofYears(2);
//        d.minus(p); // must be changed and stored to variable in order to view changes, unless changes will only be ephemeral

        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(f.format(d));

    }
}
