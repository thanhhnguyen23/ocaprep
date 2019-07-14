package ocaprep.ch03;

import java.time.LocalDate;

public class ReviewQuestion28 {
    public static void main(String[] args) {
        // which of the following can be inserted into the blank to create a date of June 21, 2014?


        //TODO -- need to work on LocalDate
        /**
         * must use static methods because LocalDate has private constructors
         */
        // e.g.
        LocalDate date = LocalDate.of(2014, 6, 21);

        /**
         * 1. does not compile because LocalDate has private constructors
         * 2. static methods must be used, therefore new keyword cannot be used
         */
//         localDate date = new LocalDate(2014, 6, 21); // does not compile
//         LocalDate date = new LocalDate.of(2014, 6, 21); // false

        System.out.println(date);

    }
}
