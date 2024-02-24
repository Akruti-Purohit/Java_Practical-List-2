//Write a Java program using copy constructor.

import java.util.Scanner;

class Example{
    String name;
    int age;

    Example(String name,int age)
    {
        this.name = name;
        this.age = age;

        System.out.println("Your name is:"+this.name);
        System.out.println("Your name is:"+this.age);
    }
    Example(Example e)
    {
        System.out.println("Your name is:"+e.name);
        System.out.println("Your name is:"+e.age);
    }
}
public class P9 {

        public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        Example e1 = new Example(name, age);
        Example e2 = new Example(e1);

        sc.close();
    }
}
