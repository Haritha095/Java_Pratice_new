public class School {
    public static void main(String args[])
    {
        Student student1=new Student("Hari",87);
        Student student2=new Student("Ammu",98);
        Student student3=new Student("Malu",23);
        Student student4=new Student("Priya",102);
        student1.display();
        student2.display();
        student3.display();
        student4.display();
        student1.result();
        student2.result();
        student3.result();
        student4.result();
        Student.topper();
    }
}
