package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String upi;
    
    public Vendor() {
		super();
	}
    
    public Vendor(String name, String email, String upi) {
		super();
		this.name = name;
		this.email = email;
		this.upi = upi;
	}
	
	public Vendor(Long id, String name, String email, String upi) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.upi = upi;
	}
	// Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUpi() {
		return upi;
	}
	public void setUpi(String upi) {
		this.upi = upi;
	}

   
}