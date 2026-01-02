package ch.datetime.api.calculat_elapsed_execute_time;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * ExecutionTime4.java
 *
 * <p>
 * Demonstrates a basic approach to measuring execution time in Java
 * using the legacy {@link java.util.Date} API. The program captures
 * the start and end timestamps in milliseconds and computes the total
 * elapsed duration of a sample operation.
 * <p>
 * Although {@code Date.getTime()} is functional, it is considered
 * outdated in modern Java. More recent APIs such as
 * {@code System.currentTimeMillis()}, {@code System.nanoTime()}, or
 * {@code java.time.Instant} are generally preferred for timing tasks.
 *
 * @author Xu
 * @version 1.0
 * @since 2026-1-2
 */
public class ExecutionTime4 {

    public static void main(String[] args) throws InterruptedException {
        // Obtains the current timestamp in milliseconds using the legacy Date API
        // to mark the beginning of the execution interval.
        long lStartTime = new Date().getTime();
        // Executes the target method whose runtime is being measured.
        calculation();

        // Captures the end timestamp in milliseconds using the legacy Date API,
        // computes the elapsed execution time by subtracting the start timestamp,
        // and prints the total duration in milliseconds.
        long lEndTime = new Date().getTime();
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
