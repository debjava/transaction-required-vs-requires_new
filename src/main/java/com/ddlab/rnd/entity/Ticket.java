package com.ddlab.rnd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="Ticket") @Table(name="ticket")
@Getter @Setter @NoArgsConstructor
public class Ticket {
	
	@Id @GeneratedValue
	private Long id;
	
	private int price;
	
	private String name;
	
	public Ticket(int price, String name) {
		this.price = price;
		this.name = name;
	}

}
