package Checkpoint1.FitnessTracker;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter user name:");
        String name=sc.nextLine();
        System.out.println("Enter weight in kg: ");
        double weight=sc.nextDouble();
        System.out.println("Enter number of steps taken: ");
        int step=sc.nextInt();
        System.out.println("Enter distance covered is km: ");
        double distance=sc.nextDouble();
        System.out.println("Is the user running?(true/false): ");
        boolean running =sc.nextBoolean();
        UserFitnessData user=new UserFitnessData(name,weight,step,distance,running);
        System.out.println("User Name: "+user.getUserName());
        System.out.println("Weight: "+user.getWeight()+" kg");
        System.out.println("Step Taken: "+user.getStepsTaken());
        System.out.println("Distance Covered: "+user.getDistanceCovered()+" km");
        System.out.println("Running: "+user.getRunningStatus());
        System.out.println("Fitness Level: "+user.findFitnessLevel());
        double cb=FitnessMonitor.calculateCaloriesBurnt(user.getWeight(),user.getDistanceCovered(),user.getRunningStatus());
        System.out.printf("Calories Burnt: %.2f\n",cb);



    }
}
