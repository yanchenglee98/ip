package duke;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Deadline class.
 * Represents a deadline task.
 * Extends from Task.
 * Contains deadline name and date.
 *
 * @author YanCheng
 */
public class Deadline extends Task {

    private LocalDate date;

    /**
     * Creates a deadline task.
     * @param taskName Name of Deadline
     * @param date Date of Deadline in format of "YYYY-MM-DD"
     * @throws DukeException If date is not in the specified format
     */
    public Deadline(String taskName, String date) throws DukeException {
        // date format must be in YYYY-MM-DD e.g. 2020-08-22
        super(taskName.stripTrailing());
        try {
            this.date = LocalDate.parse(date);
        } catch (DateTimeParseException e) {
            throw new DukeException("Date is in the wrong format");
        }
    }

    /**
     * Returns deadline information to be stored locally.
     * @return deadline information
     */
    @Override
    public String getInfo() {
        return String.format("D | %d | %s | %s\n", isDone ? 1 : 0, taskName, date.toString());
    }

    @Override
    public String toString() {
        return "[D]" + super.toString()
                + " (by: "
                + date.format(DateTimeFormatter.ofPattern("MMM d yyyy")) + ")";
    }
}
