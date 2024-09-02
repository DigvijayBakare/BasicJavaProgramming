package TIllMay2024.Interface;

interface BankAccount{
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
class SavingAccount implements BankAccount{
    private double balance;
    private double interestRate;
    public SavingAccount(double initialDeposit, double interestRate){
        this.balance = initialDeposit;
        this.interestRate = interestRate;
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of "+amount+" has been done to your saving account");
    }
    @Override
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawal of "+amount+" has been done from your saving account");
    }
    @Override
    public double getBalance() {
        System.out.println("Available balance in your saving account is "+balance);
        return balance;
    }
    public void applyInterestRate(){
        balance += balance * interestRate /100;
        System.out.println("After applying the interest rate of "+interestRate+" your balance after one your wii be "+balance);
    }
}
class CurrentAccount implements BankAccount{
    private double balance;
    private double overDriftlimit;
    public CurrentAccount(double initialDeposit, double overDriftlimit){
        this.balance = initialDeposit;
        this.overDriftlimit = overDriftlimit;
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of "+amount+" has been done to your current account");
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overDriftlimit >= amount){balance -= amount;}
        System.out.println("Withdrawal of "+amount+" has been done from your current account");
    }
    @Override
    public double getBalance() {
        System.out.println("Available balance in your saving account is "+balance);
        return balance;
    }
    public void Setoverdriftlimit(double overDriftlimit){
        this.overDriftlimit = overDriftlimit;
        System.out.println("Your over drift limit is "+overDriftlimit);
    }
}
public class BalanceSheet {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(1000,1.25);
        CurrentAccount currentAccount = new CurrentAccount(5000,1500);
        savingAccount.deposit(100);
        savingAccount.withdraw(150);
        savingAccount.getBalance();
        savingAccount.applyInterestRate();
    }
}
