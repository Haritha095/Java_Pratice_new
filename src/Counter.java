/*
*Counter class
* with static variable once memory get allocated each time object created,
the values is retained and count increased from there
  **/
public class Counter {

    static int number=0;
    Counter(){
        number++;
        System.out.println(number);
    }
    public static void main(String args[]){
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();


    }
}
