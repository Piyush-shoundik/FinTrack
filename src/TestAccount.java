public class TestAccount{
    public static void main(String[] args) {
        Account obj = new Account(1001, "john doe", 25, 1000, "savings");
        System.out.println("Account created!");
        System.out.println(obj.getAccountNumber() + " | "+ obj.getName() +" | "+ obj.getAge() +" | "+ obj.getBalance() +" | "+ obj.getStatus());

        //deposit
        double d = 500; //input 
        if(obj.deposit(d) == false){
            System.out.println("deposit FAILED(Invalid amount)");
        }
        else{
            System.out.println("new balane: " + obj.getBalance() );
        }

        //withdraw Money
        double with = 200; //input
        if(obj.withdraw(with) == false){
            System.out.println("Failed Insufficient Balance");
            System.out.println("Curret balance: " + obj.getBalance());
        }
        else{
            System.out.println("Withdrawing " + with + " SUCCESS" );
        }

        //creating acct
        System.out.println("Creating another account");
        Account obj2 = new Account(1002 , "Jane Smith" ,30 , 2000 , "current");
        System.out.println(obj2.getAccountNumber() +" | "+ obj2.getName() +" | "+ obj2.getAge() +" | "+ obj2.getBalance() +" | "+ obj2.getStatus());


        System.out.println("All Accounts");
        System.out.println(obj.getAccountNumber() +"|"+ obj.getName() +" | "+ obj.getAge() +" | "+ obj.getBalance() +" | "+ obj.getStatus());
        System.out.println(obj2.getAccountNumber() +" | "+ obj2.getName() +" | "+ obj2.getAge() +" | "+ obj2.getBalance() +" | "+ obj2.getStatus());

            
    }
}
    
