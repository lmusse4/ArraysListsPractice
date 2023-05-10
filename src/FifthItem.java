import java.util.ArrayList;
import java.util.Scanner;
public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<String>();
        String input = "";

        while (true) {
            System.out.print("write something: ");
            input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            strings.add(input);
        }

        if (strings.size() >= 5) {
            System.out.println("The fifth item in the list is: " + strings.get(4));
        } else {
            System.out.println("You did not enter at least 5 strings.");
        }
    }
}
