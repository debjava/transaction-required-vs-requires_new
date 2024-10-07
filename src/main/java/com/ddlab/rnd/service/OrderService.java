package com.ddlab.rnd.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ddlab.rnd.entity.Customer;
import com.ddlab.rnd.entity.Ticket;
import com.ddlab.rnd.repository.TicketRepository;

@Deprecated
@Service
public class OrderService {

    @Autowired
    private TicketRepository ticketRepo;

    @Autowired
    private CustomerAuditService custAuditService;
    
    @Autowired
    private BookingServiceImpl bookingService;

    @Transactional
    public void processOrder(Ticket tkt, Customer cust) {
        // Save the order in the current transaction
//    	ticketRepo.save(tkt);
    	bookingService.book(tkt, cust);
    	
    	custAuditService.logAuditDetails(cust);
//    	throw new NullPointerException("SMTP server down...");

//        try {
//            // Log audit details in a new transaction
//        	custAuditService.logAuditDetails(cust);
////        	throw new NullPointerException("SMTP server down...");
//        } catch (Exception e) {
//            // Handle exception, audit logging failure shouldn't affect order processing
//        	e.printStackTrace();
//        }

        // Additional order processing logic...
    }
}

