import java.util.ArrayList;
import java.util.Scanner;
public class LastItem {
    public static void main(String[] args) {
        ArrayList<String> last = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while(true) {
            System.out.print("Write something: ");
            input = scanner.nextLine();

            if(input.equals("")) {
                break;
            }

            last.add(input);
        }

        if(last.isEmpty()) {
            System.out.println("No items entered.");
        } else {
            String lastItem = last.get(last.size() - 1);
            System.out.println("The last item in the list is: " + lastItem);
        }
    }
}
