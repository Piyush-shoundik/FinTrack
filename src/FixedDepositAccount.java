public class FixedDepositAccount extends Account {
    private int tenureMonths  = 12;
    private double interestRate = 6.5;

    FixedDepositAccount(int accountNumber, String name, int age, double balance) {
        super(accountNumber, name, age, balance, "FIXED_ACCOUNT");
    }

    void calculateMaturityAmount(){
        
    }
    
}
