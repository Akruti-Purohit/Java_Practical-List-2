/*Write a program in Java to demonstrate use of ‘this’
keyword. */

import java.util.Scanner;
public class P5 {
    private String name;
    private int age;

    public void info(String name,int age){
        this.name = name;
        this.age = age;

        System.out.println("Your name is:"+this.name);
        System.out.println("Your age is:"+this.age);
    }
    public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String n = sc.nextLine();
        System.out.print("Enter your age:");
        int a = sc.nextInt();

        P5 o = new P5();
        o.info(n,a);

        sc.close();
    }
}
