public interface IAccount{
    public int getAccountNumber();

    public String getName();

    public double getBalance();

    public String getAccountType();

    public String getStatus();

    public void deposit(double amount) throws InvalidAmountException, InactiveAccountException;

    //here it is string
    public void withdraw(double amount, int pin) throws AccountException;

    // public void displayAccountInfo();

}