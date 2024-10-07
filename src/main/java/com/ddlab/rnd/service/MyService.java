//package com.ddlab.rnd.service;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.ddlab.rnd.entity.Customer;
//import com.ddlab.rnd.entity.Ticket;
//import com.ddlab.rnd.repository.CustomerRepository;
//import com.ddlab.rnd.repository.TicketRepository;
//
//@Service
//public class MyService {
//
////    @Autowired
////    private MyRepository myRepository;
//    
//    @Autowired
//	private TicketRepository ticketRepo;
//    
//    @Autowired
//	private CustomerRepository customerRepo;
//
//    @Transactional(propagation = Propagation.REQUIRES_NEW)
//    public void saveDataInNewTransaction(Customer user) {
//    	customerRepo.save(user);
//    	throw new NullPointerException("SMTP down today ...");
//    }
//
//    @Transactional
//    public void performOperations(Ticket ticket, Customer user) {
//        // MyEntity entity1 = new MyEntity("Data 1");
//        ticketRepo.save(ticket); // This is saved in the current transaction
//        
//        saveDataInNewTransaction(user); // This is saved in a new transaction
//
////        try {
//////            MyEntity entity2 = new MyEntity("Data 2");
////            saveDataInNewTransaction(user); // This is saved in a new transaction
////        } catch (Exception e) {
////            // Handle exception
////        }
//
//        // If an exception is thrown in the new transaction, entity1 is still persisted
//    }
//}
