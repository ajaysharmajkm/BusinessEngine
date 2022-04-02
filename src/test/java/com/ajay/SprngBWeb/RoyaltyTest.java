package com.ajay.SprngBWeb;

import org.junit.jupiter.api.Test;

import com.ajay.entity.Royalty;
import com.ajay.utils.Utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoyaltyTest {

	
	@Test
	public void testRoyalty() {
	Royalty r= 	Utils.getRoyalty();
	assertEquals("15%", r.getAgentCommession());
	assertEquals("777B", r.getBookId());
	assertEquals("44244", r.getCustomerId());
	assertEquals("BOOKS_AND_STATIONARY_555323", r.getDepartmentNumber());
	assertEquals("#88882", r.getRoyaltyId());
	assertEquals("3329", r.getRoyaltyPoints());
	
	}

}
