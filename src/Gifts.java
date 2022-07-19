public class Gifts extends Exception
{
public static void main(String args[])
{
    /*Created wtwo arrays one for student and sweet both of equal length and  when divided each sweetbox
     with section of student and in one case as section has zero student we get Arithmetic Exception which is an
      example of unchecked exception */
  int student[] = {67, 78, 67, 89, 0 };
  int sweet[] = {34, 78, 121, 78, 44};
  int[] numsweet = new int[5];
  try /*this block is to include the code which we feel can get exceptions*/
  {
    for (int i = 0; i < 5; i++)
    {
     numsweet[i] = sweet[i] / student[i];
     }
     }
     catch (ArithmeticException error) /*executed when exception occurs*/
     {
     System.out.println("Arithmetic Exception");
     System.out.println(error.getMessage() + "error .");
     }
     finally /*set of code to be executed at any cost*/
     {
     System.out.println("error");
      }
      }
}