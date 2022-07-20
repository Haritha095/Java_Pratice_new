import java.util.Scanner;
/**
 * Loops class used to show the function of switch statement and static method
*/
public class Loops {
static int dummyNumber1=100;
static int dummyNumber2=40;
public static void option()
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter operation");
String m=obj.nextLine();
    switch (m) {
        case "ADD" -> System.out.println(dummyNumber1 + dummyNumber2);
        case "SUBTRACT" -> System.out.println(dummyNumber1 - dummyNumber2);
        case "MULTIPLY" -> System.out.println(dummyNumber1 * dummyNumber2);
        case "DIVIDE" -> System.out.println(dummyNumber1 / dummyNumber2);
        default -> System.out.println("Type error");
    }
}
/**
 * number() a static method to check if the number is odd or even
 */
public static void  number()
{
    for(int i=0;i<=10;i++){
        if(i %2==0)
        {
            System.out.println("This is even number: ");
            System.out.println(i);
        }
else{
            System.out.println("odd number: ");
            System.out.println(i);

    }
}}

public static void main(String args[])
{
number();
option();
}
}
