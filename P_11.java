/*Create an object of the Person class and use the getter and
setter methods to set the person’s attributes. Call the
introduce method to print out the person’s introduction
message. */

import java.util.Scanner;

class Person2{
    String name;
    int age;
    String adres;

    void getter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your address:");
        adres = sc.nextLine();
        System.out.println("Enter your age:");
        age = sc.nextInt();

        sc.close();
    }

    void introduce(){
        System.out.println("Your name is:"+name);
        System.out.println("Your age is:"+age);
        System.out.println("Your address is:"+adres);
    }
}
public class P_11 {
        public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");

        Person2 p2 = new Person2();
        p2.getter();
        p2.introduce();

    }
}
