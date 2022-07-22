/**
 * Employee Class and as the company field is common to any static field  used and displayed the details
*/
 public class Employee {
    String name;
    String department;
    char section;
    int empId;
    double salary;
    static String company="TCS";
    Employee(String name,String department,char section,int id,double salary){
        this.name=name;
        this.department=department;
        this.section=section;
        empId=id;
        this.salary=salary;
    }
    /**
     * display method used to display details of the employee
     */
void display(){
        System.out.println(name +" "+department+" "+section+" "+empId+" "+salary+" "+company);
}
/**
 * static method to change the value of static variable
 */
static void change(){
        company="Intel";

}
}
