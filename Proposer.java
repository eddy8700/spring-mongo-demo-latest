package com.mongodb.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="proposer_info")
public class Proposer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6799000243180428837L;


	@Id
	private Long mobileNo;
	
	public String firstName;
	public String lastName;
	public String middleName;
	
	private String dob;
	
	private String occupation;
	
	private String  qualification;
	
	private Set<InsuredMembers> insuredMembers= new HashSet<>(0);
	
	private Address address;
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Set<InsuredMembers> getInsuredMembers() {
		return insuredMembers;
	}

	public void setInsuredMembers(Set<InsuredMembers> insuredMembers) {
		this.insuredMembers = insuredMembers;
	}
	
	
	
	
	
}
