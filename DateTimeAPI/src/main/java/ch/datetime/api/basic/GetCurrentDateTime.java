package ch.datetime.api.basic;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * GetCurrentDateTime.java
 *
 * <p>
 * Utility class that provides methods for retrieving the current
 * system date and time using Java's Date and Time APIs.
 * </p>
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-29
 */
public class GetCurrentDateTime {

    public static void main(String[] args) {
        // Create a formatter using the pattern yyyy/MM/dd HH:mm:ss
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        // Get the current system date and time
        Date date = new Date();

        // Format the Date object and print the result
        System.out.println(dateFormat.format(date));
    }
}
