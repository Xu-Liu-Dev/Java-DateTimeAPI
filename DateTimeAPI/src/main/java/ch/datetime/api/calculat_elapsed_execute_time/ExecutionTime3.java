package ch.datetime.api.calculat_elapsed_execute_time;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

/**
 * ExecutionTime3.java
 *
 * <p>
 * Demonstrates how to measure execution time in Java using the modern
 * {@link java.time.Instant} API. This example captures the start and end
 * timestamps in milliseconds and computes the total elapsed duration.
 * <p>
 * Using {@code Instant.now().toEpochMilli()} provides a readable and
 * timezone‑agnostic way to obtain millisecond‑precision timestamps,
 * suitable for general performance measurements.
 *
 * @author Xu
 * @version 1.0
 * @since 2026-1-2
 */
public class ExecutionTime3 {

    public static void main(String[] args) throws InterruptedException {
        // Captures the current timestamp in milliseconds using the Instant API
        // to mark the beginning of the execution interval.
        long lStartTime = Instant.now().toEpochMilli();
        // Executes the target method whose runtime is being measured.
        calculation();

        // Captures the end timestamp in milliseconds, calculates the elapsed execution time
        // by subtracting the previously recorded start timestamp, and prints the total duration.
        long lEndTime = Instant.now().toEpochMilli();
        long output = lEndTime - lStartTime;
        System.out.println("Elapsed time in milliseconds: " + output);
    }

    /**
     * Simulates a time‑consuming operation by pausing execution for two seconds.
     *
     * @throws InterruptedException if the sleep operation is interrupted
     */
    private static void calculation() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
    }
}
