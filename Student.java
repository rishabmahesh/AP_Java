import java.util.*;

class Student
{
    String name;
    int absent;
    
    Student(String name,int absent)
    {
        this.name=name;
        this.absent=absent;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAbsentCount()
    {
        return absent;
    }
    
    public String toString()
    {
        return name+"\t"+absent;
    }
}