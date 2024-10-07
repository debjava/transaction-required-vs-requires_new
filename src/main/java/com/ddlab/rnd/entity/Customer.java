package com.ddlab.rnd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="Customer") @Table(name="customer")
@Getter @Setter @NoArgsConstructor
public class Customer {
	
	@Id @GeneratedValue
	private Long id;
	
	private String name;
	
	private String email;
	
	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}

}
