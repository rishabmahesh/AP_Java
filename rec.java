import java.util.*;

class rec
{
    public static void f(int a,int b)
    {
        if(a/b != 0)
            f(a/b,b);
        System.out.print(a%b);
        
    }
}