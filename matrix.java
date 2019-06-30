import java.util.*;

class matrix
{
    int[][] matrix;
    int row,col;
    int a1[],a2[],a3[];
    public matrix(int r,int c)
    {
        Scanner obj = new Scanner(System.in);
        row=r;
        col=c;
        matrix = new int[row][col];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j] = obj.nextInt();
            }
        }
    }
    
    public void compress()
    {
        boolean zero;
        for(int i=0;i<row;i++)
        {
            zero=true;
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]!=0)
                zero=false;
            }
            
            if(zero==true)
            {
                for(int k=i;k<row-1;k++)
                {
                    for(int l=0;l<col;l++)
                    {
                        matrix[k][l] = matrix[k+1][l];
                    }
                }
                row--;
            }
        }
        
        for(int j=0;j<col;j++)
        {
            zero=true;
            for(int i=0;i<row;i++)
            {
                if(matrix[i][j]!=0)
                zero=false;
            }
            
            if(zero==true)
            {
                for(int k=j;k<col-1;k++)
                {
                    for(int l=0;l<row;l++)
                    {
                        matrix[k][l] = matrix[k+1][l];
                    }
                }
                col--;
            }
        }
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    //return array with all non zero elements
    void array1()
    {
        int k=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]!=0)
                {
                    k++;
                }
            }
        }
        
        a1 = new int[k];
        int l=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]!=0)
                {
                    a1[l]=matrix[i][j];
                    l++;
                }
            }
        }
        
        System.out.println();
        for(int i=0;i<a1.length;i++)
        System.out.print(a1[i] + "\t");
    }
    
    //returns array with number of positive numbers in each row
    void array2()
    {
        int k=0;
        int l=0,m=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]!=0)
                {
                    m++;
                }
            }
        }
        a2 = new int[m];
        
        for(int i=0;i<row;i++)
        {
            k=0;
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]!=0)
                k++;
            }
            if(l>0)
            {
                a2[l] = k + a2[l-1];
            }
            a2[l]=k;
            l++;
        }
        
        System.out.println();
        for(int i=0;i<a2.length;i++)
        System.out.print(a2[i] + "\t");
    }
    
    //returns the position of the element as in array 1 adding the previous array element
    void array3()
    {
        int k=0,m=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]!=0)
                {
                    m++;
                }
            }
        }
        
        a3 = new int[m];
        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<row;j++)
            {
                for(int l=0;l<col;l++)
                {
                    if(a1[i]==matrix[j][l])
                    {
                        a3[i]=j;
                    }
                }
            }
        }
        
        System.out.println();
        for(int i=0;i<a3.length;i++)
        System.out.print(a3[i] + "\t");
    }
}