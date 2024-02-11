/*Write a program in Java of method overloading. 
 Area:
    Rectangle = l * b;
    Square = l * l;
*/

import java.util.Scanner;
public class P7 {
    public double area(double l,double b)
    {
        return l*b;
    }

    public double area(double l)
    {
        return l*l;
    }
    public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");

        Scanner sc = new Scanner(System.in);
        double l,b;

        System.out.println("Enter the length:");
        l = sc.nextDouble();

        System.out.println("Enter the breath:");
        b = sc.nextDouble();

        P7 o = new P7();
        double ans1 = o.area(l, b);
        double ans2 = o.area(l);

        System.out.println("The area of rectangle is:"+ans1);
        System.out.println("The area of square is:"+ans2);
        sc.close();
    }
}
