package com.ddlab.rnd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ddlab.rnd.entity.Customer;
import com.ddlab.rnd.repository.CustomerRepository;

@Service
public class CustomerAuditService {

    @Autowired
    private CustomerRepository customerRepo;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void logAuditDetails(Customer customer) {
//        AuditLog auditLog = new AuditLog();
//        auditLog.setOrderId(order.getId());
//        auditLog.setAction("Order processed");
    	customerRepo.save(customer);
    	
    	sendMail();
    	
    }
    
    public void sendMail() {
    	throw new NullPointerException("SMTP server down...");
    }
}
