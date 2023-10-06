package FLyWeightDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class StudentFactory {


    private Map<String, Student> studentMap = new HashMap<String, Student>();

    public Student getStudentDetails(String name, String studentId, int grade){
        if(!studentMap.containsKey(studentId)){
            studentMap.put(studentId, new ConcreateStudent(name, studentId, grade));
        }
        return studentMap.get(studentId);
    }
}
