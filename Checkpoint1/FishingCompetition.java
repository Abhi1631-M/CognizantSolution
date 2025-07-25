package Checkpoint1;

import java.util.Scanner;

public class FishingCompetition {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details");
        String si=sc.nextLine();
        String [] a=si.split(":");
        int age=Integer.parseInt(a[1]);
        int b=Integer.parseInt(a[2]);
        int m=Integer.parseInt(a[3]);
        int s=Integer.parseInt(a[4]);
        if(age>=18)
        {
            int ans=((b*10)+(m*6)+(s*3));
            if(b<0)
            {
                System.out.println(b+" is an invalid input");
            }else   if(m<0)
            {
                System.out.println(m+" is an invalid input");
            }
            else   if(s<0)
            {
                System.out.println(s+" is an invalid input");
            }
            else   if(ans<0)
            {
                System.out.println(ans+" is an invalid input");
            }else {
                System.out.println(a[0]+" scored "+ans+" points");
            }

        }
        else{
            System.out.println(age+ " is an invalid age");
        }

    }
}
