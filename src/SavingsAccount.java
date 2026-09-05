public class SavingsAccount extends Account{

    private double minBalance = 1000.0;
    private double intrestRate = 4.0;

    public SavingsAccount(int accountNumber, String name, int age, double balance) {
        super(accountNumber, name, age, balance, "SAVINGS");
    }

    void applyInterest(){
        
    }

    public static void main(String[] args){

    }
}
