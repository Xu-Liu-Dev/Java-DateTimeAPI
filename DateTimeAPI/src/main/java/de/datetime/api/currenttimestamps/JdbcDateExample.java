package de.datetime.api.currenttimestamps;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDateTime;

/**
 * JdbcDateExample.java
 *
 * <p>
 * Example program showing how to perform a JDBC INSERT operation into a PostgreSQL
 * database. It sets string, numeric, and timestamp parameters using a prepared
 * statement and prints the number of affected rows.
 * </p>
 *
 * @author Xu
 * @version 1.0
 * @since 2025-12-31
 */
public class JdbcDateExample {

    // Parameterized SQL INSERT statement for inserting an employee's name, salary,
    // and creation timestamp into the EMPLOYEE table.
    private static final String SQL_INSERT = "INSERT INTO EMPLOYEE (NAME, SALARY, CREATED_DATE) VALUES (?,?,?)";

    public static void main(String[] args) {
        // Open a JDBC connection and prepare the INSERT statement.
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/test", "postgres", "password");
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT)) {

            // Set the employee name.
            preparedStatement.setString(1, "Xu");
            // Set the salary using BigDecimal for precision.
            preparedStatement.setBigDecimal(2, new BigDecimal("799.88"));
            // Set the created date using the current LocalDateTime.
            preparedStatement.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));

            // Alternative timestamp options using ZonedDateTime or Instant:
            // preparedStatement.setTimestamp(3, Timestamp.from(ZonedDateTime.now().toInstant()));
            // preparedStatement.setTimestamp(3, Timestamp.from(Instant.now()));

            // Execute the INSERT and print the number of affected rows.
            int row = preparedStatement.executeUpdate();

            // Rows affected.
            System.out.println(row); //1
        } catch (SQLException sqlException) {
            // Print SQL error details.
            System.err.format("SQL State: %s\n%s", sqlException.getSQLState(), sqlException.getMessage());
        } catch (Exception exception) {
            // Handle any other unexpected exceptions.
            exception.printStackTrace();
        }
    }
}
