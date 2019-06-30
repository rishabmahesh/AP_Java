import java.util.*;

class execEmployee
{
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        int h,m,h1,m1;
        List<employee> e = new ArrayList<employee>();
        for(int i=0;i<2;i++)
        {
            System.out.print("Enter login hours:");
            h=obj.nextInt();
            System.out.print("Enter login minutes:");
            m=obj.nextInt();
            System.out.print("Enter logout hours:");
            h1 = obj.nextInt();
            System.out.print("Enter logout minutes:");
            m1 = obj.nextInt();
            employee temp = new employee();
            
            temp.logintime(h,m);
            temp.logout(h1,m1);
            temp.timetoday();
            
            e.add(temp);
            int x=temp.getHours();
            System.out.print(x);
        }
        
        double totalsal=0;
        
        totalsal = totalsal+e.get(0).salary();

        System.out.print("Your total salary:" + totalsal);
    }
}