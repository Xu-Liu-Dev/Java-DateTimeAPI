package ch.datetime.api.calculat_elapsed_execute_time;

import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

/**
 * ExecutionTime2.java
 *
 * <p>
 * Demonstrates a basic approach to measuring execution time in Java
 * using {@code System.currentTimeMillis()}.
 * <p>
 * The program records the start timestamp, executes a sample method,
 * records the end timestamp, and calculates the total elapsed time
 * in milliseconds. This approach provides millisecond precision and
 * is suitable for coarse‑grained performance measurements.
 * </p>
 *
 * @author Xu
 * @version 1.0
 * @since 2026-1-2
 */
public class ExecutionTime2 {

    public static void main(String[] args) throws InterruptedException {
        // Captures the current system time in milliseconds to mark the start of the execution interval.
        long lStartTime = System.currentTimeMillis();
        // Executes the target method whose runtime is being measured.
        calculation();

        // Captures the end timestamp in milliseconds, computes the elapsed execution time
        // by subtracting the start timestamp, and outputs the total duration in milliseconds.
        long lEndTime = System.currentTimeMillis();
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
