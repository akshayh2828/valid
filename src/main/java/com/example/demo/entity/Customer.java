package com.example.demo.entity;



import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Name is mandatory")
    @Size(max = 100, message = "Name cannot exceed 100 characters")
    private String name;

    @NotEmpty(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    private String email;

    @NotEmpty(message = "Address is mandatory")
    @Size(max = 255, message = "Address cannot exceed 255 characters")
    private String address;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Long id,
			@NotEmpty(message = "Name is mandatory") @Size(max = 100, message = "Name cannot exceed 100 characters") String name,
			@NotEmpty(message = "Email is mandatory") @Email(message = "Email should be valid") String email,
			@NotEmpty(message = "Address is mandatory") @Size(max = 255, message = "Address cannot exceed 255 characters") String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}

	

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}

    
}

