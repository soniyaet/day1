package com.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class UserModel {
	@NotEmpty
	private int userId;
	@NotEmpty
	private String userName;
	@Size(min=5,max=8,message="be between 5 and 8")
	private String password;
	
}
