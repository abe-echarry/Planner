// Planner Project
// Abe Echarry
// 04/25/2025
// This class handles individual task information

public class Task {
    private String name;
    private String description;
    private String dueDate;
    private boolean isCompleted;

    // Constructor
    public Task(String name, String description, String dueDate) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.isCompleted = false;}

    // Getters
    public String getName() {
        return name;}

    public String getDescription() {
        return description;}

    public String getDueDate() {
        return dueDate;}

    public boolean isCompleted() {
        return isCompleted;}

    // Setters
    public void setName(String name) {
        this.name = name;}

    public void setDescription(String description) {
        this.description = description;}

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;}

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;}

    public void markComplete() {
        this.isCompleted = true;}

    // ToString for display
    @Override
    public String toString() {
        return "Task Name: " + name +
               "\nDescription: " + description +
               "\nDue Date: " + dueDate +
               "\nCompleted: " + (isCompleted ? "Yes" : "No");}
}

