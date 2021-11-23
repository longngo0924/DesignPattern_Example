package app;

import builder.AccountBuilder;
import builder.impl.AccountConcreteBuilder;
import model.Account;

public class Main {

	public static void main(String[] args) {
		AccountBuilder builder = new AccountConcreteBuilder().setAccountName("NGO QUANG LONG")
				.setAccountNumber("0123456789");
		Account account = builder.build();
		System.out.println(account);

	}

}
