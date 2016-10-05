package com.mongodb.service;

import java.util.Set;

import com.mongodb.domain.Address;
import com.mongodb.domain.InsuredMembers;
import com.mongodb.domain.Proposer;

public interface HealthInsuranceService {
	
	public void saveInsuredMembers(InsuredMembers insuredMembers);
	
	public void saveProposerAddress(Address address);
	
	public Long saveProposer(Proposer proposer);
	
	public InsuredMembers getInsuredMembers();
	
	public Address getInsuredAddress();
	
	public Proposer getProposer();

}
