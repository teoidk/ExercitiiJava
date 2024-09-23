
public class Main {

    public static <T extends Number> void addNumber(List<? super T> list, T number) {
        list.add(number);
    }

        public static void main (String[]args){


