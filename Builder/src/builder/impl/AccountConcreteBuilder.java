package builder.impl;

import builder.AccountBuilder;
import model.Account;

public class AccountConcreteBuilder implements AccountBuilder {
	private String accountName;
	private String accountNumber;

	private String email;
	private boolean hasMobileBanking;

	@Override
	public AccountBuilder setAccountName(String accountName) {
		this.accountName = accountName;
		return this;
	}

	@Override
	public AccountBuilder setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		return this;
	}

	@Override
	public AccountBuilder setEmail(String email) {
		this.email = email;
		return this;
	}

	@Override
	public AccountBuilder setHasMobileBanking(boolean hasMobileBanking) {
		this.hasMobileBanking = hasMobileBanking;
		return this;
	}

	@Override
	public Account build() {
		return new Account(accountName, accountNumber, email, hasMobileBanking);
	}

}
