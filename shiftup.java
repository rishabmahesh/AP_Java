import java.util.*;

class shiftup
{
    void main()
    {
        System.out.println("Enter values of matrix:");
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter m:");
        int m=obj.nextInt();
        System.out.println("Enter n:");
        int n=obj.nextInt();
        
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
    
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
        
        System.out.println("Displaying matrix A");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==(n-1))
                b[m-1][j]=a[0][j];
                //System.out.print(b[m-1][j]);}
                else
                b[i][j]=a[i+1][j];
                
            }
        }
        
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
        
        
    }
}