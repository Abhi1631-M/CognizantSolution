package Checkpoint1.AltaMotors;

import java.util.HashSet;

public class DepartmentGrouping {
    private HashSet<String> employeeSet=new HashSet<>();
    private HashSet<String> getEmployeeSet()
    {
        return employeeSet;
    }

    public void setEmployeeSet(HashSet<String> employeeSet) {
        this.employeeSet = employeeSet;
    }
    public void addEmployeeId(String det)
    {
         String[] part=det.split(":");
         if(part.length!=2)
         {
             return;
         }
         String empId=part[0];
         if(empId.matches("[PQMS][0-9]{3}"))
         {
             employeeSet.add(empId);
         }

    }
    public HashSet<String> findDepartmentNameWithEmployeeId()
    {
        HashSet<String> deptDet=new HashSet<>();
        for(String id:employeeSet)
        {
            String dept="";
            char first=id.charAt(0);
            switch(first)
            {
                case 'P':
                    dept="Product";
                    break;
                case 'Q':
                    dept="Quality Control";
                    break;
                case 'M':
                    dept="Maintenance";
                    break;
                case 'S':
                    dept="Sales";
                    break;
            }
            deptDet.add(id+":"+dept);
        }
        return deptDet;
    }
}
