package Checkpoint1.BrilliantRestaurant;

import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name");
        String name=sc.nextLine();
        System.out.println("Enter the Order Number");
        int oN=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Delivery Type");
        String dType=sc.nextLine();
        if(!dType.equals("HomeDelivery")&&!dType.equals("Parcel")&&!dType.equals("NormalOrder"))
        {
            System.out.println("Invalid Order Type");
            return;
        }
        System.out.println("Enter the FoodName");
        String fName=sc.nextLine();
        System.out.println("Enter the Phone Number");
        long mNum=sc.nextLong();
        System.out.println("Enter the price of the item");
        double item=sc.nextDouble();
        Restaurant rest=new Restaurant(name,oN,dType,fName,mNum);
       try {
            double bAmount=rest.calculateTotalBill(item);
            System.out.println("Name "+rest.getCustomerName());
           System.out.println("Order Number "+rest.getOrderNumber());
           System.out.println("Delivery Type "+rest.getDeliveryType());
           System.out.println("FoodName "+rest.getFoodName());
           System.out.println("Phone Number "+rest.getPhoneNumber());
           System.out.println("Bill Amount "+bAmount);
        }catch (IllegalArgumentException e)
       {
           System.out.println(e.getMessage());
       }
       finally {
           sc.close();
       }
    }
}
