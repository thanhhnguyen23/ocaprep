package ocaprep.ch03;

import java.time.LocalDate;
import java.time.Month;

public class ReviewQuestion30 {
    public static void main(String[] args) {

    // what is the output of the following code?

    LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
        /**
         * getDayOfMonth() method only returns values from 1 - 31
         */
    System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
    }
}
