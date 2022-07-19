public class School {
    public static void main(String args[])
    {
        Student s1=new Student("Hari",87);
        Student s2=new Student("Ammu",98);
        Student s3=new Student("Malu",23);
        Student s4=new Student("Priya",102);
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s1.result();
        s2.result();
        s3.result();
        s4.result();
        Student.topper();
    }
}
