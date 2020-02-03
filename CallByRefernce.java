public class CallByReference
{
    public static void main(String args[])
    {
        int primitiveValue = 100;
        int arr[]=new int[10];
        System.out.println("Value of primitiveValue before execution of CallbyValue is "+primitiveValue);
        CallbyValue(primitiveValue);
        System.out.println("Value of primitiveValue after execution of CallbyValue is "+primitiveValue);
        CallbyReference(arr);
    }
    public static void CallbyReference(int array[])
    {
        System.out.println("within CallbyReference the value of arr is "+array[0]);
        arr[0]=15;
        System.out.println("within CallbyReference the value of arr after updation is "+array[0]);

    }
    public static void CallbyValue(int value)
    {
        value++;
    }
}