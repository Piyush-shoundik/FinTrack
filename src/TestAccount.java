public class TestAccount {

    public static void main(String[] args) {

        System.out.println("=== Activity 7: Account Subclasses Test ===");

        SavingsAccount savings =
                new SavingsAccount(101, "Piyush", 20, 10000);

        System.out.println("Savings Account Created: Balance Rs "
                + savings.getBalance()
                + " | Min Balance: Rs "
                + savings.getminBalance());


        CurrentAccount current =
                new CurrentAccount(102, "Piyush", 20, 15000);

        System.out.println("Current Account Created: Overdraft Limit Rs "
                + current.getoverdraftLimit());


        FixedDepositAccount fixed = new FixedDepositAccount(103, "Piyush", 20,50000, 12, 6.5);

        System.out.println("Fixed Deposit Created: Tenure " 
        + fixed.getTenureMonths() 
        + " months | Interest: " 
        + fixed.getIntrestRate() + "%");


        SalaryAccount salary = new SalaryAccount(104, "Piyush", 20,
                        30000, "Infosys");

        System.out.println("Salary Account Created: Employer "
                + salary.getEmployerName());

        System.out.println("All subclasses instantiated successfully!");
    }
}