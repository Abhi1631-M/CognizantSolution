package Checkpoint1;

import java.util.Scanner;

public class ArrayAggregate {
    public static String sumOfArray(String data)
    {
        String[] p=data.split(":");
        if(p.length<1)
        {
            return ("Provide a valid Integer");
        }
        try {
            int as=Integer.parseInt(p[0]);
            if(as<0)
            {
                throw new NegativeArraySizeException("Provide a positive Integer to allocate memory for the array");
            }
            int [] a=new int[as];
            int sum=0;
            if(p.length-1!=as)
            {
                throw new ArrayIndexOutOfBoundsException("Error:Array index is out of range");
            }
            for(int i=1;i<=as;i++)
            {
                a[i-1]=Integer.parseInt(p[i]);
                sum+=a[i-1];
            }
            return "Sum of the array elements is "+sum;
        }
        catch (NumberFormatException e)
        {
            throw new NumberFormatException("Provide a valid Integer");
        }
        catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e)
        {
            throw e;
        }

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data");
        String sp=sc.nextLine();
        try {
            String r=sumOfArray(sp);
            System.out.println(r);
        }
        catch (NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }
        catch (NegativeArraySizeException e)
        {
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
