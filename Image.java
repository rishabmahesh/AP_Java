import java.util.*;

class Image
{
    private final int BLACK=1;
    private final int WHITE=0;
    private int[][] image;
    private int size;
    
    public Image(int size)
    {
        this.size = size;
        image = new int[size][size];
       
    }
    void input()
    {
     Scanner obj = new Scanner(System.in);
        System.out.println("Enter array:");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                image[i][j] = obj.nextInt();
            }
        }
    }
    public void display()
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(image[i][j]+ "\t");
            }
            System.out.println();
        }
    }
    
    public void eraserBlob(int row,int col)
    {
        if(row>=0 && row<size && col>=0 && col<size)
        {
            if(image[row][col]== BLACK)
            {
              image[row][col]=WHITE;
              eraserBlob(row+1,col);
              eraserBlob(row-1,col);
              eraserBlob(row,col+1);
              eraserBlob(row,col-1);
            }
        }
     }

     
     public static  void main()
     {
         
         Image i = new Image(4);
         i.input();
         i.display();
         i.eraserBlob(1,1);
         i.display();
     }
    }
         
 
