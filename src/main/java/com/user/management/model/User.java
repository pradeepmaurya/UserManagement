package com.user.management.model;

import java.security.Timestamp;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tbl_user")
public class User {

	@Id
	private Integer userId;
	@NotEmpty(message = "userName should not be Empty!!")
	private String userName;
	@NotEmpty(message = " Date of birth should not be Empty!!")
	@JsonFormat(pattern = "MM/dd/yyyy")
	private String dateOfBirth;
	@Email
	private String email;
	@NotEmpty
	private String phoneNumber;
	@JsonFormat(pattern = "MM/dd/yyyy")
	private Date date;
	@JsonFormat(pattern = "HH:MM")
	private Date time;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public User(Integer userId, String userName, String dateOfBirth, String email, String phoneNumber, Date date,
			Date time) {
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
