import java.util.*;

class SeatingChart
{
    private Student[][] seats;
     SeatingChart(ArrayList<Student> studentList,int rows, int cols)
    {
        int k=0;
        seats = new Student[rows][cols];
        for(int j=0;j<cols;j++)
        {
            for(int i=0;i<rows;i++)
            {
                if(k<studentList.size())
                seats[i][j]=studentList.get(k++);
            }
        }
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(seats[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
    
    void removeAbsentStudents(int n)
    {
        for(int i=0;i<seats.length;i++)
        {
            for(int j=0;j<seats[i].length;j++)
            {
                if(seats[i][j]!=null)
                {
                    if(seats[i][j].getAbsentCount()>n)
                    seats[i][j]=null;
                }
            }
        }
        
        
        for(int i=0;i<seats.length;i++)
        {
            for(int j=0;j<seats[i].length;j++)
            {
                System.out.print(seats[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}
