import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a list of integers separated by spaces (e.g., 10 20 30 40):");

        String inputLine = scanner.nextLine();

        String[] numberStrings = inputLine.split("\\s+");

        List<Integer> integerList = new ArrayList<>();

        System.out.println("\n--- Processing Inputs ---");

        for (String numStr : numberStrings) {
            try {
                int primitiveInt = Integer.parseInt(numStr);
                System.out.println("Parsed string \"" + numStr + "\" to primitive int: " + primitiveInt);

                integerList.add(primitiveInt);
                System.out.println("Autoboxed " + primitiveInt + " to an Integer object and added to the list.");

            } catch (NumberFormatException e) {
                System.out.println("Skipping invalid input: \"" + numStr + "\" is not a valid integer.");
            }
        }

        int totalSum = calculateSum(integerList);

        System.out.println("\n--- Calculation Result ---");
        System.out.println("Integers stored in the list: " + integerList);
        System.out.println("The final sum is: " + totalSum);

        scanner.close();
    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;

        System.out.println("\n--- Calculating Sum ---");

        for (Integer numberObject : numbers) {
            sum += numberObject;
            System.out.println("Unboxed " + numberObject + " to a primitive int and added to sum. Current sum: " + sum);
        }
        return sum;
    }
}


