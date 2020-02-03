public class TwoDimensionalArray
{
    public static void main(String args[])
    {
        int rowcount = 4;
        int colcount = 4;
        value=10;
        int twoDimensionalArray[][]=new int[rowcount][colcount];
        //populating the items in the array
        for (int row = 0; row < rowcount; row++) {
            for (int col = 0; col < colcount; col++) {
                twoDimensionalArray[row][col]=value++; 
            }
        }
            //print the array
            for (int row = 0; row < rowcount; row++) {
                for (int col = 0; col < colcount; col++) {
                    System.out.print(twoDimensionalArray[row][col]+"\t");
            }
            System.out.println();
            
            }
        }
    }
}