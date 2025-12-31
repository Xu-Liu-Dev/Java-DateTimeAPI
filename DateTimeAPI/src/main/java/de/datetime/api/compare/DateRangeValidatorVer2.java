package de.datetime.api.compare;

import java.time.LocalDate;

/**
 * DateRangeValidatorVer2.java
 *
 * Represents a date range and provides validation logic to determine whether
 * a given date falls within the defined start and end boundaries.
 * <p>
 * The range is inclusive, meaning the start and end dates are considered valid.
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-31
 */
public class DateRangeValidatorVer2 {

    private final LocalDate startDate;
    private final LocalDate endDate;

    public DateRangeValidatorVer2(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * Checks whether the specified date falls within the range defined by
     * {@code startDate} and {@code endDate}, inclusive.
     *
     * @param testDate the date to validate
     * @return {@code true} if the date is within the range; otherwise {@code false}
     */
    public boolean isWithinRange(LocalDate testDate) {
        return (testDate.isEqual(startDate) || testDate.isEqual(endDate))
                || (testDate.isBefore(startDate) && testDate.isAfter(endDate));
    }
}
