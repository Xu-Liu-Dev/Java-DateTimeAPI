package de.datetime.api.current_timestamps;

import java.sql.Timestamp;

/**
 * TimestampExampleVer1.java
 * <p>
 * Example program showing how to work with java.sql.Timestamp. It retrieves the
 * current system time in milliseconds, wraps it in a Timestamp instance, and
 * prints the result in its default ISO‑8601‑like format.
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-31
 */
public class TimestampExampleVer1 {

    public static void main(String[] args) {
        // Construct a java.sql.Timestamp based on the current system time.
        // System.currentTimeMillis() returns the epoch time in milliseconds.
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Current Timestamp: " + timestamp);
    }
}
