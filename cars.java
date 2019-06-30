import java.util.*;

class Cars
{
    int[][] data = new int[4][5];
    double[] price = new double[5];
    
    void input()
    {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter data table:");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                data[i][j] = obj.nextInt();
            }
        }
        
        System.out.println("Enter price of all models->");
        for(int i=0;i<5;i++)
        {
            price[i] = obj.nextDouble();
        }
    }
    
    void salesman2()
    {
        int sales=0;
        for(int i=0;i<5;i++)
        {
            sales = sales + data[1][i];
        }
        System.out.print("Sales by salesman2:" + sales);
    }
    
    void model3()
    {
        int sales=0;
        for(int i=0;i<4;i++)
        {
            sales += data[i][2];
        }
        System.out.print("Sales of model3:" + sales);
    }
    
    void sales_of_all_models()
    {
        int[] s = new int[5];
        for(int j=0;j<5;j++)
        {
            for(int i=0;i<4;i++)
            {
                s[j] += data[i][j];
            }
        }
        
        for(int i=0;i<5;i++)
        {
            System.out.print("Sales of model " + (i+1) + ":" + s[i]);
        }
        
        System.out.print("\nTotal sales->");
        for(int i=0;i<5;i++)
        {
            System.out.print("\nPrice of model "+(i+1)+":"+(s[i]*price[i]));
        }
    }
    
    void d()
    {
        int[] s = new int[4];
        int k=0;int pos=0;
                int max=0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                s[i] += data[i][j];
            }
            
            if(s[i]>max)
            {
                max=s[i];
                pos = i+1;
            }
        }
        

        System.out.print("\nMaximum sales by salesman "+ pos + ":" + max);
    }
}