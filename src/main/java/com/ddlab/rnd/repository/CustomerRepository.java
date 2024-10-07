package com.ddlab.rnd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ddlab.rnd.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
