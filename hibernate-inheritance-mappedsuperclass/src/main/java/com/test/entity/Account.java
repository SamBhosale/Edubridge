package com.test.entity;



	import java.math.BigDecimal;

	import javax.persistence.Id;
	import javax.persistence.MappedSuperclass;

	@MappedSuperclass
	public class Account {
		
		@Id
		private Long id;
		
		private String owner;
		
		private BigDecimal balance;
		
		private BigDecimal interestRate;

		public Account() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Account(Long id, String owner, BigDecimal balance, BigDecimal interestRate) {
			super();
			this.id = id;
			this.owner = owner;
			this.balance = balance;
			this.interestRate = interestRate;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getOwner() {
			return owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public BigDecimal getBalance() {
			return balance;
		}

		public void setBalance(BigDecimal balance) {
			this.balance = balance;
		}

		public BigDecimal getInterestRate() {
			return interestRate;
		}

		public void setInterestRate(BigDecimal interestRate) {
			this.interestRate = interestRate;
		}

		@Override
		public String toString() {
			return "Account [id=" + id + ", owner=" + owner + ", balance=" + balance + ", interestRate=" + interestRate
					+ "]";
		}
		
		

	}
