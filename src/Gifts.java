/**
 *  Gifts class to show the exceptional handling concept-Arithmetic exception being raised here
*/
  
public class Gifts extends Exception
{

public static void main(String args[])
{
   
  int student[] = {67, 78, 67, 89, 0 };
  int sweet[] = {34, 78, 121, 78, 44};
  int[] numberOfSweet = new int[5];
  try
  {
    for (int i = 0; i < 5; i++)
    {
        numberOfSweet[i] = sweet[i] / student[i];
     }
     }
     catch (ArithmeticException error) 
     {
     System.out.println("Arithmetic Exception");
     System.out.println(error.getMessage() + "error .");
     }
     finally 
     {
     System.out.println("error");
      }
      }
}
