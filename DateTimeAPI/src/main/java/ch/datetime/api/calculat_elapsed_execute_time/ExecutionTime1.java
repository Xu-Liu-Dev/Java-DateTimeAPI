package ch.datetime.api.calculat_elapsed_execute_time;


import java.util.concurrent.TimeUnit;

/**
 * ExecutionTime1.java
 *
 * <p>
 * Demonstrates how to measure execution time in Java using {@code System.nanoTime()}.
 * <p>
 * The program records the start time, executes a sample calculation method,
 * records the end time, and computes the elapsed duration in milliseconds.
 * <p>
 * {@code System.nanoTime()} is used instead of {@code System.currentTimeMillis()}
 * because it provides higher precision and is suitable for measuring time intervals.
 *
 * @author Xu
 * @version 1.0
 * @since 2026-1-2
 */
public class ExecutionTime1 {

    public static void main(String[] args) throws InterruptedException {
        // Captures the current high‑precision timestamp in nanoseconds for measuring execution duration.
        long lStartTime = System.nanoTime();
        // Executes the target method whose runtime is being measured.
        calculation();

        // Records the end timestamp in nanoseconds and computes the elapsed execution time.
        // Note: elapsed time must be calculated as (endTime - startTime); using (startTime - endTime)
        // results in a negative duration.
        long lEndTime = System.nanoTime();
        long output = lEndTime - lStartTime; // Corrected calculation
        System.out.println("Elapsed time in milliseconds: " + output / 1000000);
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
