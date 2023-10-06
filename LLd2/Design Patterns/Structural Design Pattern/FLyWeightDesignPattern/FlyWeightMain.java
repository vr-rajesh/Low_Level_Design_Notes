package FLyWeightDesignPattern;

public class FlyWeightMain {
    public static void main(String[] args) {
        StudentFactory student = new StudentFactory();

        Student student1 = student.getStudentDetails("Rajesh","101",10);

        addSubjectsMarks(student1,"Maths",80);
        student1.showStudentReport();
    }
    private static void addSubjectsMarks(Student student, String subject, int marks){
        System.out.println(subject + " Marks: " + marks);
    }
}
/*The Flyweight design pattern is a structural design pattern which is used to reduce the memory and resources usage

In Flyweight Design Pattern we have two types of attributes
        1. Intrinsic
        2. Extrinsic

In Intrinsic it means most common used attributes which are common across all attributes
IN Extrinsic it means which are unique attributes

With the help of flyweight design pattern we minimize the storage required for common attributes by creating a
separate object fot the same and reusing it across multiple objects*/


