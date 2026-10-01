public class AccountFactory {

    public static IAccount createAccount(
            String accountType,
            int accountNumber,
            String name,
            int age,
            double balance) {

        if (accountType.equalsIgnoreCase("SAVINGS")) {
            return new SavingsAccount(
                accountNumber,
                name,
                age,
                balance
            );

        } else if (accountType.equalsIgnoreCase("CURRENT")) {
            return new CurrentAccount(
                accountNumber,
                name,
                age,
                balance
            );
        } else if (accountType.equalsIgnoreCase("FIXED_DEPOSIT")) {

            return new FixedDepositAccount(
                accountNumber,
                name,
                age,
                balance,
                12,
                7.5
            );

        } else if (accountType.equalsIgnoreCase("SALARY")) {
            return new SalaryAccount(
                accountNumber,
                name,
                age,
                balance
            );
        } else {
            throw new IllegalArgumentException(
                "Unknown account type: " + accountType
            );
        }
    }
}