package taskService;

public class Task {    //creating class 
	
	private String taskID = "";     //initializing and declaring variables for task information
	private String taskName = "";
	private String taskDescription = "";

	
	public Task(String taskID, String taskName, String taskDescription) {
		if (taskID == null || taskID.length() > 10) {         //checking if taskID is null or over 10 characters long
			throw new IllegalArgumentException("Invalid ID.");
		}
		else {
			this.taskID = taskID;   //if not null/longer than 10 characters set as taskID
		}
		if (taskName == null || taskName.length() > 20) {    //checking if task name is null or over 20 characters long
			throw new IllegalArgumentException("Invalid task name.");
		}
		else {
			this.taskName = taskName;     //if not null/longer than 20 characters set as taskName
		}

		if (taskDescription == null || taskDescription.length() > 50) {       //checking if description is null or over 50 characters long
			throw new IllegalArgumentException("Invalid description.");
		}
		else {
			this.taskDescription = taskDescription;       //if not null/longer than 50 characters set as task description
		}
	}
	
	public String getTaskID() {     //creating accessors/mutators to get/set task information
		return taskID;
	}
	
	public String getTaskName() {
		return taskName;
	}
	
	public String getTaskDescription() {
		return taskDescription;
	}
	
	public void setTaskID(String taskID) {
		if (taskID == null || taskID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID.");
		}
		else {
			this.taskID = taskID;
		}
	}
	
	public void setTaskName(String taskName) {
		if (taskName == null || taskName.length() > 20) {
			throw new IllegalArgumentException("Invalid task name.");
		}
		else {
			this.taskName = taskName;
		}
	}
	
	public void setTaskDescription(String taskDescription) {
		if (taskDescription == null || taskDescription.length() > 50) {
			throw new IllegalArgumentException("Invalid description.");
		}
		else {
			this.taskDescription = taskDescription;
		}
	}
}