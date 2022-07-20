/**
 * Company class with main method creating objects for Employee class and calling methods from Employee class
 */
public class Company {
    public static void main(String args[]){
        Employee employee1=new Employee("Haritha","IT",'A',101,59000.23);
        Employee employee2=new Employee("Arjun","Analytics",'A',102,57000.89);
        Employee employee3=new Employee("Ajith","IT",'A',103,54000.67);
        employee1.display();
        employee2.display();
        employee3.display();
        employee1.change();
        employee1.display();

        System.out.println("the highest of two is" + Math.max(employee2.salary,employee3.salary));


    }
}
