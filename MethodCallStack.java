public class MethodCallStack
{
    public static void main(String args[])
    {
        System.out.println("Called before executing method1");
        method1();
        System.out.println("Executing main after executing method1");
    }
    public static void method1()
    {
        System.out.println("called before executing method2");
        method2();
        System.out.println(" executing method1 after executing method2");
    }
    public static void method2()
    {
        System.out.println("called before executing method3");
        method3();
        System.out.println(" executing method2 after executing method3");
    }
    public static void method3()
    {
        System.out.println(" executing method3 from method2");
    
    }
    
}