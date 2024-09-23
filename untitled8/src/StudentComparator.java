import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    //0 = equal
    //1 = mai mare
    //-1 = mai mic
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getGrade() == o2.getGrade()) {
            return 0;
        } else if(o1.getGrade() > o2.getGrade()) {
            return 1;
        } else {
            return -1;
        }
    }
}
