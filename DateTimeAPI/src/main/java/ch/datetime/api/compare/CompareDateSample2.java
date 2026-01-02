package ch.datetime.api.compare;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * CompareDateSample2.java
 *
 * <p>
 * Demonstrates additional techniques for comparing Date objects,
 * including the use of before(), after(), and equals() methods.
 * </p>
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-29
 */
public class CompareDateSample2 {

    public static void main(String[] args) throws ParseException {
        // Create a formatter using the pattern yyyy-MM-dd
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Parse two date strings into Date objects
        Date date1 = dateFormat.parse("2020-02-01");
        Date date2 = dateFormat.parse("2020-01-31");

        // Print the formatted dates
        System.out.println("date1 : " + dateFormat.format(date1));
        System.out.println("date2 : " + dateFormat.format(date2));

        // Check if the two dates are equal
        if (date1.equals(date2)) {
            System.out.println("Date1 is equal Date2");
        }

        // Check if date1 occurs after date2
        if (date1.after(date2)) {
            System.out.println("Date1 is after Date2");
        }

        // Check if date1 occurs before date2
        if (date1.before(date2)) {
            System.out.println("Date1 is before Date2");
        }
    }
}
