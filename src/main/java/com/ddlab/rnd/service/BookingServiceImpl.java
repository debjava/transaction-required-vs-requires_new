package com.ddlab.rnd.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ddlab.rnd.entity.Customer;
import com.ddlab.rnd.entity.Ticket;
import com.ddlab.rnd.repository.TicketRepository;

@Deprecated
@Service
public class BookingServiceImpl {
	
	@Autowired
	private TicketRepository ticketRepo;

//	@Transactional(propagation = Propagation.REQUIRED)
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void book(Ticket ticket, Customer user) {
		ticketRepo.save(ticket); // Save only ticket information
	}
	
}
