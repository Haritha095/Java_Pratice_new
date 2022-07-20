/**
 * Counter class with static variable number so  the values is retained and count increased from there
 */
public class Counter {
    static int number=0;
    Counter(){
        number++;
        System.out.println(number);
    }
    public static void main(String args[]){
        Counter count1=new Counter();
        Counter count2=new Counter();
        Counter count3=new Counter();


    }
}
