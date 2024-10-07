package com.ddlab.rnd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ddlab.rnd.entity.Customer;
import com.ddlab.rnd.entity.Ticket;
import com.ddlab.rnd.repository.TicketRepository;

@Service
public class TicketBookingServiceImpl {

	@Autowired
	private TicketRepository ticketRepo;
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void book(Ticket ticket, Customer user) {
		ticketRepo.save(ticket); // Save only ticket information
	}
}
