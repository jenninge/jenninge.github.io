package taskTests;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import taskService.Task;

public class TaskTest {
	
	@Test
	@DisplayName("Testing Task")
	void testTask() {
		Task task = new Task("542576", "Mop", "Mop the floors");              //tests task
		assertTrue(task.getTaskID().equals("542576"));
		assertTrue(task.getTaskName().equals("Mop"));
		assertTrue(task.getTaskDescription().equals("Mop the floors"));
		
	}
	
	@Test
	@DisplayName("Testing taskID when greater than 10 characters")       //testing taskID when it is over 10 characters
	void testTaskIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {    //throws exception when taskID is too long
			new Task("54257675466756", "Mop", "Mop the floors");
		});     
	}
	
	@Test
	@DisplayName("Testing taskName when greater than 20 characters")  //testing taskName when it is over 20 characters
	void testTaskNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {               //throws exception when taskName is too long
			new Task("542576", "MopAllTheFloorsUntilMidnight", "Mop the floors");
		});     
	}
	
	@Test
	@DisplayName("Testing taskDescription when greater than 50 characters")    //testing taskDescrption when it is over 50 characters
	void testTaskDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {          //throws exception
			new Task("542576", "Mop", "Mop the floors until the moon is full and all of the lights have been turned off");
		});     
	}
	
	@Test
	@DisplayName("Testing taskID is not nothing")            //testing when taskID is null
	void testTaskIDNotNull() {
		Task task = new Task(null, "Mop", "Mop the floors");
		assertNotNull(task.getTaskID(), "taskID was Null");         
	}
	
	@Test
	@DisplayName("Testing taskName is not nothing")            //testing when taskName is null
	void testTaskNameNotNull() {
		Task task = new Task("542576", null, "Mop the floors");
		assertNotNull(task.getTaskName(), "taskName was Null");
	}
	
	@Test
	@DisplayName("Testing taskDescription is not nothing")          //testing when taskDescrption is null
	void testTaskDescriptionNotNull() {
		Task task = new Task("542576", "Mop", null);
		assertNotNull(task.getTaskDescription(), "taskDescription was Null");
	}	
}