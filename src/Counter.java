public class Counter {
    /*with static variable once memory get allocated each time object created,the values is retained and count increased from there*/
    static int c=0;
    Counter(){
        c++;
        System.out.println(c);
    }
    public static void main(String args[]){
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();


    }
}
