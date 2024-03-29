package ComplainceCow;

class Main{
    public static void main(String[] args) {
        BankAccount account = new SavingAccount(200);
        account.deposit(50);
        account.withdrawal(30);
        account.withdrawal(150);
    }
}
public class BankAccount {
    protected double balance;
    BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Deposited : " + amount);
        displayBalance();
    }
    public void withdrawal(double amount){
        if(amount <= balance){
            balance = balance - amount;
            System.out.println("Withdrawn : " + amount);
        }
        else{
            System.out.println("Insufficient Balance");
        }
        displayBalance();
    }
    public void displayBalance(){
        System.out.println("Current Balance : " + balance);
    }
}

class SavingAccount extends BankAccount{
    SavingAccount(double initialBalance){
        super(initialBalance);
    }
    public void withdrawal(double amount) {
        if (balance - amount < 100) {
            System.out.println("Minimum balance of 100 must be maintained.");
        }
        else {
            super.withdrawal(amount);
        }
    }
}
