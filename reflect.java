import java.util.*;

class reflect
{
    int[][] array = new int[3][3];
    public void main()
    {
        for(int i=0;i<array.length/2;i++)
        {
            for(int j=0;j<array[0].length;j++)
            {
                if(j>i)
                {
                    array[j][i]=array[i][j];
                }
                
            }
        }
        
        
    }
}