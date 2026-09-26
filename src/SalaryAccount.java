public class SalaryAccount extends AbstractAccount {

    private String employerName;
    private int inactiveMonths;

    public SalaryAccount(int accountNumber, String name, int age, double balance) {
        super(accountNumber, name, age, balance, "SALARY");
        this.employerName = name;
        this.inactiveMonths = 0;
    }

    public String getEmployerName() {
        return employerName;
    }

    public int getInactiveMonths() {
        return inactiveMonths;
    }
    
    @Override 
    void processDebit(double amount)throws AccountException{
        if(amount > this.balance){
            throw new InsufficientBalanceException("Insufficient balance");
        }
        
        balance -= amount;
    }
}