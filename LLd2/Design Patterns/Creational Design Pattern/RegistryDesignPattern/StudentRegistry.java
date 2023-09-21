package RegistryDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private final Map<String, Student> studentMap = new HashMap<String, Student>();

    public void registerStudent(String studentId, Student student){
        studentMap.put(studentId,student);
    }
    public Student getRegisteredStudent(String studentId){
        if(!studentMap.containsKey(studentId)){
            System.out.println("Student Not Found");
            return  null;
        }
        return studentMap.get(studentId);
    }
}
