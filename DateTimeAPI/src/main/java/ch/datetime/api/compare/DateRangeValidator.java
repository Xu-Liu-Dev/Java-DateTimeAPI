package ch.datetime.api.compare;

import java.util.Date;

/**
 * DateRangeValidator.java
 *
 * <p>
 * Provides functionality for validating whether a given date falls
 * within a specified start and end date range.
 * </p>
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-29
 */
public class DateRangeValidator {

    // Start and end boundaries of the valid date range
    private final Date startDate;
    private final Date endDate;

    /**
     * Constructs a validator with a specified start and end date.
     *
     * @param startDate the beginning of the valid date range (inclusive)
     * @param endDate   the end of the valid date range (inclusive)
     */
    public DateRangeValidator(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * Checks whether the given date falls within the configured date range.
     *
     * @param testDate the date to validate
     * @return true if testDate is between startDate and endDate (inclusive),
     * false otherwise
     */
    public boolean isWithinRange(Date testDate) {
        return testDate.getTime() >= startDate.getTime() && testDate.getTime() <= endDate.getTime();
    }
}
