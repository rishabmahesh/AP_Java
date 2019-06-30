import java.util.*;

class convert4to2
{
    int[][] matrix = new int[4][4];
    int [][] b = new int[2][2];

    void main()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the bigger matrix:");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                matrix[i][j] = obj.nextInt();
            }
        }

        System.out.print("Your given matrix is:");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int max1=0,max2=0;
        int c=0,r=0;
        for(int i=0;i<4;i=i+2)
        {
            c=0;
            for(int j=0;j<4;j=j+2)
            {
                max2=0;
                for(int k=j;k<=(j+1);k++)
                {
                    if(max2<matrix[i][k])
                    max2=matrix[i][k];

                    if(max2<matrix[i+1][k])
                    max2=matrix[i+1][k];

                }
                System.out.println("MAX2:  " + max2);
                b[r][c] = max2;
                c++;
            }
            r++;
        }

        System.out.println("The reduced mattrix = ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }


    }
}