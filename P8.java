/*Design a class to represent account, include the following
members. Data member: Name of depositor, Account
number, Type of account, banlanceMethod:
i) To assign intial values (using constructor).
ii) To deposit an amount after checking balance
and minimum balance is 1000 Rp.
iii) To Display name and balance. */

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
    System.out.println("220130318033");
    System.out.println("Purohit Akruti K.");

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your name:");
    String name = sc.next();

    System.out.print("Enter your account number:");
    long accnum = sc.nextLong();
    
    System.out.print("Enter your account type:");
    String acctyp = sc.next();

    System.out.print("Enter your existing balance:");
    int ebal = sc.nextInt();

    System.out.print("Enter the amount you want to deposit in your account:");
    int damt = sc.nextInt();
    
    Acc o1 = new Acc(name,accnum,acctyp,ebal);
    o1.deposit(damt);
    o1.display(o1);
    sc.close();
    }
}

class Acc{
    private String name;
    private long accnum;
    private String acctyp;
    private int balance;

    public Acc(String name,long accnum,String acctyp,int balance){
        this.name = name;
        this.accnum = accnum;
        this.acctyp = acctyp;
        this.balance = balance;
    }

    public void deposit(int rs)
    {
        if(balance >= 1000)
        {
            balance += rs;
        }
        else{
            System.out.println("Your account is not active!!!");
        }
    }

    public void display(Acc o)
    {
        System.out.println("Your name is:"+o.name);
        if(balance >= 1000)
        {
            System.out.println("Your bank balance is:"+o.balance);
        }
        else{
            System.out.println("Your account is not active!!!");
        }
    }
}

/*
Output::
220130318033
Purohit Akruti K.
Enter your name:Akruti
Enter your account number:220130318033
Enter your account type:saving
Enter your existing balance:25000
Enter the amount you want to deposit in your account:97000
Your name is:Akruti
Your bank balance is:122000
 */
