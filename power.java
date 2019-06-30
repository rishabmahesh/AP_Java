import java.util.*;

class power
{
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        System.out.print("Enter number:");
        int x=obj.nextInt();
        System.out.print(pow(x,n));
    }
    
    static int pow(int x,int n)
    {
        if(x==0)
        return 0;
        
        else if(n==0)
        return 1;
        
        else
        return x*pow(x,n-1);
    }
}