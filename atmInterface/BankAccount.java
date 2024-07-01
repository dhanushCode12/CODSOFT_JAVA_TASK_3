package atmInterface;

public class BankAccount {
    private double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            System.out.println(amount + " deposited successfully.");
        }
        else{
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && balance >= amount){
            this.balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        }
        else{
            System.out.println("Insufficient balance.");
        }
    }
}
