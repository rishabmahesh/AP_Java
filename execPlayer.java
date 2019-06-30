import java.util.*;

class execPlayer
{
    public void main()
    {
        Player p1 = new HumanPlayer();
        Player p2 = new ExpertPlayer();
        int x1=p1.getMove();
        int x2=p2.getMove();
        
        int x;
        Player c1 = new ExpertPlayer();
        Player c2 = new ExpertPlayer();
        if(((ExpertPlayer)c1).compareTo((ExpertPlayer)c2)<0)
        {
        }
    }
    
    
}