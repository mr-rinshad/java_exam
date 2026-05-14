import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();

        // Find length
        int length = s1.length();

        // Convert to uppercase
        String upper = s1.toUpperCase();

        // Convert to lowercase
        String lower = s1.toLowerCase();

        // Reverse the string
        String reverse = new StringBuilder(s1).reverse().toString();

        // Check palindrome
        if (s1.equalsIgnoreCase(reverse)) {
            System.out.println("\nThe string is a palindrome.");
        } else {
            System.out.println("\nThe string is not a palindrome.");
        }

        // Display results
        System.out.println("\n----- STRING OPERATIONS -----");

        System.out.println("Original String : " + s1);
        System.out.println("Length          : " + length);
        System.out.println("Uppercase       : " + upper);
        System.out.println("Lowercase       : " + lower);
        System.out.println("Reversed String : " + reverse);

        sc.close();
    }
}
