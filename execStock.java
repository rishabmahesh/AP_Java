import java.util.*;

class execStock
{
    public void main()
    {
        Scanner obj = new Scanner(System.in);
        List<laptop> stocklist = new ArrayList();
        stocklist.add(new laptop("Lenovo",10000,100));
        stocklist.add(new laptop("Dell",11000,90));
        stocklist.add(new laptop("HP",15000,80));
        stocklist.add(new laptop("Apple",100000,70));
        stocklist.add(new laptop("Alienware",200000,60));
        
        System.out.print("Available products--- " + "\n" + "Laptop " + "\t" + "Price" + "\t" + "Quantity\n");
        for(laptop a : stocklist)
        {
            a.display();
            System.out.println();
        }
        
        System.out.print("\nEnter name of laptop you want to buy:");
        String name=obj.next();
        
        System.out.print("\nEnter quantity:");
        int q = obj.nextInt();
        
        for(laptop a : stocklist)
        {
            if(a.getBrand().equals(name))
            {
                int x = a.buy(name,q);
                if(x == 0)
                {
                    System.out.print("\nWe have only " + a.getQuantity() + ". Exiting program!");
                    System.exit(0);
                }
                System.out.println("\nTotal price:" + x);
            }
        }
        
        for(laptop a : stocklist)
        {
            a.display();
            System.out.println();
        }
            List<laptop> outofstocklist = new ArrayList();        
        for(laptop a : stocklist)
        {
        
            if(a.getQuantity()<10)
            {
                outofstocklist.add(a);
            }
        }
        
        System.out.print("\nCalling outofstock list:");
        for(laptop a : outofstocklist)
        {
            a.display();
            System.out.println();
        }
        
    }
}