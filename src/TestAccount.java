import java.util.*;
public class TestAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Activity 9: Account Subclasses Test ===");

        
        SavingsAccount savings =
        new SavingsAccount(101, "Piyush", 20, 10000);

        //setting pin
        System.out.println("Enter the pin");
        int pin = sc.nextInt();
        savings.setPin(pin);
        
        try {
        System.out.println("Withdraw amount");
        int amount = sc.nextInt();

        savings.withdraw(amount, pin);

        System.out.println(
                "[Savings] Withdraw " + amount +
                " | Balance: Rs " + savings.getBalance()
        );

        } catch (AccountException e) {
        System.out.println(
                "[Savings] Error: " + e.getMessage()
        );
        }

        try {
                savings.withdraw(8000, pin);

                System.out.println(
                        "[Savings] Withdraw below min balance: FAILED"
                );

        } catch (AccountException e) {
                System.out.println(
                        "[Savings] Withdraw below min balance: " +
                        "Caught MinimumBalanceViolationException [PASS]"
                );
        }



        }

}

        // SavingsAccount savings =
        //         new SavingsAccount(101, "Piyush", 20, 10000);

        // System.out.println("Savings Account Created: Balance Rs "
        //         + savings.getBalance()
        //         + " | Min Balance: Rs "
        //         + savings.getminBalance());


        // CurrentAccount current =
        //         new CurrentAccount(102, "Piyush", 20, 15000);

        // System.out.println("Current Account Created: Overdraft Limit Rs "
        //         + current.getoverdraftLimit());


        // FixedDepositAccount fixed = new FixedDepositAccount(103, "Piyush", 20,50000, 12, 6.5);

        // System.out.println("Fixed Deposit Created: Tenure " 
        // + fixed.getTenureMonths() 
        // + " months | Interest: " 
        // + fixed.getIntrestRate() + "%");


        // SalaryAccount salary = new SalaryAccount(104, "Piyush", 20,
        //                 30000, "Infosys");

        // System.out.println("Salary Account Created: Employer "
        //         + salary.getEmployerName());

        // System.out.println("All subclasses instantiated successfully!");
//     }
    