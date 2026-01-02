package ch.datetime.api.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * GetCurrentDateTimeWithCalendar.java
 *
 * <p>
 * Utility class that retrieves the current date and time
 * using the legacy java.util.Calendar API.
 * </p>
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-29
 */
public class GetCurrentDateTimeWithCalendar {

    public static void main(String[] args) {
        // Create a formatter using the pattern yyyy-MM-dd HH:mm:ss
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Create a Calendar instance representing January 31, 2013
        // Note: Months are zero-based in Calendar, so 0 = January
        Calendar calendar = new GregorianCalendar(2013, 0, 31);

        // Format the calendar's date and print the result
        System.out.println(simpleDateFormat.format(calendar.getTime()));
    }
}
