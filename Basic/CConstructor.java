package TIllMay2024.Constructors;

// This is a copy Constructor

class Student{
    String name;
    int no;
    Student(String name,int no){
        this.name = name;
        this.no = no;
    }
    Student(Student Obj2){

        this.name = Obj2.name;
        this.no = Obj2.no;;
    }
}
public class CConstructor{
    public static void main(String[] args) {
        System.out.println("First");
        Student student = new Student("Arun",64);
        System.out.println("Name = "+student.name+"; Roll no = "+student.no);
        System.out.println("Second");
        Student student1 = new Student("Rahul",65);
        System.out.println("Name = "+student1.name+"; Roll no = "+student1.no);
    }
}
