/*
Company class with main method creating objects for Employee class and calling methods from Employee class
 */
public class Company {
    public static void main(String args[]){
        Employee emp1=new Employee("Haritha","IT",'A',101,59000.23);
        Employee emp2=new Employee("Arjun","Analytics",'A',102,57000.89);
        Employee emp3=new Employee("Ajith","IT",'A',103,54000.67);
        emp1.display();
        emp2.display();
        emp3.display();
        emp1.change();
        emp1.display();

        System.out.println("the highest of two is" + Math.max(emp2.salary,emp3.salary));


    }
}
