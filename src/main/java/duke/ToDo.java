package duke;

/**
 * To Do class.
 * Represents a to do task.
 * Extends from Task.
 * Contains to do name.
 *
 * @author YanCheng
 */

public class ToDo extends Task {

    /**
     * Creates a To Do task.
     * @param toDoName name of deadline
     */
    public ToDo(String toDoName) {
        super(toDoName);
    }

    /**
     * Returns to do information to be stored locally.
     * @return to do information
     */
    @Override
    public String getInfo() {
        return String.format("T | %d | %s\n", isDone ? 1 : 0, taskName);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
