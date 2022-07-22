/**
 * Child method inherits Payslip method and have methods one of which actually overrides parent method
 */
public class Child extends Payslip {
      public void thought()
    {

        System.out.println("Grateful and Thankful for everything");
    }
    Child(int dummyNumber1,int dummyNumber2)
    {
        super(dummyNumber1,dummyNumber2);

    }
    public void prize()
    {
       System.out.println("Congragulations to winner");

    }
}
