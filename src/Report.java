import java.util.Scanner;
/*
Report class is used to pass values into the object
created for Rankcard class and check the student's result status
 * */
public class Report extends Rankcard
{
Report(String name, int rollno, int marks, String subject)
{
        super(name, rollno, marks, subject);
       }
    public static void main(String args[])
    {
    Scanner obj=new Scanner(System.in);
System.out.println("Enter student Details");
   String name=obj.nextLine();
    int rollno=obj.nextInt();
    int marks=obj.nextInt();
    String sub=obj.nextLine();
System.out.println("Find the details as follow" + "\nName:"+"\t"+name+"\nRoll Number:"+"\t"+rollno+"\nMark:"+"\t" +marks);
        Rankcard d=new Rankcard("haritha",101,87,"English");
        System.out.println("Based on the data the student result:");
        d.result();
    }}

