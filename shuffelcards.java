import java.util.*;

class shuffelcards
{
    
    public void main()
    {
        List<Integer> cards = new ArrayList<Integer>();
        Scanner obj = new Scanner(System.in);
        System.out.print("How many cards do you want to be shuffeled:");
        int n = obj.nextInt();
        System.out.println("Enter your card numbers:");
        for(int i=0;i<n;i++)
        {
            cards.add(obj.nextInt());
        }
        System.out.println("Shuffeling...");
        
        for(int i=cards.size(); i>0; i--)
        {
           int a=(int) (Math.random() * i);
           System.out.println("a="+a);
            System.out.print(cards.get(a));
            cards.remove(a);
            
        }
    }
}