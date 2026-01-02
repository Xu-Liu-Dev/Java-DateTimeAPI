package ch.datetime.api.current_timestamps;

import java.sql.Timestamp;
import java.time.Instant;

/**
 * InstantTimestampConversion.java
 *
 * <p>
 * Example program showing bidirectional conversion between the legacy
 * java.sql.Timestamp class and the modern java.time.Instant API.
 * It prints the original Timestamp, the converted Instant, and the
 * Timestamp reconstructed from the Instant.
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-31
 */
public class InstantTimestampConversion {

    public static void main(String[] args) {
        // Construct a java.sql.Timestamp using the current epoch milliseconds from the system clock.
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Timestamp: " + timestamp);

        // Convert the legacy Timestamp to an Instant, representing a precise moment on the UTC timeline.
        Instant instant = timestamp.toInstant();
        System.out.println("Instant: " + instant);

        // Recreate a Timestamp from the Instant, demonstrating bidirectional conversion.
        Timestamp tsFromInstant = Timestamp.from(instant);
        System.out.println("Timestamp from Instant: " + tsFromInstant);
    }
}
