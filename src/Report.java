import java.util.Scanner;
/**
 * Report class is used to pass values into the object created for Rankcard class and check the student's result status
 */
public class Report extends Rankcard
{
Report(String name, int rollNo, int marks, String subject)
{
        super(name, rollNo, marks, subject);
       }
    public static void main(String args[])
    {
    Scanner student=new Scanner(System.in);
    System.out.println("Enter student Details");
    String name=student.nextLine();
    int rollNo=student.nextInt();
    int marks=student.nextInt();
    String subject=student.nextLine();
    System.out.println("Find the details as follow" + "\nName:"+"\t"+name+"\nRoll Number:"+"\t"+rollNo+"\nMark:"+"\t" +marks);
    Rankcard rank=new Rankcard("Haritha",101,87,"English");
    System.out.println("Based on the data the student result:");
    rank.result();
    }}

