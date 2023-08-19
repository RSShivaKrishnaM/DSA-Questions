package Math;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;

public class Sample {
    YearMonth yearMonth;

    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.parse("2009-11");
        System.out.println(yearMonth.getMonth());
        System.out.println(yearMonth.getYear());

        YearMonth yearMonth2 = YearMonth.parse("2010-12");
        System.out.println(yearMonth2.getMonth());
        System.out.println(yearMonth2.getYear());

        if(yearMonth.getYear() <= yearMonth2.getYear()){
            if(yearMonth.getMonthValue() < yearMonth2.getMonthValue()){
                System.out.println("month is correct");
            }
        }

        System.out.println(YearMonth.from(                                   // Represent the year-month without a day-of-month, without a time-of-day, and without a time zone.
                        LocalDate.of(2023, Month.AUGUST, 23)    // Represent a date-only, without a time-of-day and without a time zone.
                )                                                 // Returns a `YearMonth` object.
                .equals(                                          // Compare one `YearMonth` object to another.
                        YearMonth.now()                               // Capture today’s year-month as seen in the JVM’s current default time zone.
                ));

//      int  xx = YearMonth.from(                                   // Represent the year-month without a day-of-month, without a time-of-day, and without a time zone.
//                LocalDate.of(2023, Month.AUGUST, 23).compareTo(YearMonth.now().atEndOfMonth());

    }
}
