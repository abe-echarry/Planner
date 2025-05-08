/*
 * Project: Planner
 * Class: Organizer Class
 * Author: Abigail Allgood
 * Date: April 25, 2025
 * Class: Representing a task organizer for the Planner.
 */

package planner.organizer;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Organizer {

    // Attributes
    private String taskName;
    private String dueDate; // Format: YYYY-MM-DD
    private String priority; // Example: "High", "Medium", "Low"

    /**
     * Default constructor.
     * Initializes an empty task organizer.
     */
    public Organizer() {
        taskName = "";
        dueDate = "";
        priority = "";
    }

    // Getters and setters

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * Organizes a list of tasks by priority and due date.
     * Tasks with higher priority are listed first, and within the same priority,
     * tasks are sorted by their due date in ascending order.
     * 
     * @param tasks A list of Organizer objects representing tasks.
     * @return A sorted list of Organizer objects.
     */
    public static List<Organizer> organizeTasks(List<Organizer> tasks) {
        Collections.sort(tasks, new Comparator<Organizer>() {
            @Override
            public int compare(Organizer o1, Organizer o2) {
                // Compare by priority first
                int priorityComparison = o1.getPriority().compareTo(o2.getPriority());
                if (priorityComparison != 0) {
                    return priorityComparison;
                }
                // If priorities are the same, compare by due date
                return o1.getDueDate().compareTo(o2.getDueDate());
            }
        });
        return tasks;
    }
}
