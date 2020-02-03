public class CallByReference
{
    public static void main(String args[])
    {
        int primitiveValue = 100;
        int arr[]=new int[10];
        System.out.println("Value of primitiveValue before execution of CallbyValue is "+primitiveValue);
        CallbyValue(primitiveValue);
        System.out.println("Value of primitiveValue after execution of CallbyValue is "+primitiveValue);
        System.out.println("Value of arr before execution of CallbyReference is "+arr[0]);
        CallbyReference(arr);
        System.out.println("Value of arr after execution of CallbyReference is "+arr[0]);
    }
    public static void CallbyReference(int array[])
    {
        array[0]=+15;

    }
    public static void CallbyValue(int value)
    {
        ++value;
    }
}