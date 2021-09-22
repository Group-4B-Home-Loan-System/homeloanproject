package com.homeloan.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="users")
public class User {
	@Id
	private String username;
	
	@Column(name = "password", nullable = false,length = 64)
	private String password;
	@Column(nullable = false,length = 20)
	private String name;
	@Column(nullable = false,length = 20)
	private long loan_amount;
	@Column(nullable = true,length = 20)
	private String application_status;
	@Column(nullable = false,length = 20)
	private String address;
	@Column(nullable = false,length = 20)
	private long monthly_salary;
	@Column(nullable = true,length = 20)
	private long tenure;
	@Column(nullable = true,length = 20)
	private long no_emi_paid;
	@Column(nullable = true,length = 20)
	private String payment_status;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(long loan_amount) {
		this.loan_amount = loan_amount;
	}
	public String getApplication_status() {
		return application_status;
	}
	public void setApplication_status(String application_status) {
		this.application_status = application_status;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMonthly_salary() {
		return monthly_salary;
	}
	public void setMonthly_salary(long monthly_salary) {
		this.monthly_salary = monthly_salary;
	}
	public long getTenure() {
		return tenure;
	}
	public void setTenure(long tenure) {
		this.tenure = tenure;
	}
	public long getNo_emi_paid() {
		return no_emi_paid;
	}
	public void setNo_emi_paid(long no_emi_paid) {
		this.no_emi_paid = no_emi_paid;
	}
	public String getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
}
