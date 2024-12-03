package ObjectOrientedProgramming.Encapsulation.Example2;

public class Main
{
    public static void main(String[] args) {
        Bank bank=new Bank();

        bank.setAccountNumber(23456789);
        System.out.println("Account number: "+bank.getAccountNumber());

        bank.setBalance(30000.00);
        System.out.println("Balance: "+bank.getBalance());

        bank.deposit(1000);
        bank.withdraw(350000);
    }
}
