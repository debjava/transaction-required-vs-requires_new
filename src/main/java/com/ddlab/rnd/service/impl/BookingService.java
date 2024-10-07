package com.ddlab.rnd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ddlab.rnd.entity.Customer;
import com.ddlab.rnd.entity.Ticket;

@Service
public class BookingService {
	
	@Autowired
	private TicketBookingServiceImpl tktService;
	
	@Autowired
	private EmailNotificationServiceImpl notificationService;

	@Transactional
	public void book(Ticket tkt, Customer cust) {
		
		tktService.book(tkt, cust); // Ticket will be booked
		
		notificationService.saveAndNotify(cust);
	}
}
