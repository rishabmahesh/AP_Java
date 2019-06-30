import java.util.*;

class linearsearch
{
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = obj.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array:");
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.print("Search element:");
        int s=obj.nextInt();
        System.out.println("Found? "+ lsearch(a,n-1,s));
        
    }
    
    static int lsearch(int a[],int n,int s)
    {
        if(a[n]==s)
        return 1;
        else if(n<=0)
        return -1;
        else
        return lsearch(a,n-1,s);
    }
}