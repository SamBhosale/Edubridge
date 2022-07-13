package com.test.entity;



import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="account_id")
public class CreditAccount extends Account{
	
	private BigDecimal creditLimit;

	

	public CreditAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreditAccount(Long id, String owner, BigDecimal balance, BigDecimal interestRate) {
		super(id, owner, balance, interestRate);
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	

}
