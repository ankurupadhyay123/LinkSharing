package com.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer userId;

	@Column
	private String firstName;

	@Column
	private String lastName;

	@Column
	private String userName;

	@Column
	private String email;

	@Column
	private String password;

	@Column
	private Date dob;

	@Lob
	@Column
	private byte[] profilePhoto;

/*
	public User(Integer userId, String firstName, String lastName, String userName, String email, String password, Date dob) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.dob = dob;
	}
*/

/*	public User(String firstName, String lastName, String userName, String email, String password, Date dob) {
		super();
		this.userId = i+1;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.dob = dob;
	}*/


	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public byte[] getProfilePhoto() { return profilePhoto; }

	public void setProfilePhoto(byte[] profilePhoto) { this.profilePhoto = profilePhoto;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", UserName="
				+ userName + ", email=" + email + ", password=" + password + ", dob="+ dob+"]";
	}

}