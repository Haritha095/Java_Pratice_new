/**
 * RankCard class used to check the student has passed the examination or not based on marks obtained
 */
public class Rankcard
{
 private int marks;
 String name;
 private int rollNo;
Rankcard(String name, int rollNo, int marks, String subject )
{
     this.name=name;
     this.rollNo=rollNo;
     this.marks=marks;
}
/**
 * result is the method used to check result based on if else condition
 */
public void result()
{
    if(marks>50){
        System.out.println("Pass");

    }
    else{
        System.out.println("Fail");

    }
}}
