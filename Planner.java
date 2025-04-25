package planner;

/*
 * Project: PlannerProject
 * Author: [Your Name]
 * Date: [Today's Date]
 * Description: This class is used to create and manage scheduled tasks and appointments.
 */

public class Planner {
    
    // Attributes
    private String title;
    private String date; // Format: YYYY-MM-DD
    private String time; // Format: HH:MM
    private String description;
    
    // Default constructor
    public Planner() {
        this.title = "";
        this.date = "";
        this.time = "";
        this.description = "";
    }
    
    // Parameterized constructor
    public Planner(String title, String date, String time, String description) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.description = description;
    }
    
    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for date
    public String getDate() {
        return date;
    }

    // Setter for date
    public void setDate(String date) {
        this.date = date;
    }

    // Getter for time
    public String getTime() {
        return time;
    }

    // Setter for time
    public void setTime(String time) {
        this.time = time;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }
    
    // Method to display the task details
    public void displayTask() {
        System.out.println("Title: " + title);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Description: " + description);
    }
}
