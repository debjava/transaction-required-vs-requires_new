package com.ddlab.rnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.entity.Customer;
import com.ddlab.rnd.entity.Ticket;
import com.ddlab.rnd.service.OrderService;
import com.ddlab.rnd.service.TicketService;
import com.ddlab.rnd.service.impl.BookingService;

@Component
public class AutoRun {
	
	@Autowired
	private TicketService tktService;
	
//	@Autowired
//	private TempServiceImpl tempService;
	
//	@Autowired
//	private MyService myService;
//	
//	public void trial1() {
//		Customer user = new Customer("Nitya", "Nitya@ddlab.com");
//		Ticket ticket = new Ticket(3000, "Nitya");
//		myService.performOperations(ticket, user);
//	}
	
	@Autowired
	private OrderService orderService;
	
	private void trial2() {
		Customer user = new Customer("Pani", "Pani@ddlab.com");
		Ticket ticket = new Ticket(2000, "Pani");
		
		orderService.processOrder(ticket, user);
	}
	
	@Autowired
	private BookingService bookingService;
	
	private void trial3() {
		Customer user = new Customer("Suraj", "Suraj@ddlab.com");
		Ticket ticket = new Ticket(1000, "Suraj");
		
		bookingService.book(ticket, user);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void run() {
		// Aditya, Nitya, Som, Hari, Shyama, Pani
//		Customer user = new Customer("Surya", "Surya@ddlab.com");
//		Ticket ticket = new Ticket(3000, "Surya");
//		tktService.bookTicket(ticket, user);
////		tempService.book(ticket, user);
		
//		trial1();
		
//		trial2();
		
		trial3();
		
		System.out.println("Ticket booked successfully ...");
	}

}
