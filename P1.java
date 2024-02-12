import java.util.Scanner;
public class P1 {
    public P1(String s)
    {
        System.out.println("Hello " + s);
    }
    public static void main(String[] args)
    {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        P1 o = new P1(name);
        System.out.println("The address of o is:"+o);
        sc.close();
    }
}

/* Output 
java -cp /tmp/7tN1xFXiei HelloWorld
220130318033
Purohit Akruti K.
Enter your name:Akruti
Hello Akruti
The address of o is:HelloWorld@48140564
*/

