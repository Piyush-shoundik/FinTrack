public class SalaryAccount extends Account {

    private String employerName ;
    private int inactiveMonths ;

    public SalaryAccount(int accountNumber, String name, int age, double balance) {
        super(accountNumber, name, age, balance, "SALARY_ACCOUNT");
    }

    public static void main(String[] args){

    }
}
