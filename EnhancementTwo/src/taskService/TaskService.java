package taskService;

import java.util.ArrayList;
import java.util.Iterator;



public class TaskService {

	static ArrayList<Task> taskList = new ArrayList<Task>();    //declaring an array list for tasks, chose this over just an array due to the various manipulations it will undergo
	Iterator<Task> it = taskList.iterator();                     //declaring iterator to search arrayList
	
	public void displayTask(String taskID, String taskName, String taskDescription) {
		for (int i = 0; i < taskList.size(); ++i) {                      //iterates through array list until end of list
			Task task = new Task("545454", "Mop", "Mop the floors");        //creates a new task object
			System.out.println(task);        //prints the array list
			i++;           //increments through list
		}
	}
	
	public void addTask(String taskID, String taskName, String taskDescription) {      //create add task method
		
		Task task = new Task(taskID, taskName, taskDescription);           //creates a new task object
		
		taskList.add(task);      //adds task to the arrayList
		
	}

	public void deleteTask(String taskID) {     //create delete task method
		
		while (it.hasNext()) {                        //will iterate through arrayList as long as there is a next object
			if (it.next().getTaskID().equals(taskID)) {         //checks to see if the object in the list matches the taskID
				it.remove();                          //if matches then removes task
			}
		}	
	}
	
	public void updateTaskName(String taskID, String taskName) {     //create update task name method
		
		for (Task task : taskList) {     //for each loop to loop through array list
			if (task.getTaskID().equals(taskID) ) {      //checks if a taskID equals the taskID being searched
				task.setTaskName(taskName);                 //updates task name
			}
		}
	}
	 
	public void updateTaskDescription(String taskID, String taskDescription) {              //create update task description method
		for (Task task : taskList) {     //for each loop to loop through array list
			if (task.getTaskID().equals(taskID) ) {      //checks if a taskID equals the taskID being searched
				task.setTaskDescription(taskDescription);               //updates task description
			}
		}
	}
}
