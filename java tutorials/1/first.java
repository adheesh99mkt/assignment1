class Student{
    int rollno;
    int marks;
}

public class first
{
    public static void main(String[] args) {

        Student s1=new Student();
        s1.rollno=1;
        s1.marks=59;
        Student s2=new Student();
        s2.rollno=2;
        s2.marks=89;

        Student[] student =new Student[2];
        student[0]=s1;
        student[1]=s2;


        for (Student value : student) {
            System.out.println(value.rollno + " : " + value.marks);
        }
        
    }
}