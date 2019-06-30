import java.util.*;

class reverse
{
    public void printString(String s)
    {
        if(s.length()>0)
        {
            if(s.length() ==1)
            System.out.println(s.substring(1));
            printString(s.substring(1));
            System.out.print(s.substring(0,1));
        }
    }
}