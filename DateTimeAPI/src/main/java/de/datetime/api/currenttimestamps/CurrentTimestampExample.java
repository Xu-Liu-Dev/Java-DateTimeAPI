package de.datetime.api.currenttimestamps;

import java.time.Instant;

/**
 * CurrentTimestampExample.java
 * <p>
 * Example program showing how to obtain the current moment on the UTC time line
 * using Instant.now() and print it directly as an ISO‑8601 timestamp.
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-31
 */
public class CurrentTimestampExample {

    public static void main(String[] args) {
        // Obtain the current Instant representing the exact moment in UTC.
        // Instant is timezone‑agnostic and captures a precise point on the time line.
        Instant currentTimestamp = Instant.now();
        System.out.println("Current Timestamp: " + currentTimestamp);
    }
}
