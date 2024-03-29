package com.ticket.booking.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.booking.app.service.TicketBookingService;
import com.ticket.booking.app.ticket.Ticket;

@RestController
@RequestMapping(value = "/api")
public class TicketBookingController {
    
	 @Autowired
	 private TicketBookingService ticketBookingService;
	 
	 @PostMapping(value = "/create")
	 public Ticket createTicket(@RequestBody Ticket ticket) { 
		 return ticketBookingService.createTicket(ticket); 
		 
	 }
	 @GetMapping(value = "/ticket/ticketId/{ticketId}")
	 public Ticket getTicketById(@PathVariable("ticketId") Integer ticketId) {
		 return ticketBookingService.getTicketById(ticketId);
	 }
	 @GetMapping(value = "/admin/alltickets")
	 public Iterable<Ticket> getAllBookedTicket(){
       
		 return ticketBookingService.getAllBookedTicket();
	 }
	 @DeleteMapping (value ="/ticket/{ticketId}")
	 public void deleteTicket(@PathVariable("ticketId") Integer ticketId) {
		 ticketBookingService.deleteTicket(ticketId);
	 }
	 @PutMapping(value = "/ticket/{ticketId}/{newEmail:.+}")
		public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId,@PathVariable("newEmail") String newEmail) {
		 return ticketBookingService.updateTicket(ticketId,newEmail);
		  	
		}
}
