package atmInterface;

import java.util.Scanner;

public class ATM {
    private final BankAccount account;
    private final Scanner sc;
    public ATM(BankAccount account){
        this.account = account;
        this.sc = new Scanner(System.in);
    }
    public void run() {
        while (true){
            System.out.println("ATM Menu : ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("5. Enter your choice : ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1 :
                    checkBalance();
                    break;
                case 2 :
                    deposit();
                    break;
                case 3 :
                    withdraw();
                    break;
                case 4 :
                    System.out.println("Thank you for using ATM. Goodbye !");
                    return;
                default :
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");

            }
        }
    }
    public void checkBalance(){
        System.out.println("Your balance is : " + account.getBalance());
    }
    public void deposit(){
        System.out.print("Enter amount to deposit : ");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }
    public void withdraw(){
        System.out.println("Enter amount to withdraw : ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }
    public static void main(String[]args) throws Exception {
        BankAccount account = new BankAccount(1000);
        ATM atm = new ATM(account);
        atm.run();
    }
}
