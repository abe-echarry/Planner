/*
 * Project: Planner
 * Class: Repeater
 * Author: Sherriya Paw
 * Date: April 25, 2025
 * Description: Represents a task repeater for the Planner application.
 */

package planner.repeater;

public class Repeater {

    // Attributes
    private String repeatFrequency;
    private String startDate;
    private String endDate;

    /**
     * Default constructor.
     * Initializes an empty task repeater.
     */
    public Repeater() {
        repeatFrequency = "";
        startDate = "";
        endDate = "";
    }

    /**
     * Parameterized constructor.
     * Initializes a task repeater with the given values.
     * 
     * @param repeatFrequency The frequency of repetition.
     * @param startDate       The start date of the repetition.
     * @param endDate         The end date of the repetition.
     */
    public Repeater(String repeatFrequency, String startDate, String endDate) {
        this.repeatFrequency = repeatFrequency;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * Gets the repeat frequency of the task.
     * 
     * @return The repeat frequency.
     */
    public String getRepeatFrequency() {
        return repeatFrequency;
    }

    /**
     * Sets the repeat frequency of the task.
     * 
     * @param repeatFrequency The new repeat frequency.
     */
    public void setRepeatFrequency(String repeatFrequency) {
        this.repeatFrequency = repeatFrequency;
    }

    /**
     * Gets the start date of the repetition.
     * 
     * @return The start date.
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the start date of the repetition.
     * 
     * @param startDate The new start date.
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * Gets the end date of the repetition.
     * 
     * @return The end date.
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the end date of the repetition.
     * 
     * @param endDate The new end date.
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
