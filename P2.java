/*Write a Java Program that demonstrates the use of static
method. */

import java.util.Scanner;
public class P2 {
    public static int sum(int a,int b)
    {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int ans = P2.sum(n1,n2);
        System.out.println("The sum of n1 and n2 is:"+ans);
        sc.close();

    }
}
