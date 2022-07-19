/*
Child method inherits Payslip method and have methods one of which actually been overrides parent method

* */
public class Child extends Payslip {
      public void thought()
    {
        System.out.println("Grateful and Thankful for everything");
    }
    Child(int dummynumber1,int dummynumber2)
    {
        super(dummynumber1,dummynumber2);


    }
    public void prize()
    {
       System.out.println("Congragulations to winner");

    }
}
