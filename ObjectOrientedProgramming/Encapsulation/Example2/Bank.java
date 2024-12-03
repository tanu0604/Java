package ObjectOrientedProgramming.Encapsulation.Example2;

public class Bank
{
    private long accountNumber;
    private double balance;

    public void deposit(double amount)
    {
        if (amount>0)
        {
            System.out.println();
            System.out.println("Amount deposited: "+amount);
            balance+=amount;
            System.out.println("Bank Balance: "+balance);
        }
        else
            System.out.println("Invalid Amount!!!");
    }
    public void withdraw(double amount)
    {
        if (amount>0 && amount<=balance)
        {
            System.out.println();
            System.out.println("Amount withdrawn: "+amount);
            balance-=amount;
            System.out.println("Remaining Bank Balance: "+balance);
        }
        else
            System.out.println("Invalid Amount!!!");
    }
    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
}
