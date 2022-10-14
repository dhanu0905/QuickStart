package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tieto_fee")
@Entity
public class Fee {
	@Id
	private int id;
	private String year;
	private String branch;
	private double amount;
	
	public Fee() {
		super();
	}

	public Fee(int id, String year, String branch, double amount) {
		super();
		this.id = id;
		this.year = year;
		this.branch = branch;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Fee [id=" + id + ", year=" + year + ", branch=" + branch + ", amount=" + amount + "]";
	}
	
	
}
