package com.ajay.utils;

import com.ajay.entity.Royalty;


public class Utils {
	
	public static Royalty getRoyalty() {
		Royalty r = new Royalty();
		r.setBookId("777B");
		r.setCustomerId("44244");
		r.setDepartmentNumber("BOOKS_AND_STATIONARY_555323");
		r.setRoyaltyId("#88882");
		r.setRoyaltyPoints("3329");
		r.setAgentCommession("15%");
		return r;
	}
	
	public static void sendEmail(int user) {
		//todo fetch the email id, configure SMTP configuration and mail template
		
	   System.out.println("Email send to the user " + user);
	}

}
