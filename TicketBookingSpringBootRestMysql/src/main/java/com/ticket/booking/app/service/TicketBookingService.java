package com.ticket.booking.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import com.ticket.booking.app.dao.TicketBookingDao;
import com.ticket.booking.app.ticket.Ticket;

@Service
public class TicketBookingService {
    
	@Autowired
	private TicketBookingDao ticketBookingDao;
	
	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDao.save(ticket);
	}
	public Ticket getTicketById(Integer ticketId) {
		return ticketBookingDao.findOne(ticketId);
	}
	public Iterable<Ticket> getAllBookedTicket() {
		return ticketBookingDao.findAll();
	}
	
	public void deleteTicket(Integer ticketId) {
		ticketBookingDao.delete(ticketId);
		
	}
	public Ticket updateTicket(Integer ticketId, String newEmail) {
		Ticket ticketfromdb = ticketBookingDao.findOne(ticketId);
		        ticketfromdb.setEmail(newEmail);
		        Ticket  tkt = ticketBookingDao.save(ticketfromdb);
		
		return tkt;
	}
	

}
