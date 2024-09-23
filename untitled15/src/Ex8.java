import java.util.ArrayList;
import java.util.List;

public class Ex8 {

    //Create a class Student with the following attributes:
    //
    //String name
    //int age
    //String studentId
    //Create a List<Student> and add several Student objects to the list. Write a method that takes a
    // List<Student> and a String studentId as parameters, and returns the Student object with the matching
    // studentId, or null if no match is found.

    public static Student getStudent(List<Student> studentList, String studentId) {
       for(Student student : studentList) {
           if (student.getStudentId().equals(studentId)) {
               return student;
           }
       }
               return null;

    }

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Maria", 20,"A"));
        studentList.add(new Student("Andra", 23, "B"));
        studentList.add(new Student("Andrei", 25, "C"));
        studentList.add(new Student("Marius", 24, "D"));

        String studentId = "C";
        Student student = getStudent(studentList, studentId);
    }
}
