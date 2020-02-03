public class BankAccount
{
    static float balance=0.0f;
    public static float checkBalance()
    {
        return balance;
    }
    public static void withdrawkBalance(float amt)
    {
        balance = balance-amt;
    }
    public static void depositBalance(float amt)
    {
         balance=balance+amt;
    }

}