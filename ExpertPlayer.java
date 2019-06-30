import java.util.*;

class ExpertPlayer extends HumanPlayer
{
    private int rating;
    ExpertPlayer()
    {
        rating = 0;
        
    }
    
    public int compareTo(ExpertPlayer expert)
    {
        System.out.println("INSIDE EXPERTPLAYER COMPARETO()");
        return 0;
    }
}