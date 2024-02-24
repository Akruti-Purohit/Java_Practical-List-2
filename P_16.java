/*Get user input using the Scanner class to ask for the user’s
name, age and favorite color. Use String.format() to print
out a message that includes those values in a formatted
string. */

import java.util.Scanner;

public class P_16 {
    public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");

        Scanner sc = new Scanner(System.in);

        // Get user input for name, age, and favorite color
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("Enter your favorite color: ");
        String color = sc.nextLine();

        // Use String.format() to print out a message with the user's input
        String message = String.format("Hello, my name is %s. I am %d years old and my favorite color is %s.", name,
                age, color);
        System.out.println(message);
        sc.close();
    }
}

/*
Output::
220130318033
Purohit Akruti K.
Enter your name: Akruti
Enter your age: 17
Enter your favorite color: Red
Hello, my name is Akruti. I am 17 years old and my favorite color is Red.
 */
