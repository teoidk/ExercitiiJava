import java.util.ArrayList;
import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        //3. Convert the array String[] fruits = {"apple", "banana", "cherry"}
        // to an ArrayList

        String[] arrayString = {"apple", "banana", "cherry"};

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arrayString));

        System.out.println(arrayList);

        //List<String> arrayString = List.of(arrayString);

        //List<String> list = Arrays.stream(arrayString).toList();

    }
}
