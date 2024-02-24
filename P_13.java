/*Create a class called “Perdon” with the following attributes:
    Name (string)
     Age(int)
 Address (string)
 The class should have a constructor that accepts all
three attributes and initializes them appropriately. It
should also have getter and setter methods for each
attribute, and a method called “introduce” that
prints out the person’s name, age and address in a
formatted string. */

import java.util.Scanner;

class Person3{
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
        System.out.printf("Hi, my name is %s. I am %d years old and I live at %s.\n", name, age, adres);
    }
}
public class P_13 {
        public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");

        Person3 p3 = new Person3();
        p3.getter();
        p3.introduce();

    }
}

/*
Output::
220130318033
Purohit Akruti K.
Enter your name:
Akruti Purohit
Enter your address:
Joshipara Junagadh
Enter your age:
17
Hi, my name is Akruti Purohit. I am 17 years old and I live at Joshipara Junagadh.
 */
