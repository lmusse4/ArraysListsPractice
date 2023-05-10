import java.util.Scanner;
import java.util.ArrayList;
public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Write an integer: ");
        int input;

        while (true) {
            input = scanner.nextInt();

            if (input == 0) {
                break;
            }

            numbers.add(input);
        }

        int sum = getSum(numbers);

        System.out.print("The numbers you entered are: ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));

            if (i < numbers.size() - 1) {
                System.out.print(", ");

            }
        }

        System.out.println();

        System.out.println("The sum of that list is: " + sum);
    }

    public static int getSum(ArrayList<Integer> numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;

    }
}
