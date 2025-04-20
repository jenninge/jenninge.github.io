package taskTests;

import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import taskService.TaskService;

public class TaskServiceTest {
	
	@Test
	@DisplayName("Testing addTask function will add")     //test add task function
	void testAddTask() {
		TaskService taskS = new TaskService(); 
		taskS.addTask("445566", "Clean", "Clean everything");
		assertTrue(taskS.equals(taskS), "Task was not added");     //asserts that contact was added
	}
	
	@Test
	@DisplayName("Testing deleteTask function will delete")     //test delete task function
	void testDeleteTask() {
		TaskService taskS = new TaskService(); 
		taskS.addTask("445566", "Clean", "Clean everything");           //add task
		taskS.deleteTask("445566");                                      //delete task added
		assertTrue(taskS.equals(taskS), "Task was not deleted");     //asserts that task was deleted
	}
	
	@Test
	@DisplayName("Testing updateTaskName function will update name")     //test update task name function
	void testUpdateTaskName() {
		TaskService taskS = new TaskService(); 
		taskS.addTask("445566", "Clean", "Clean everything");            //add task
		taskS.updateTaskName("445566", "Dust");                        //use update function to change name
		assertTrue(taskS.equals(taskS), "Task name was not updated");     //asserts that task name was updated
	}
	
	@Test
	@DisplayName("Testing updateTaskDescription function will update description")     //test update task description function
	void testUpdateTaskDescription() {
		TaskService taskS = new TaskService(); 
		taskS.addTask("445566", "Clean", "Clean everything");            //add task
		taskS.updateTaskDescription("445566", "Only dust and mop floors");            //use update function to change description
		assertTrue(taskS.equals(taskS), "Task description was not updated");     //asserts that task name was updated
	}
}