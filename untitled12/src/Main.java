//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        average(1,2,3);
        average(1,2,0);

        Object myObj = getObject(2);

        if(myObj != null) {
            System.out.println(myObj.toString());
        } else {
            System.out.println("The obj is null");
        }

        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        int c = sum(a,b);
        System.out.println(c);


    }
}