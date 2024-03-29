package com.ticket.booking.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ticket.booking.app.ticket.Ticket;

@Repository
public interface TicketBookingDao extends CrudRepository<Ticket, Integer> {

	
}
