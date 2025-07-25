package Checkpoint1;

import java.util.Scanner;

class WaterTank{
    private double r;
    private double h;
    public WaterTank(double r, double h)
    {
        this.r=r;
        this.h=h;
    }
    public double calculateCapacity()
    {
        return 3.14*r*r*h;
    }
    public double alarmCapacity()
    {
        return 0.75*calculateCapacity();
    }
}

public class WaterTankCapacity {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r, h;
        System.out.print("Enter the radius\n");
        r=sc.nextInt();
        System.out.print("Enter the height\n");
        h=sc.nextInt();
        if(r<=0||h<=0)
        {
            System.out.println("Invalid measurement");
        }
        else{
            WaterTank w=new WaterTank(r,h);
            double capacity=w.calculateCapacity();
            double alarm= w.alarmCapacity();
            System.out.printf("Total capacity is %.2f litres\n",capacity);
            System.out.printf("Capacity for alarm is %.2f liters\n",alarm);
        }
    }

}
