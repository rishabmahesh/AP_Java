import java.util.*;
//hello
class BinarySearch
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
            a[i] = obj.nextInt();
        }
        
        System.out.println("Enter search element:");
        int s = obj.nextInt();
        System.out.print("Found? " + bsearch(a,0,n-1,s));
    }
    
    public static int bsearch(int a[], int low, int high,int key)
    {
        int mid = (low + high) / 2;

        if(low>high)
            return -1;
        
        if(a[mid]==key)
            return 1;

        else if(a[mid]>key)
            return bsearch(a,mid+1,high,key);

        else
            return bsearch(a,low,mid-1,key);
    }
}