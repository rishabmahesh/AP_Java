class ColorGrid
{
    private String[][] pixels;
    private int rows;
    private int cols;
    
    public ColorGrid(String s,int numRows,int numCols)
    {
        int k = 0;
        rows = numRows;
        cols = numCols;
        
        pixels = new String[numRows][numCols];
        for(int i=0;i<numRows && k<s.length() ;i++)
        {
            for(int j=0;j<numCols;j++)
            {
                pixels[i][j] = s.charAt(k++)+"";
            }
        }
    }
    
    public void paintRegion(int row,int col,String newColor, String oldColor)
    {
        if(row>=0 && row<rows && col>=0 && col<cols)
        {
            if(pixels[row][col].equals(oldColor))
            {
                pixels[row][col] = newColor;
                paintRegion(row+1,col,newColor,oldColor);
                paintRegion(row-1,col,newColor,oldColor);
                paintRegion(row,col+1,newColor,oldColor);
                paintRegion(row,col-1,newColor,oldColor);
            }
        }
        
    }
    
    public void display()
    {
        System.out.println("DISPLAYING ARRAY---");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(pixels[i][j] + "\t");
            }
            System.out.println();
        }
    }
}