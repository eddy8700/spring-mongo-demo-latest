package com.mongodb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.mongodb.domain.Address;
import com.mongodb.domain.InsuredMembers;
import com.mongodb.domain.Proposer;
import com.mongodb.repository.ProposerRepository;

@Component
public class HealthInsuranceServiceImpl implements HealthInsuranceService {
	
	
	@Autowired
	private ProposerRepository proposerRepository;
	
	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public void saveInsuredMembers(InsuredMembers insuredMembers) {
		//somehow fetch the insured members proposer id where proposerid is same as the id of the propser class
		final Long proposerId=insuredMembers.getProposerId();
		//push the record in the mongodb
		mongoTemplate.updateMulti(Query.query(Criteria.where("_id").is(proposerId)), new Update().push("insuredMembers", insuredMembers), Proposer.class);
		
       		
	}

	@Override
	public void saveProposerAddress(Address address) {
		//somehow fetch the insured members proposer id where proposerid is same as the id of the propser class
				final Long proposerId=address.getProposerId();
				//push the record in the mongodb
				mongoTemplate.updateMulti(Query.query(Criteria.where("_id").is(proposerId)), new Update().set("address", address), Proposer.class);
		
	}

	@Override
	public Long saveProposer(Proposer proposer) {
		 Proposer savedProposer=proposerRepository.save(proposer);
		 return savedProposer.getMobileNo();
	}

	@Override
	public InsuredMembers getInsuredMembers() {
		return null;
	}

	@Override
	public Address getInsuredAddress() {
		return null;
	}

	@Override
	public Proposer getProposer() {
		return null;
	}
	
	
	

}
