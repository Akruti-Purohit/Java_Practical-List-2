/*Write a Java Program that demonstrates the use of
overloaded constructor. 
volume:
    cuboid = lbh
    cube = a*a*a
    cylinder = pi*r*r*h
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
    public P3(double r,double h){
        double ans = pi * r * r * h; 
        System.out.println("The volume of cylinder is:"+ans);
    }
    public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");

        Scanner sc = new Scanner(System.in);
        double l,b,h,r;
        
        System.out.print("Enter the value of l:");
        l = sc.nextDouble();

        System.out.print("Enter the value of b:");
        b = sc.nextDouble();

        System.out.print("Enter the value of h:");
        h = sc.nextDouble();

        System.out.print("Enter the value of r:");
        r = sc.nextDouble();

        P3 o1 = new P3(l,b,h);
        P3 o2 = new P3(l);
        P3 o3 = new P3(r,h);

        System.out.println(o1+" "+o2+" "+o3);

        sc.close();
    }
}