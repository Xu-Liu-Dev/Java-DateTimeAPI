package de.datetime.api.compare;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * CompareCalendar.java
 *
 * <p>
 * Provides helper methods for comparing calendar-based date values.
 * This class can be used to determine whether one date occurs before,
 * after, or at the same time as another date. It is designed to support
 * date comparison logic in scheduling, validation, and time-based workflows.
 * </p>
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-29
 */
public class CompareCalendar {

    public static void main(String[] args) throws ParseException {

        // Create a date formatter for parsing and formatting date strings
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Parse two date strings into Date objects
        Date date1 = dateFormat.parse("2020-02-01");
        Date date2 = dateFormat.parse("2020-01-31");

        // Create two Calendar instances and assign the parsed dates
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(date1);
        cal2.setTime(date2);

        // Print the formatted dates
        System.out.println("date1 : " + dateFormat.format(date1));
        System.out.println("date2 : " + dateFormat.format(date2));

        // Compare the two dates using Calendar methods
        if (cal1.after(cal2)) {
            System.out.println("Date1 is after Date2");
        }

        if (cal1.before(cal2)) {
            System.out.println("Date1 is before Date2");
        }

        if (cal1.equals(cal2)) {
            System.out.println("Date1 is equal Date2");
        }
    }
}
