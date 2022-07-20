/*
Concepts class used to show the type casting part and some of the string functions
 **/
public class Concepts {

    /**
     * typeCast method used to show implicit and explicit type conversions
     */
    public void typeCast()
    {
        short dummynumber1=90;
        int dummynumber2=dummynumber1;
        long dummynumber3=dummynumber1;
        float dummynumber4=dummynumber1;
        System.out.println("Int value"+dummynumber2);
        System.out.println("Long value"+dummynumber3);
        System.out.println("Float value"+dummynumber4);
        double doublenumber=400.04;
        long longumber=(long) doublenumber;
        int intnumber=(int) doublenumber;
        System.out.println("double value"+doublenumber);
        System.out.println("long value"+longumber);
        System.out.println("Int value"+intnumber);
int number1=257;
double number2=290.9;
byte number3=(byte) number1;//int to byte
System.out.println("int "+number1+" byte "+number3);
        number3=(byte) number2;//double to byte
 System.out.println("Double :"+number2+"Byte : "+number3);
    }
    /**
     * stringFunction method to show diferent ways of String object creation
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
       String stringname=new String(b_arr,2,3);
       System.out.println(stringname);
       char chararray[]={'h','a','r','i'};
       String s_3=new String(chararray);
       System.out.println(s_3);
       char charname[]={'m','i','t','t','u'};
       String newstring=new String(charname,1,2);
        System.out.println(newstring);
       StringBuffer s_buffer = new StringBuffer("malu");
       String s_5 = new String(s_buffer);
       System.out.println(s_5);

   }
   /**
    * stringMethod used to show some basic inbuilt string methods and
    */
   public void stringMethod()
   {
       System.out.println("NaturewillGuideyou".length());
       String quote="Nature will guide you";
       System.out.println(quote.length());
       System.out.println(quote.charAt(7));
       System.out.println(quote.substring(4));
       System.out.println(quote.substring(3,9));
       String name="hari";
       String secondname="arjun";
       String value=name.concat(secondname);//concatination two strings
       String variable=name+secondname;
       System.out.println(value);
       System.out.println(variable);
       int output = quote.indexOf("will");
       System.out.println(output);
       String stringline = "Learning helps you";
       int dummyvariable1=stringline.indexOf("ing",4);
       System.out.println(dummyvariable1);
       int dummyvariable2=stringline.lastIndexOf('e');
       System.out.println(dummyvariable2);
       Boolean out="hari".equalsIgnoreCase("hari");
       System.out.println(out);
       System.out.println(stringline.toLowerCase());
       System.out.println(stringline.toUpperCase());
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
