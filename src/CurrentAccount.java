public class CurrentAccount extends Account {
    
    private double overdraftLimit = 25000.0;
    
    CurrentAccount(int accountNumber, String name, int age, double balance) {
        super(accountNumber, name, age, balance, "CURRENT");
    }

    double overdraftLimit(){
        return overdraftLimit;
    }

    void setoverdraftLimit(double overdraftLimit){
        this.overdraftLimit = overdraftLimit;
    }

    public static void main(String[] args){
        
    }
    
}
