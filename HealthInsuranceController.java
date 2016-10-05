package com.mongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.domain.Address;
import com.mongodb.domain.InsuredMembers;
import com.mongodb.domain.Proposer;
import com.mongodb.service.HealthInsuranceService;

@RestController
public class HealthInsuranceController {

	@Autowired
	private HealthInsuranceService healthService;
	

	@RequestMapping("/landing")
	public String landingMessage() {
		return "hello";
	}
	
	
	@RequestMapping(value="/saveInsuredMembers" ,consumes="application/json",method=RequestMethod.POST)
	public void saveInsuredMembers(@RequestBody InsuredMembers insuredMembers){
		healthService.saveInsuredMembers(insuredMembers);
	}
	
	@RequestMapping(value="/saveProposer" ,consumes="application/json",method=RequestMethod.POST)
	public Long saveProposerInfo(@RequestBody Proposer proposer){
		final Long id=healthService.saveProposer(proposer);
		return id;
	}
	
	@RequestMapping(value="/saveAddress" ,consumes="application/json",method=RequestMethod.POST)
	public void saveProposerAddress(@RequestBody Address address){
		healthService.saveProposerAddress(address);
		
	}
}
