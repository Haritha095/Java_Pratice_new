/*
Project class used to show conversion of primitive type to wrapper class and viceversa
 * */
public class Project {
    public static void main (String args[])
    {
        int age=24;
        System.out.println("print it"+"\n"+age);
       
        Integer value= 929;
            Character letter= 'b';
            System.out.println(value);
            System.out.println(letter);
           
        Integer years=9875;
        String str=years.toString();
        System.out.println("length is"+"\t"+ str.length());
        /*Autoboxing*/
        int time=90;
        Integer obj=Integer.valueOf(time);
        System.out.println(time + "object:"+ obj);
        /*Unboxing*/
        Integer time_1= new Integer(90);
        int number=time_1.intValue();
        System.out.println(number +" "+time_1);
    }
}

