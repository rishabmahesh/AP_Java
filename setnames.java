import java.util.*;

class setnames
{
    public void main()
    {
        
         ArrayList<Student> roster = new ArrayList<Student>();
         Student s = new Student("Karen",3);
         roster.add(s);
         roster.add(new Student("Liz",1));
         roster.add(new Student("Paul",4));
         roster.add(new Student("Lester",1));
         roster.add(new Student("Henry",5));
         roster.add(new Student("Renee",9));
         roster.add(new Student("Glen",2));
         roster.add(new Student("Fran",6));
         roster.add(new Student("David",1));
         roster.add(new Student("Danny",3));
         
         Scanner obj = new Scanner(System.in);
         System.out.print("Enter rows:");
         int rows=obj.nextInt();
         
         System.out.print("Enter columns:");
         int cols=obj.nextInt();
         
         SeatingChart sc = new SeatingChart(roster,rows,cols);
         
         System.out.print("Enter minimum days:");
         int n=obj.nextInt();
         
         sc.removeAbsentStudents(n);
         
         
         
         
         
    
    
    
    
    
    
        }
}
