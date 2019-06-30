import java.util.*;

class shiftdown
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
        
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==(m-1))
                b[0][j]=a[i][j];
                else
                b[i+1][j]=a[i][j];
                
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