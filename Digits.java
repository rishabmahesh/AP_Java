import java.util.*;

public class Digits
{
    private ArrayList<Integer> digitList;
    
    public Digits()
    {
        digitList = new ArrayList<Integer>();
    }
    
    public Digits(int num)
    {
        while(num>0)
        {
            int x = num%10;
            digitList.add(0,x);
            num=num/10;
        }
    }
    
    public boolean isStrictlyIncreasing()
    {
        for(int i=0;i<digitList.size()-1;i++)
        {
            if(digitList.get(i)>digitList.get(i+1))
            return false;
            
        }
        return true;
    }
}