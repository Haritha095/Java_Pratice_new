/*
* Gifts class to show the exceptional handling concept
 Created two arrays one for student and sweet both of equal length and  tried dividing
 each sweetbox with section of student and 
 in one case as section has zero student we get Arithmetic Exception which is an
 finally()-block to be executed at any cost if the function exists
* */
  
public class Gifts extends Exception
{

public static void main(String args[])
{
   
  int student[] = {67, 78, 67, 89, 0 };
  int sweet[] = {34, 78, 121, 78, 44};
  int[] numberofsweet = new int[5];
  try /*this block is to include the code which we feel can get exceptions*/
  {
    for (int i = 0; i < 5; i++)
    {
        numberofsweet[i] = sweet[i] / student[i];
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
