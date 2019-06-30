import java.util.*;

class shiftleft
{
    int a[][] = new int[2][5];
    int b[][] = new int[2][5];
    
    void main()
    {
        System.out.println("Enter values of matrix:");
        Scanner obj = new Scanner(System.in);
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<5;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
        
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<=4;j++)
            {
                if(j==0)
                b[i][4]=a[i][j];
                else
                b[i][j-1]=a[i][j];
                
            }
        }
        
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
        
        
    }
}