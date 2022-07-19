/*
Delivery class creates object for Payslip and Child and
with main method all the function been called

* */
public class Delivery {
    public static void main(String args[])
    {
        Payslip obj=new Payslip(2,4);
        obj.salary(100,20000,30);
        Child ob=new Child(2,4);
        obj.thought();
        ob.thought();
        ob.prize();
        ob.prize();

    }
}
