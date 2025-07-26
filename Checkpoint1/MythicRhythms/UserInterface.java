package Checkpoint1.MythicRhythms;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Customer Details");
        String cusDetails=sc.nextLine();
        String[] cd=cusDetails.split(":");
        int cId=Integer.parseInt(cd[0]);
        String cName=cd[1];
        long cNum=Long.parseLong(cd[2]);
        Customer customer=new Customer(cId,cName,cNum);
        System.out.println("Enter the musical Instrumental Details");
        String musDetails=sc.nextLine();
        String[] mus=musDetails.split(":");
        int iId=Integer.parseInt(mus[0]);
        String iName=mus[1];
        String iType=mus[2];
        double iPrice=Double.parseDouble(mus[3]);
        int nString=Integer.parseInt(mus[4]);
        String iMaterial=mus[5];
        StringInstrument si=new StringInstrument(iId,iName,iType,iPrice,customer,nString,iMaterial);
        double tBill=si.calculateTotalBill();
        if(tBill==-1)
        {
            System.out.println("Invalid Input");
        }
        else{
            if(iPrice>20000)
            {
                System.out.println("You have a discount! and your Total Bill is "+tBill);
            }else{
                System.out.println("Total Bill is "+tBill);
            }
        }
    }

}
