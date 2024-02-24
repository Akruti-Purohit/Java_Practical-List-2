/*Write a program in Java that pass object as parameter. */

import java.util.Scanner;
public class P6 {
    private int age;
    private String name;

    public void setter(P6 obj)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        obj.age = sc.nextInt();
        System.out.println("Enter your name:");
        obj.name = sc.next();
        sc.close();
    }
    


    public void getter(P6 obj)
    {
        System.out.println("Your age is:"+obj.age);
        System.out.println("Your name is:"+obj.name);
    }
    public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");

        P6 o1 = new P6();
        o1.setter(o1);
        o1.getter(o1);
    }
}
/*
Output::

220130318033
Purohit Akruti K.
Enter your age:
17
Enter your name:
Akruti
Your age is:17
Your name is:Akruti

 */
