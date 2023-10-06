package FLyWeightDesignPattern;

public class ConcreateStudent implements Student{
    private String name;
    private String studentId;
    private int grade;

    public ConcreateStudent(String name, String studentId, int grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    public ConcreateStudent() {

    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId() {
        this.studentId = studentId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade() {
        this.grade = grade;
    }

    @Override
    public void showStudentReport() {
        System.out.println("Name : "+name+"|| Student ID : " +studentId+ "|| Grade : "+grade);
    }
}
