package com.ddlab.rnd.service;

import com.ddlab.rnd.entity.Ticket;
import com.ddlab.rnd.entity.Customer;

public interface TicketService {

	void bookTicket(Ticket ticket, Customer user);
}
