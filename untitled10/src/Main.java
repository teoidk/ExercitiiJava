import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
//Create DayOfWeek enum, ask the user to provide a day as String,
// convert it to Enum and display: "is week day" if monday to friday, otherwise
// "is weekend"
public enum DayofWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a day of the week: ");
            String input = scanner.nextLine().toUpperCase();

            DayofWeek day = DayofWeek.valueOf(input);
            
                if (isWeekday(dayOfWeek)) {
                    System.out.println(dayOfWeek + " is a week day.");
                } else {
                    System.out.println(dayOfWeek + " is a weekend.");
                }

    }
}

