package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
//the name of the attributes and name parameter in html should be same
@Entity

public class User {
@Id
@GeneratedValue   //for auto increementing values

private int uid;

	private String uname;
	private String pwd;
	private String email;
	private String city;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;

	
	
	
}
