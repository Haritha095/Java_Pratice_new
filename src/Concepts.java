/*
Concepts class used to show the type casting part and some of the string functions
 **/
public class Concepts {

    /**
     * typeCast method used to show implicit and explicit type conversions
     */
    public void typeCast()
    {
        short dummyNumber1=90;
        int dummyNumber2=dummyNumber1;
        long dummyNumber3=dummyNumber1;
        float dummyNumber4=dummyNumber1;
        System.out.println("Int value"+dummyNumber2);
        System.out.println("Long value"+dummyNumber3);
        System.out.println("Float value"+dummyNumber4);
        double doubleNumber=400.04;
        long longNumber=(long) doubleNumber;
        int intNumber=(int) doubleNumber;
        System.out.println("double value"+doubleNumber);
        System.out.println("long value"+longNumber);
        System.out.println("Int value"+intNumber);
int number1=257;
double number2=290.9;
byte number3=(byte) number1;//int to byte
System.out.println("int "+number1+" byte "+number3);
        number3=(byte) number2;//double to byte
 System.out.println("Double :"+number2+"Byte : "+number3);
    }
    /**
     * stringFunction method to show different ways of String object creation
     */
   public void stringFunction()
   {
       String name="hari";
       String line=new String("All is well");
       System.out.println(name);
       System.out.println(line);

       byte[] b_arr={71,101,109,107,115};
       String s_byte=new String(b_arr);
       System.out.println(s_byte);
       String stringName=new String(b_arr,2,3);
       System.out.println(stringName);
       char charArray[]={'h','a','r','i'};
       String s_3=new String(charArray);
       System.out.println(s_3);
       char charName[]={'m','i','t','t','u'};
       String newString=new String(charName,1,2);
        System.out.println(newString);
       StringBuffer s_buffer = new StringBuffer("malu");
       String s_5 = new String(s_buffer);
       System.out.println(s_5);

   }
   /**
    * stringMethod used to show some basic inbuilt string methods and
    */
   public void stringMethod()
   {
       System.out.println("NatureWillGuideYou".length());
       String quote="Nature will guide you";
       System.out.println(quote.length());
       System.out.println(quote.charAt(7));
       System.out.println(quote.substring(4));
       System.out.println(quote.substring(3,9));
       String name="hari";
       String secondName="arjun";
       String value=name.concat(secondName);
       String variable=name+secondName;
       System.out.println(value);
       System.out.println(variable);
       int output = quote.indexOf("will");
       System.out.println(output);
       String stringLine = "Learning helps you";
       int dummyVariable1=stringLine.indexOf("ing",4);
       System.out.println(dummyVariable1);
       int dummyVariable2=stringLine.lastIndexOf('e');
       System.out.println(dummyVariable2);
       Boolean out="hari".equalsIgnoreCase("hari");
       System.out.println(out);
       System.out.println(stringLine.toLowerCase());
       System.out.println(stringLine.toUpperCase());
       String c="  mittu ";
       System.out.println(c.trim());
       System.out.println(c);
       System.out.println(c.replace('t','k'));

   }
    public static void main(String args[])
    {
        Concepts stringConcept=new Concepts();
        stringConcept.typeCast();
        Concepts concept=new Concepts();
        concept.stringFunction();
        concept.stringMethod();

    }
}
