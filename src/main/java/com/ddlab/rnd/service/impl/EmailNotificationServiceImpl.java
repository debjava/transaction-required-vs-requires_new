package com.ddlab.rnd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ddlab.rnd.entity.Customer;
import com.ddlab.rnd.repository.CustomerRepository;

@Service
public class EmailNotificationServiceImpl {
	
	@Autowired
    private CustomerRepository customerRepo;
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
    public void saveAndNotify(Customer customer) {
    	customerRepo.save(customer);
    	
    	sendMail();
    }
    
    public void sendMail() {
    	throw new NullPointerException("SMTP server down...");
    }

}
