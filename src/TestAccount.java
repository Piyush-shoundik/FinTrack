// public class TestAccount {

//     public static void main(String[] args) {

//         AbstractAccount[] accounts = {
//             new SavingsAccount(101, "Piyush", 20, 10000),
//             new CurrentAccount(102, "Rahul", 25, 20000),
//             new SalaryAccount(103, "Aman", 22, 30000)
//         };

//         accounts[0].setPin(1234);
//         accounts[1].setPin(5678);
//         accounts[2].setPin(1111);

//         transferFunds(
//             accounts[0],
//             accounts[1],
//             2000,
//             1234
//         );

//     } 
//     static void transferFunds(
//             AbstractAccount source,
//             AbstractAccount destination,
//             double amount,
//             int pin) {

//         try {

//             source.withdraw(amount, pin);

//             destination.deposit(amount);

//             System.out.println(
//                 "Transfer successful: Rs " + amount
//             );

//         } catch (AccountException e) {

//             System.out.println(
//                 "Transfer failed: " + e.getMessage()
//             );
//         }
//     }
// }

public class TestAccount {
    public static void main(String[] args) {
        IAccount obj = AccountFactory.createAccount("savings" , 12345, "om" , 20 , 10000);
        System.out.println(obj.getAccountType());
    }
}

    