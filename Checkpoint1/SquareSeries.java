package Checkpoint1;

import java.util.Scanner;

public class SquareSeries {
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number\n");
        int a=sc.nextInt();
        int c=a+10;
        System.out.println("Required Square Increment Sequence");
        while(a!=c+1)
        {
            int ans=a*a+1;
            System.out.printf(ans+" ");
            a++;
        }
        sc.close();
    }
}

