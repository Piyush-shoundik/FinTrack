public class CurrentAccount extends AbstractAccount {
    
    private double overdraftLimit = 25000.0;
    
    CurrentAccount(int accountNumber, String name, int age, double balance) {
        super(accountNumber, name, age, balance, "CURRENT");
    }

    double getoverdraftLimit(){
        return overdraftLimit;
    }

    void setoverdraftLimit(double overdraftLimit){
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void processDebit(double amount) throws AccountException{
        if(amount > overdraftLimit){
            throw new InsufficientBalanceException("Insufficient balance");
        }

        this.balance -= amount;
    }

    @Override
    public void withdraw(double amount, int pin) throws AccountException {
        if(verifyPin(pin) == false){
            throw new InvalidPinException("Invalid Pin");
        }
        if(getStatus().equalsIgnoreCase("inactive")) {
            throw new InactiveAccountException("Account is inactive");
        }
        if (amount > this.balance + overdraftLimit){
            throw new InsufficientBalanceException ("Insufficient limit");
        }
        if (amount <= 0) {
            throw new InvalidAmountException("Amount should be greater than 0");
        }

        this.balance -= amount;

    }

    public static void main(String[] args){

    }

    
}
