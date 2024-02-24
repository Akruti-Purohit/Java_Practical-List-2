/*Write a Java Program to calculate area of circle using
constructor. */

import java.util.Scanner;
public class P4 {

    public static final double pi = 3.14;

    public P4(double r)
    {
        double ans = pi * r * r;
        System.out.println("The area of circle is:"+ans); 
    }
    public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius:");
        double r = sc.nextDouble();

        P4 o = new P4(r);
        System.out.println(o);
        sc.close();
    }
    
}
/*
 Output::
Purohit Akruti K.
Enter the radius:4.6
The area of circle is:66.44239999999999
 */
