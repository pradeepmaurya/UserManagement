package com.user.management.model;

import java.security.Timestamp;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tbl_user")
public class User {

	@Id
//	@NotEmpty(message = "User id Should not be Empty!!")
	private Integer userId;
	
	@NotEmpty(message = "userName should not be Empty!!")
	@Size(min = 3, max = 20, message = "please enter user between 3 t0 20 characters")
	private String userName;
	
	@NotEmpty(message = " Date of birth should not be Empty!!")
	@JsonFormat(pattern = "MM/dd/yyyy")
	private String dateOfBirth;
	
	@NotEmpty(message = "userName should not be Empty!!")
	@Email(message = "please enter valid email address!!")
	private String email;
	
	@NotEmpty(message = "phone number should not be empty")
	@Size(min = 12, max = 12, message = "Please enter phone number 12 digit!!")
	private String phoneNumber;
	
	@NotEmpty(message = "should not be Empty!!")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private String date;
	
	@NotEmpty(message = "Should not be Empty!!")
	@JsonFormat(pattern = "HH:MM")
	private String time;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public User(Integer userId, String userName, String dateOfBirth, String email, String phoneNumber, String date,
			String time) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.date = date;
		this.time = time;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", dateOfBirth=" + dateOfBirth + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", date=" + date + ", time=" + time + "]";
	}
	
	
}
