public class Project {
    public static void main (String args[])
    {
        int age=24;
        System.out.println("print it"+"\n"+age);
        /*Wrapper class*/
        Integer val= 929;
            Character ch= 'b';
            System.out.println(val);
            System.out.println(ch);
            /*using to string method*/
        Integer years=9875;
        String str=years.toString();
        System.out.println("length is"+"\t"+ str.length());//as it has been to string,length can be found out
        /*Autoboxing*/
        int time=90;
        Integer obj=Integer.valueOf(time);/*creating a wrapping object*/
        System.out.println(time + "object:"+ obj);
        /*Unboxing*/
        Integer time_1= new Integer(90);//converting a wrapper class back to primitive type
        int num=time_1.intValue();
        System.out.println(num +" "+time_1);
    }
}

