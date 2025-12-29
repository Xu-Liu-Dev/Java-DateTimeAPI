package de.datetime.api.compare;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * CompareDateSample1.java
 *
 * <p>
 * Demonstrates how to compare two Date objects using Java's
 * built‑in comparison methods such as before(), after(), and equals().
 * </p>
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-29
 */
public class CompareDateSample1 {

    public static void main(String[] args) throws ParseException {
        // Create a formatter using the pattern yyyy-MM-dd
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Parse two date strings into Date objects
        Date date1 = dateFormat.parse("2020-01-30");
        Date date2 = dateFormat.parse("2020-01-31");

        // Print the formatted dates
        System.out.println("Date 1 : " + dateFormat.format(date1));
        System.out.println("Date 2 : " + dateFormat.format(date2));

        // Compare the two dates
        int result = date1.compareTo(date2);
        System.out.println("Result : " + result);

        // Interpret the comparison result
        if (result == 0) {
            System.out.println("Date1 is equal to Date2");
        } else if (result > 0) {
            System.out.println("Date1 is after Date2");
        } else if (result < 0) {
            System.out.println("Date1 is before Date2");
        } else {
            System.out.println("How to get here?");
        }
    }
}
