/*Create a class named “Calculator” with the following
methods:
    Add (int a, int b) – return the sum of a and b
    Subtract (int a, int b) – return the difference of a and b
    multiply (int a, int b) – return the product of a and b
    divide (int a, int b) – return the quotient of a devide by b */

import java.util.Scanner;

class Calculator{
    int a;
    int b;

    int Add (int a, int b){
        return a+b;
    }
    int Subtract (int a, int b){
        return a-b;
    }
    int Multiply (int a, int b){
        return a*b;
    }
    double Divide (int a, int b){
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return (double)a/b;
    }

}
public class P_12 {
        public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = sc.nextInt();

        System.out.println("Enter a number:");
        int b = sc.nextInt();


        Calculator cal = new Calculator();
        System.out.println("Addition: " + cal.Add(a,b));
        System.out.println("Subtraction: " + cal.Subtract(a,b));
        System.out.println("Multiplication: " + cal.Multiply(a,b));
        System.out.println("Division: " + cal.Divide(a,b));

        sc.close();
    }
}
