package com.ajay.service;

import org.springframework.stereotype.Service;

import com.ajay.entity.Royalty;
import com.ajay.utils.Utils;

@Service
public class RoyaltyServiceImpl implements RoyaltyService{

	@Override
	public Royalty doService() {
		return Utils.getRoyalty();
	}

}
