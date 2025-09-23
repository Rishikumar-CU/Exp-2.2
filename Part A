import java.util.ArrayList;
import java.util.Scanner;

public class SumOfIntegersAutoboxing {

    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Collection to store Integer objects (autoboxing will happen here)
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers separated by spaces:");
        String inputLine = scanner.nextLine();

        // Split the input into individual string numbers
        String[] stringNumbers = inputLine.split("\\s+");

        // Parse each string to int, autobox into Integer, and store in ArrayList
        for (String strNum : stringNumbers) {
            int primitiveValue = Integer.parseInt(strNum); // String → int
            numbers.add(primitiveValue); // int → Integer (autoboxing)
        }

        // Calculate sum using enhanced for-loop (unboxing happens here)
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Integer → int (unboxing)
        }

        // Display the result
        System.out.println("Sum of integers: " + sum);

        scanner.close();
    }
}
