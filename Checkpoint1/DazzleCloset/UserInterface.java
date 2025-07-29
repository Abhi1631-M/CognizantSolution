package Checkpoint1.DazzleCloset;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dress code");
        String dc=sc.nextLine();
        System.out.println("Enter dress style");
        String ds=sc.nextLine();
        System.out.println("Enter dress material");
        String dm=sc.nextLine();
        System.out.println("Enter dress price");
        double price=sc.nextDouble();
        while (true)
        {
            System.out.println("Prefered size is XL(Yes/No)");
            String ans=sc.next();
            if (ans.equalsIgnoreCase("Yes"))
            {
                Order ob=new Order(dc,ds,dm,price);
                System.out.println("Dress code :"+dc);
                System.out.println("Dress Style :"+ds);
                System.out.println("Material Type :"+dm);
                System.out.println("Dress Size :XL");
                System.out.println("Price :"+price);
                break;
            } else if (ans.equalsIgnoreCase("No")) {
                    System.out.println("Enter the dress size");
                    String size=sc.next();
                    if(size.equalsIgnoreCase("XXL")||size.equalsIgnoreCase("XXXL")||size.equalsIgnoreCase("XXXXL"))
                    {
                        price+=100;
                    }
                    Order ob=new Order(dc,ds, dm, size, price);


                System.out.println("Dress code :"+dc);
                System.out.println("Dress Style :"+ds);
                System.out.println("Material Type :"+dm);
                System.out.println("Dress Size :"+size);
                System.out.println("Price :"+price);
                break;
            }
            else {
                System.out.println("Wrong Input");
            }
        }


    }
}
