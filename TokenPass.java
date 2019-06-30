import java.util.*;

class TokenPass
{
    private int[] board;
    private int currentPlayer;
    
    public TokenPass(int playerCount)
    {
        board = new int[playerCount];
        for(int i=0;i<playerCount;i++)
        {
            board[i] = (int)(11 * Math.random());
        }
        currentPlayer = (int)(playerCount * Math.random());
    }
    
    public void distributeCurrentPlayerTokens()
    {
        System.out.print("BEFORE EDITING:");
        
        for(int j=0;j<board.length;j++)
            {
                System.out.print(board[j]);
            }
        System.out.println("Currentplayer:"+currentPlayer);
        
        int i = board[currentPlayer];
        
        board[currentPlayer]=0;
        
        
            if(currentPlayer == board.length-1)
                currentPlayer=0;
            else
               currentPlayer++;
            while(i>0)
            {
           
                board[currentPlayer]+=1;
                currentPlayer++;
                i--;
                
                if(currentPlayer==board.length)
                currentPlayer=0;
            }
            
            for(i=0;i<board.length;i++)
            {
                System.out.print(board[i]);
            }
        }
    
    }
