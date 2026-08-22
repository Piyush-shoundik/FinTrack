
class Account {
    private int accountNumber;
    private String name; 
    private int age;
    private double balance;
    private String accountType;
    private String status = "Active" ;
    
    public Account(int accountNumber,String name,int age,double balance,String accountType){
        this.accountNumber = accountNumber;
        this.name = name;
        this.age = age;
        this.balance = balance;
        this.accountType = accountType;
    }

    boolean deposit(double amount){
        if(amount <= 0){
            return false;
        }
        balance += amount;
        return true;
    }

    boolean withdraw(double amount){
        if(balance <= amount){
            return false;
        }
        balance -= amount;
        return true;
    }

    int getAccountNumber(){
        return accountNumber;
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    double getBalance(){
        return balance;
    }

    String getAccountType(){
        return accountType;
    }

    String getStatus(){
        return status;
    }

    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }
    public static void main(String[] args) {
        
        
    }
}





