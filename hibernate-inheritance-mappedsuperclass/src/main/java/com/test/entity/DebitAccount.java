package com.test.entity;


import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class DebitAccount extends Account {
	
	private BigDecimal overdraftFee;
	
	

	public DebitAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DebitAccount(Long id, String owner, BigDecimal balance, BigDecimal interestRate) {
		super(id, owner, balance, interestRate);
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getOverdraftFee() {
		return overdraftFee;
	}

	public void setOverdraftFee(BigDecimal overdraftFee) {
		this.overdraftFee = overdraftFee;
	}

	@Override
	public String toString() {
		return "DebitAccount [overdraftFee=" + overdraftFee + "]";
	}
	
	

}
