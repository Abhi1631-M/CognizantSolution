package Checkpoint1.LegoBuilder;

import java.util.Scanner;

public class UserInterface {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Product Id");
        String pId=sc.nextLine();
        System.out.println("Enter the Product Type");
        String pType=sc.nextLine();
        if(!pType.equals("ElectricalItem")&& !pType.equals("PlumbingItem"))
        {
            System.out.println(pType+" is an invalid product type");
            return;
        }
        else {
            System.out.println("Enter the Product Name");
            String pName = sc.nextLine();
            System.out.println("Enter the Quantity");
            int quan = sc.nextInt();
            System.out.println("Enter the Price");
            double price = sc.nextDouble();
            if(pType.contains("ElectricalItem"))
            {
                ElectricalItemDetails ed=new ElectricalItemDetails(pId,pType,pName,quan,price);
                double bill=ed.calculateTotalBill();
                if(bill==0)
                {
                    System.out.println("Product not Available");
                }else {
                    System.out.println("Bill Amount is "+bill);
                }
            }
            else if(pType.contains("PlumbingItem"))
            {
                PlumbingItemDetails pd=new PlumbingItemDetails(pId,pType, pName, quan,price);
                double bill= pd.calculateTotalBill();
                if(bill==0)
                {
                    System.out.println("Product not Available");
                }else {
                    System.out.println("Bill Amount is "+bill);
                }
            }
        }
    }
}
