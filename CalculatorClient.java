public class CalculatorClient
{
    public static void main(String args[])
    {
        Calculator calc=new Calculator();
        System.out.println(calc.add(5,3));
        System.out.println(calc.subtract(5,3));
        System.out.println(calc.product(5,3));
        System.out.println(calc.division(5,3));
        System.out.println(calc.modulo(5,3));
    }
}