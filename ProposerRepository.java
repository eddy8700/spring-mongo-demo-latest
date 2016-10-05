package com.mongodb.repository;

import java.util.Set;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mongodb.domain.InsuredMembers;
import com.mongodb.domain.Proposer;


@Repository
public interface ProposerRepository extends MongoRepository<Proposer, Long> {
	
	

}
