import java.util.ArrayList;
import java.util.List;

public class Ex2 {

    public static boolean verifyElement(List<String> list, String element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        //2. Given a List<String> containing ["cat", "dog", "bird"], write a
        // method to check if the list contains the element "dog" and print a
        // message indicating whether it is present or not.

        List<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("bird");

        String element = "dog";

        boolean verify = verifyElement(list, element);

        if(verify) {
            System.out.println("The element is present");
        } else {
            System.out.println("The element is not present");
        }

    }
}
