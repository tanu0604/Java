package ExceptionHandling.CustomExceptions;

public class Main
{
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount(5000);
        try {
            bankAccount.withdraw(30000);
        } catch (InsufficientFundsException e)
        {
            System.out.println(e);
        }
    }
}
