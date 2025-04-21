package linkedList;

import appointmentService.Appointment;
import appointmentService.AppointmentService;
import java.util.Collections;



public class LinkedList {
	
	Node head;
	
	static class Node {
		
		Appointment appointment;
		Node next;
		
		//Default constructor
		Node() {
			next = null;
		}
		
		//Constructor
		//Initialize w/ appointment
		Node(Appointment theAppointment) {
			appointment = theAppointment;
			next = null;
		}
	}
	
	public static LinkedList insertAppointment(LinkedList appointmentList, Appointment appointment) {
		Node newNode = new Node(appointment);
		
		if(appointmentList.head == null) {
			appointmentList.head = newNode;
		}
		else {
			Node last = appointmentList.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return appointmentList;
	}
	
	public static LinkedList deleteAppointment(LinkedList appointmentList, Appointment appointmentID) {
		Node currNode = appointmentList.head, prev = null;
		
		if (currNode != null && currNode.appointment == appointmentID) {
			appointmentList.head = currNode.next;
			return appointmentList;
		}
		
		while (currNode != null && currNode.appointment != appointmentID) {
			prev = currNode;
			currNode = currNode.next;
		}
		if(currNode != null) {
			prev.next = currNode.next;
		}
		if(currNode == null) {
			System.out.println("Appointment ID: " + appointmentID + " was not found. ");
		}
		return appointmentList;
	}
	
	
	//public static LinkedList sortListByDate(LinkedList appointmentList, Appointment appointmentDate ){
		
	//}
}

