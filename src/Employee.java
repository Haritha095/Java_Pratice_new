/*
*Class name is Employee with
public Access modifier   which means can be
accessed from any class
since the company field is common to any number of
 employees created,better to go with static so memory get allocated
 once for this field everytime new object created
 *
 * */
 public class Employee {
    String name;
    String department;
    char section;
    int empid;
    double salary;
    static String company="TCS";
    Employee(String name,String department,char section,int id,double salary){
        this.name=name;
        this.department=department;
        this.section=section;
        empid=id;
        this.salary=salary;
    }
    /*
    display method used to display details of the employee
    * */
void display(){
        System.out.println(name +" "+department+" "+section+" "+empid+" "+salary+" "+company);
}
/*
static method to change the value of static variable
 */
static void change(){
        company="Intel";

}


}
