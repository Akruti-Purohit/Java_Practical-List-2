/*Create a class named “Person” with the following attributes:
     Name (string)
    Age(int)
    Address (string)
The class should have following methods:
    A constructor that initializes the name, age, and address attributes.
    Getter and setter methods for each attribute.
    A method named “introduce” that prints out a message introducing the person by name, age, and address. */

import java.util.Scanner;

class Person{
    String name;
    int age;
    String adres;

    Person(String name,int age,String adres){
        this.name = name;
        this.age = age;
        this.adres = adres;
    }

    void introduce(){
        System.out.println("Your name is:"+name);
        System.out.println("Your age is"+age);
        System.out.println("Your address is:"+adres);
    }
}
public class P_10 {
        public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");

        Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name:");
            String name = sc.nextLine();
            System.out.println("Enter your address:");
            String adres = sc.nextLine();
            System.out.println("Enter your age:");
            int age = sc.nextInt();

            Person p1 = new Person(name, age, adres);
            p1.introduce();
        sc.close();
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
Your name is:Akruti Purohit
Your age is17
Your address is:Joshipara Junagadh
 */
