package com.ddlab.rnd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.entity.Customer;
import com.ddlab.rnd.entity.Ticket;


@Service
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	private BookingServiceImpl bookingService;
	
	@Autowired
	private EmailServiceImpl emailService;

	// It is working
	@Override // Do not annotate with @Transactional
	public void bookTicket(Ticket ticket, Customer user) {
		bookingService.book(ticket, user);
		
		emailService.saveCustomerAndSendMail(user);
	}

}
