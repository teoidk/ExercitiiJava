import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(20, "John", 9);
        Student student2 = new Student(18, "Danny", 8);
        Student student3 = new Student(20, "John", 10);

        if (student1.equals(student2)) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        System.out.println(studentSet);

        Comparator<Student> comparator = new StudentComparator();
        Set<Student> studentTreeSet = new TreeSet<>(comparator);
        studentTreeSet.add(student1);
        studentTreeSet.add(student2);
        studentTreeSet.add(student3);
        System.out.println(studentTreeSet);

    }
}