/*Write a Java Program that demonstrates the use of
overloaded constructor. 
volume:
    cuboid = lbh
    cube = a*a*a
*/

import java.util.Scanner;
public class P3 {
    public static final double pi = 3.14;
    public P3(double l,double b, double h){
        double ans = l*b*h;
        System.out.println("The volume of cuboid is:" + ans);
    }

    public P3(double l){
        double ans = l*l*l;
        System.out.println("The volume of cube is:"+ans);
    }
    public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");

        Scanner sc = new Scanner(System.in);
        double l,b,h;
        
        System.out.print("Enter the value of l:");
        l = sc.nextDouble();

        System.out.print("Enter the value of b:");
        b = sc.nextDouble();

        System.out.print("Enter the value of h:");
        h = sc.nextDouble();

        P3 o1 = new P3(l,b,h);
        P3 o2 = new P3(l);

        System.out.println(o1+" "+o2);

        sc.close();
    }
}

/* java -cp /tmp/XS03kx6X7z P3
220130318033
Purohit Akruti K.Enter the value of l:4
Enter the value of b:5.5
Enter the value of h:6.23
Enter the value of r:7.3
The volume of cuboid is:137.06
The volume of cube is:64.0
P3@3cda1055 P3@7a5d012c P3@3fb6a447
*/