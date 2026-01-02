package ch.datetime.api.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * SimpleCalendar.java
 *
 * <p>
 * Utility class that demonstrates basic usage of the java.util.Calendar API
 * for retrieving and manipulating date and time values.
 * </p>
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-29
 */
public class SimpleCalendar {

    public static void main(String[] args) {
        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        Calendar calendar = new GregorianCalendar(2013, 1, 28, 13, 24, 56);

        // Extract date fields from the Calendar instance
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);  // Note: January = 0
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);  // Sunday = 1, Monday = 2, ...
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

        // Extract time fields from the Calendar instance
        int hour = calendar.get(Calendar.HOUR);  // 12-hour clock (0–11)
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);  // 24-hour clock (0–23)
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int millisecond = calendar.get(Calendar.MILLISECOND);

        // Print the formatted date and time
        System.out.println(dataFormat.format(calendar.getTime()));

        // Print extracted date fields
        System.out.println("year \t\t: " + year);
        System.out.println("month \t\t: " + month);  // Note: January = 0
        System.out.println("dayOfMonth \t: " + dayOfMonth);
        System.out.println("dayOfWeek \t: " + dayOfWeek);  // Sunday = 1
        System.out.println("weekOfYear \t: " + weekOfYear);
        System.out.println("weekOfMonth : " + weekOfMonth);

        // Print extracted time fields
        System.out.println("hour \t\t: " + hour);  // 12-hour clock
        System.out.println("hourOfDay \t: " + hourOfDay);  // 24-hour clock
        System.out.println("minute \t\t: " + minute);
        System.out.println("second \t\t: " + second);
        System.out.println("millisecond : " + millisecond);
    }
}
