package Checkpoint1.CollegeNameList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private List<String> studentList=new ArrayList<String>();
    public List<String> getStudentList()
    {
        return  studentList;
    }
    public void setStudentList(List<String> studentList)
    {
        this.studentList=studentList;
    }
    public void addStudentToList(String student)
    {
        this.studentList.add(student);
    }
    public void sortStudentList()
    {
        Collections.sort(studentList);
    }
    public void removeStudentFromList(String student)
    {
        this.studentList.remove(student);
    }
}
