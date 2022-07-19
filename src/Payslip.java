/*
Payslip is the class with three methods with same name with different
argument and type passed to show overloading
*dummy_number1 and dummy_number2 are just variables used to display use of inbuilt methods
* */
public class Payslip {
    int dummy_number1=2;
    int dummy_number2=8;
    public void salary(int basic,int variable )
    {
        int netsalary=basic+variable;
        System.out.println(netsalary);
    }
    public void salary(int basic,int variable,int fixed)
    {
        int netsalary=basic+variable+fixed;
        System.out.println(netsalary);
    }
    public void salary(double basic)
    {
        double netsalary=basic;
        System.out.println(netsalary);
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
