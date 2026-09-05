public class SavingsAccount extends Account{

    private double minBalance = 1000.0;
    private double interestRate = 4.0;

    public SavingsAccount(int accountNumber, String name, int age, double balance) {
        super(accountNumber, name, age, balance, "SAVINGS");
    }

    double getminBalance(){
        return minBalance;
    }

void applyInterest() throws InvalidAmountException, InactiveAccountException {
    double interest = getBalance() * interestRate / 100;
    deposit(interest);
}

    public static void main(String[] args){

    }
}
