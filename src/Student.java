/*
Student class used to show the grading of the student with if else statement and a static
block just used which is called only once
* static int id being initialised with one and incremented accordingly
 **/


public class Student {
    static
    {
        System.out.println("Please find the student's result at the bottom");
    }
    String name;
    int rollno;
    int mark;


    static int id=1;
    Student(String name,int mark)
    {
    this.name=name;
    this.mark=mark;
    rollno=id++;
    }

    public void display()
    {
        System.out.println("The details as follow:"+"\nName "+name+"\nRoll no:"+rollno+"\nMark:"+mark);
    }
    public void result()
    {

        if(mark>40 && mark<=60)
        {
            System.out.println(name+" has passed the examination with C grade");

        }
        else if(mark>=61 && mark<80)
        {
            System.out.println(name+" has passed the examination with B grade");
        }
        else if(mark>=81 && mark<101)
        {
            System.out.println(name+" has passed the examination with A grade");

        }
        else if(mark>100){
            System.out.println("Not applicable or Invalid");
        }
        else{
            System.out.println(name+" has failed the examination");
        }}
        static void topper()
        {
            System.out.println("Subject-Maths");
            }
    }

