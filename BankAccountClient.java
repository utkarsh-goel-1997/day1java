public class BankAccountClient
{
    public static void main()
    {
         BankAccount ba = new BankAccount();

        System.out.println("you have "+ba.checkBalance()+" in you bank account");
        ba.depositBalance(1000);
        ba.withdrawBalance(500);
        System.out.println("you have "+ba.checkBalance()+" in you bank account");

    }
}