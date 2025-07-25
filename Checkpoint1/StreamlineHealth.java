package Checkpoint1;

import java.util.Scanner;

public class StreamlineHealth {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String s=sc.nextLine();
        System.out.println("Enter your height in meters");
        double h=sc.nextDouble();
        System.out.println("Enter your weight in kilograms");
        double w=sc.nextDouble();
        double BMI=w/(h*h);
        System.out.println("Hello "+s+", Your BMI is "+ String.format("%.2f",BMI));
        if(BMI<18.5)
        {
            System.out.println("You are under the category Under weight");
        }
        else if(BMI>=18.5&&BMI<25)
        {
            System.out.println("You are under the category Normal weight");
        }else if(25<=BMI&&BMI<=30)
        {
            System.out.println("You are under the category Over weight");

        }
        else{
            System.out.println("You are under the category Obese");
        }
    }
}
