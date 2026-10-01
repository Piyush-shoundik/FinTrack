public class FixedDepositAccount extends AbstractAccount {

    private int tenureMonths;
    private double interestRate;

    public FixedDepositAccount(int accountNumber, String name, int age,double balance, int tenureMonths, double interestRate) {
        super(accountNumber, name, age, balance, "FIXED_DEPOSIT");
        this.tenureMonths = tenureMonths;
        this.interestRate = interestRate;
    }

    public double calculateMaturityAmount() {
        double rate = interestRate / 100;
        double years = tenureMonths / 12.0;
        return getBalance() * Math.pow(1 + rate, years);
    }

    int getTenureMonths(){
        return tenureMonths;
    }

    double getIntrestRate(){
        return interestRate;
    }

    @Override 
    public void withdraw(double amount, int pin) throws AccountException {
        throw new AccountException ("Premature Withdraw are not allowed");
    }

   @Override
    void processDebit(double amount)
            throws AccountException {

        throw new AccountException(
            "Cannot withdraw before maturity"
        );
    }
}