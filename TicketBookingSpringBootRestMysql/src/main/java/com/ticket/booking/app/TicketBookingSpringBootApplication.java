package com.ticket.booking.app;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ticket.booking.app.service.TicketBookingService;
import com.ticket.booking.app.ticket.Ticket;

@SpringBootApplication
public class TicketBookingSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingSpringBootApplication.class, args);
		
//   ConfigurableApplicationContext context=SpringApplication.run(TicketBookingSpringBootApplication.class, args);
//   TicketBookingService ticketBookingService= context.getBean("ticketBookingService",TicketBookingService.class);
//    
//     Ticket ticket = new Ticket();
//         ticket.setBookingDate(new Date());
//         ticket.setSourceStation("Dhaka");
//         ticket.setDestStation("Sylet");
//         ticket.setPassengerName("Asad");
//         ticket.setEmail("Asad@gamil.com");
//         
//         ticketBookingService.createTicket(ticket);
//         
	}

}
