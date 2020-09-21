package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
@Table(name = "contact", schema="salesforce")
public class Contact {
	@Id
	private String id;
	@Column(name = "firstName")
	private String firstName;
	

}
