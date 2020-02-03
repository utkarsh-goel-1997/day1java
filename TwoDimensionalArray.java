public class TwoDimensionalArray
{
         static int rowcount = 4;
         static int colcount = 4;
         static int value=10;
         static int twoDimensionalArray[][]=new int[rowcount][colcount];
       public static void main(String args[])
        {
        
           
           populateArray();
           printArray();
        }
        //populating the items in the array
        private static void populateArray()
        {
            for (int row = 0; row < rowcount; row++) 
            {
                for (int col = 0; col < colcount; col++) 
                {
                    twoDimensionalArray[row][col]=value++; 
                }
            }
        }
        
            //print the array
            private static void printArray()
            {
                for (int row = 0; row < rowcount; row++) 
                {
                    for (int col = 0; col < colcount; col++)
                     {
                        System.out.print(twoDimensionalArray[row][col]+"\t");
                     }
                    System.out.println();
                }
            
            }
}

