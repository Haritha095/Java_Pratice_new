/**
 * Payslip is the class with three methods with same name but with different argument and type passed to show overloading
 */
public class Payslip {
    int dummy_number1=2;
    int dummy_number2=4;
    public void salary(int basic,int variable )
    {
        int netSalary=basic+variable;
        System.out.println(netSalary);
    }
    public void salary(int basic,int variable,int fixed)
    {
        int netSalary=basic+variable+fixed;
        System.out.println(netSalary);
    }
    public void salary(double basic)
    {
        double netSalary=basic;
        System.out.println(netSalary);
    }
    /*
    thought method is used to show the concept of overriridng
     */
    public void thought()
    {
        System.out.println("Grateful for everything");
    }
    Payslip(int dummy_number1, int dummy_number2)
    {
        this.dummy_number1=dummy_number1;
        this.dummy_number2=dummy_number2;
    }
    /*
    prize method used to show the use of inbuilt method
    here we use Math.max() inbuilt method
     **/
    public void prize()
    {
        dummy_number1 +=dummy_number1;
        dummy_number2 +=dummy_number2;
System.out.println("Winner has got:"+Math.max(dummy_number1,dummy_number2));

    }

}
