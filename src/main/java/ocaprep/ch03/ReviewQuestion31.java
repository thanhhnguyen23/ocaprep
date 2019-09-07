package ocaprep.ch03;

import java.time.LocalDate;
import java.time.Month;

public class ReviewQuestion31 {
    public static void main(String[] args) {

        // what is the output of the following code?
        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);

        /**
         * appears that plusDays and plusYears method exist, but result operation of these methods cannot be observed.
         *  > because it changes to the date currently loaded in memory
         *  > meanwhile the changes do not persist
         *
         *  > we accomplish this by saving these changes to a variable we can call later
         */

        date.plusDays(2); // date = date.plusDays(2) must be used if changes were to appear in the console
        date.plusYears(3); // date = date.plusYears(2) must be used if changes were to appear in the console

        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

    }
}
