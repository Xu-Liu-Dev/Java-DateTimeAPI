package ch.datetime.api.compare;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * CompareInstant.java
 *
 * Utility class providing comparison operations for {@link java.time.Instant}.
 * <p>
 * This class encapsulates common logic for evaluating the temporal relationship
 * between two {@code Instant} instances, such as determining whether one occurs
 * before, after, or exactly at the same moment as another.
 * <p>
 * Typical use cases include timestamp validation, event ordering, and
 * time-based decision-making in distributed systems where precise and
 * timezone-independent comparisons are required.
 *
 * <p><strong>Thread Safety:</strong> This class is stateless and therefore
 * thread-safe.
 *
 * @author Xu
 * @since 1.0
 * @since 2025-12-31
 */
public class CompareInstant {

    public static void main(String[] args) {
        // Parses two date-time strings using the specified formatter, converts them to Instant
        // in UTC, and compares the resulting timestamps. This example demonstrates two
        // comparison approaches:
        // 1. Comparing epoch-second values via getEpochSecond()
        // 2. Using Instant's built-in comparison methods: equals(), isBefore(), and isAfter()
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");

        LocalDateTime date1 = LocalDateTime.parse("2020-01-31 11:44:44", dateTimeFormatter);
        LocalDateTime date2 = LocalDateTime.parse("2020-01-31 11:44:44", dateTimeFormatter);

        // Convert LocalDateTime to Instant using UTC offset
        Instant instant1 = date1.toInstant(ZoneOffset.UTC);
        Instant instant2 = date2.toInstant(ZoneOffset.UTC);

        // Compare using epoch-second values
        if (instant1.getEpochSecond() == instant2.getEpochSecond()) {
            System.out.println("instant1 is equal instant2");
        }
        if (instant1.getEpochSecond() < instant2.getEpochSecond()) {
            System.out.println("instant1 is before instant2");
        }
        if (instant1.getEpochSecond() > instant2.getEpochSecond()) {
            System.out.println("instant1 is after instant2");
        }

        // Compare using Instant's built-in comparison methods
        if (instant1.equals(instant2)) {
            System.out.println("instant1 is equal instant2");
        }
        if (instant1.isBefore(instant2)) {
            System.out.println("instant1 is before instant2");
        }
        if (instant1.isAfter(instant2)) {
            System.out.println("instant1 is after instant2");
        }
    }
}
