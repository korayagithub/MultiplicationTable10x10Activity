public class MultiplicationTable{
    public static void main(String[] args) {

     int row = 1, col = 1;
     for (row = 1; row <= 10; row++)
     {
         for (col = 1; col <=10; col++)
         {
            System.out.print(row*col + " ");
         }
         System.out.println();
     }
    }
}
