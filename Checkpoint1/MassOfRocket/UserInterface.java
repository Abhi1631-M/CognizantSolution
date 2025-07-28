package Checkpoint1.MassOfRocket;

import java.util.Scanner;

public class UserInterface {
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       double acc=9.8;
       System.out.println("Enter the component name");
       String cName=sc.nextLine();
       System.out.println("Enter the component weight on earth");
       double cWeight=sc.nextDouble();
       sc.nextLine();
       if(cWeight<=0)
       {
           System.out.println(cWeight+" Newton is an invalid weight");
       }
       else {
           System.out.println("Enter the material used");
           String mName = sc.nextLine();
           System.out.println("Enter the cost of production");
           double cProduct=sc.nextDouble();

           RocketComponent ob=new RocketComponent(cName,cWeight,mName,cProduct);
           double mass= ob.calculateMassOfRocketComponent(cWeight);
           System.out.println("Rocket Component");
           System.out.println("Name : "+ob.getName());
           System.out.println("Weight : "+ob.getWeight()+" Newton");
           System.out.println("Acceleration Due To Gravity : "+acc+" meters per second square");
           System.out.println("Mass : "+mass+" kg");
           System.out.println("material Used : "+ob.getMaterial() );
           System.out.println("Cost of Production :Rs. "+ob.getCostOfProduction());
       }

   }


}
