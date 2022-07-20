/**
 *  Delivery class creates object for Payslip and Child and with main method all the function been called
*/
public class Delivery {
    public static void main(String args[])
    {
        Payslip payslip1=new Payslip(2,4);
        payslip1.salary(100,20000,30);
        Child child1=new Child(2,4);
        payslip1.thought();
        child1.thought();
        child1.prize();
        child1.prize();

    }
}
