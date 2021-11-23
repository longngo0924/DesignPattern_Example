package builder;

import model.Account;

public interface AccountBuilder {
	AccountBuilder setAccountName(String accountName);

	AccountBuilder setAccountNumber(String accountNumber);

	AccountBuilder setEmail(String email);

	AccountBuilder setHasMobileBanking(boolean hasMobileBanking);

	Account build();
}
