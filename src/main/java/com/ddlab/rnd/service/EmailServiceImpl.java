package com.ddlab.rnd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ddlab.rnd.entity.Customer;
import com.ddlab.rnd.repository.CustomerRepository;

@Deprecated
@Service
public class EmailServiceImpl {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveCustomerAndSendMail(Customer user) {
		customerRepo.save(user);
		
		sendItinerayMail(user, 4);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void sendItinerayMail(Customer user, int randValue) {
		System.out.println("Random Value: "+ randValue);
		if( randValue % 2 == 0) {
			throw new NullPointerException("SMTP server is down");
		} else {
			System.out.println("Itineray sent to user's email: "+user.getEmail());
		}
	}

}
