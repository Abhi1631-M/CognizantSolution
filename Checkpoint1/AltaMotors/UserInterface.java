package Checkpoint1.AltaMotors;

import java.util.HashSet;
import java.util.Scanner;

public class UserInterface {
    public static void main(String [] name)
    {
        Scanner sc=new Scanner(System.in);

        DepartmentGrouping dg=new DepartmentGrouping();
        System.out.println("Enter the number of details");
        int n=sc.nextInt();
        if(n<=0)
        {
            System.out.println(n+" is an invalid input");
        }else{
            System.out.println("Enter the details");
            for(int i=1;i<=n+1;i++)
            {
                String det=sc.nextLine();
                dg.addEmployeeId(det);
            }
            HashSet<String> res=dg.findDepartmentNameWithEmployeeId();
            if(res.isEmpty())
            {
                System.out.println("All the provided employee ids are invalid");
            }else {
                for(String k:res)
                {
                    System.out.println(k);
                }
            }
        }
    }
}
