import java.util.*;

class LineEditor
{
    private String myLine;
    
    public void insert(String str, int index)
    {
        String a = myLine.substring(0,index);
        String b = myLine.substring(index);
        myLine = a + str + b;
        System.out.println(myLine);
    }
    
    public void delete(String str)
    {
        String x = myLine.replaceFirst(str,"");
        myLine = x;
        System.out.println(myLine);
    }
    
    public void deleteAll(String str)
    {
        String x = myLine.replaceAll(str,"");
        myLine=x;
        System.out.println(myLine);
    }
    
    LineEditor()
    {
        myLine = "Computer Science Computer Science";
    }
}