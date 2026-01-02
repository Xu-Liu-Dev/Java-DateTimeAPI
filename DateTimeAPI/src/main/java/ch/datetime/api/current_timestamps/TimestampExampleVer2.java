package ch.datetime.api.current_timestamps;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * TimestampExampleVer2.java
 * <p>
 * Example program showing how to generate timestamps using both System.currentTimeMillis()
 * and java.util.Date, and how to format these values using various SimpleDateFormat
 * patterns for different output styles.
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-31
 */
public class TimestampExampleVer2 {

    // Formatter producing a compact dot‑delimited timestamp (e.g., 2025.12.31.14.05.22).
    private static final SimpleDateFormat dateTimeFormatter1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

    // ISO‑8601‑compliant formatter including milliseconds and the timezone offset.
    // Useful for logging, APIs, and cross‑system timestamp exchange.
    private static final SimpleDateFormat dateTimeFormatter2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

    // Formatter using a common human‑readable pattern with a 24‑hour time component.
    private static final SimpleDateFormat dateTimeFormatter3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        // Create a Timestamp using the current system time and print it.
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);

        // Create a Date instance and convert it to a Timestamp.
        Date date = new Date();
        System.out.println(new Timestamp(date.getTime()));

        // Print the raw epoch milliseconds from the Date instance.
        System.out.println(date.getTime());

        // Format the timestamp using different SimpleDateFormat patterns.
        System.out.println(dateTimeFormatter1.format(timestamp));
        System.out.println(dateTimeFormatter2.format(timestamp));
        System.out.println(dateTimeFormatter3.format(timestamp));
    }
}
