import java.util.Scanner;
/**
 * Factorial class to show the functionality of for loop with factorial finding program
 */
public class Factorial {
public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a number");
 int number=sc.nextInt();
 int term=1;
 for(int i=1;i<=number;i++)
 {
 term=term*i;
 }
 System.out.println(term);
 }
 }

