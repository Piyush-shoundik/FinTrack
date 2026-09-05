
class Account {

    //constants
    static final double MIN_BALANCE_SAVINGS = 500.0;
    static final double MIN_BALANCE_CURRENT = 1000.0;
    static final int MIN_AGE = 18;
    static final int MIN_PIN = 1000;
    static final int MAX_PIN = 9999;

    //fields
    private int accountNumber;
    private String name; 
    private int age;
    private double balance;
    private String accountType;
    private String status = "Active" ;
    private Integer pin;
    
    public Account(int accountNumber,String name,int age,double balance,String accountType)
        throws IllegalArgumentException{

        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.name = name;


        //age
        if(age < 18){
            throw new IllegalArgumentException("age must be 18");
        }
        else{
            this.age = age;
        }

        //account type
        if(accountType.equalsIgnoreCase("Savings") ||
        accountType.equalsIgnoreCase("Current") ||
        accountType.equalsIgnoreCase("FIXED_DEPOSIT") ||
        accountType.equalsIgnoreCase("SALARY")) {
            this.accountType = accountType;
        }
        else {
            throw new IllegalArgumentException("Invalid account type");
        }

        //minimum balance rule
        if(accountType.equalsIgnoreCase("Savings")) {  
            if(balance >= MIN_BALANCE_SAVINGS ){
                this.balance = balance;
            }
            else{
                throw new IllegalArgumentException ("minimum balance must more then " + MIN_BALANCE_SAVINGS );
            }
        }
        if(accountType.equalsIgnoreCase("current")){
            if(balance >= MIN_BALANCE_CURRENT ){
                this.balance = balance;
            }
            else{
                throw new IllegalArgumentException ("minimum balance must more then " + MIN_BALANCE_CURRENT );
            }
        }
        
    }

    //deposit
    void deposit(double amount) throws InvalidAmountException, InactiveAccountException {
        if(status.equalsIgnoreCase("inactive")){
            throw new InactiveAccountException("Account in inactive");
        }
        if(amount <= 0){
            throw new InvalidAmountException("Amount should be greater then 0") ;
        }
        else{
            balance += amount;
        }
    }

    //withdraws
    void withdraw(double amount,int pin)throws
        InactiveAccountException,
        InvalidAmountException,
        InsufficientBalanceException,
        MinimumBalanceViolationException,
        InvalidPinException{
        if(status.equalsIgnoreCase("inactive")){
            throw new InactiveAccountException("Account is inactive");
        }
        if(this.pin == null){
            throw new InvalidPinException("Pin is not set");
        }
        if(this.pin != pin ){
            throw new InvalidPinException("Pin is not correct");
        }
        if(amount <= 0){
            throw new InvalidAmountException("Amount should be greater than 0");
        }
        if(amount > this.balance){
            throw new InsufficientBalanceException("Insufficient balance");
        }
        if(accountType.equalsIgnoreCase("savings")){
            if((balance - amount) < MIN_BALANCE_SAVINGS ){
                throw new MinimumBalanceViolationException ("voiliting minimum balance");
            }
        }
        else if (accountType.equalsIgnoreCase("current")){
            if((balance - amount) < MIN_BALANCE_CURRENT  ){
                throw new MinimumBalanceViolationException ("voiliting minimum balance");
            }
        }
        balance -= amount;
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

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) throws IllegalArgumentException{
        if(age < MIN_AGE){
            throw new IllegalArgumentException("age must be above 18");
        }
        this.age = age;
    }

    void closeAccount() throws IllegalStateException {
        if(status.equalsIgnoreCase("Inactive")){
            throw new IllegalStateException("Account allready closed");
        }
        this.status = "Inactive";
    }

    void reopenAccount() throws IllegalStateException {
        if(status.equalsIgnoreCase("active")){
            throw new IllegalStateException ("Account already opened");
        }
        this.status = "Active";
    }

    void setPin(int pin) throws IllegalArgumentException{
        if(pin >= MIN_PIN && pin <= MAX_PIN){
            this.pin = pin;
        }
        else{
            throw new IllegalArgumentException("Invalid Pin");
        }
        
    }

    boolean verifyPin(int pin){
        if(this.pin == pin){
            return true;
        }
        return false;
    }

    boolean hasPin(){
        if(this.pin == null){
            return false;
        }
        return true;
    }

    double getMinimumBalance(){
        if(this.accountType.equalsIgnoreCase("savings") ){
            return MIN_BALANCE_SAVINGS;
        }
        else{
            return MIN_BALANCE_CURRENT;
        }
    }

    void validateActive() throws InactiveAccountException{
        if(status.equalsIgnoreCase("inactive")){
            throw new InactiveAccountException("Account is not active");
        }
    }

    public static void main(String[] args) {
        
        
    }
}





