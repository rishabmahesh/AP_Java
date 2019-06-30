import java.util.*;

class HumanPlayer implements Player
{
    private String name;
    
    HumanPlayer()
    {
        name = "default_name";
        
        System.out.print(x + y);
        
    }
    
    public int getMove()
    {
        System.out.print("INSIDE HUMAN PLAYER GETMOVE()");
        return 0;
    }
    
    public void updateDisplay()
    {
        System.out.println("INSIDE HUMANPLAYER UPDATEDISPLAY()");
    }
    
    public String getName()
    {
        return name;
    }
}