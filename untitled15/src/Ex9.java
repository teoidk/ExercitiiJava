import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex9 {
    //Using the Student class, create a method that sorts a List<Student> by name in
    // alphabetical order. You can either use the Comparable interface or a Comparator to achieve this.

    public static void sortListByName(List<Student> studentList) {
        studentList.sort((s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()));
    }

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        
        studentList.add(new Student("Maria", 20,"A"));
        studentList.add(new Student("Andra", 23, "B"));
        studentList.add(new Student("Andrei", 25, "C"));
        studentList.add(new Student("Marius", 24, "D"));

        sortListByName(studentList);
        System.out.println(studentList);
    }
}
