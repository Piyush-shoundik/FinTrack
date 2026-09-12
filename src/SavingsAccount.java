public class SavingsAccount extends AbstractAccount{

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

    @Override
    void withdraw(double amount, int pin)throws AccountException{
        if(this.balance - amount < minBalance){
            throw new  MinimumBalanceViolationException("Minimum balance violation");
        }
        else{
            super.withdraw(amount, pin);
        }
    }

    @Override
    void processDebit(double amount)
            throws AccountException {

        if (balance - amount < MIN_BALANCE_SAVINGS) {
            throw new MinimumBalanceViolationException(
                "Violating minimum balance"
            );
        }

        balance -= amount;
    }

    public static void main(String[] args){

    }
}
