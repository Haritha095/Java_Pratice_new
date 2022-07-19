import java.util.Scanner;
/*
Loops class used to show the function of switch statement with dummyvariables
 **/
public class Loops {
static int dummynumber1=100;
static int dummynumber2=40;
public static void option()
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter operation");
String m=obj.nextLine();
    switch (m) {
        case "ADD" -> System.out.println(dummynumber1 + dummynumber2);
        case "SUBTRACT" -> System.out.println(dummynumber1 - dummynumber2);
        case "MULTIPLY" -> System.out.println(dummynumber1 * dummynumber2);
        case "DIVIDE" -> System.out.println(dummynumber1 / dummynumber2);
        default -> System.out.println("Type error");
    }
}
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
