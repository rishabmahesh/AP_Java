import java.util.*;

class oddevensum
{
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        if(n%2==0)
        {
            System.out.println("\nEven sum:" + sumeven(n));
            int m=n-1;
            System.out.println("\nodd sum:" + sumodd(m));
            return;
          }
        if(n%2==1) 
        {
                System.out.println("\n odd sum:" + sumodd(n));
                    n= n-1;
                 System.out.println("\neven sum:" + sumeven(n));
             
         }
        
    }
    
    public static int sumodd(int n)
    {
        if(n<=1)
        return 1;
        
        else
        {
            return n + sumodd(n-2);
        }
    }
    
    public static int sumeven(int n)
    {
        if(n<=0)
        return 0;
        
        else
        {
            return n + sumeven(n-2);
        }
    }
}