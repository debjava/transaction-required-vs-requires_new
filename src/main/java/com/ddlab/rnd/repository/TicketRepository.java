package com.ddlab.rnd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ddlab.rnd.entity.Ticket;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long> {

}
