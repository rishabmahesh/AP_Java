import java.util.*;

public class Phrase
{
    private String currentPhrase;
    
    
    public Phrase(String p)
    {
        currentPhrase=p;
    }
    
    public int findNthOccurence(String str,int n)
    {
        int c=0;
        for(int i=0;i<currentPhrase.length();i++)
        {
            i= currentPhrase.indexOf (str,i);
            if(i!=-1)
            c++;
            
            if(c==n)
                return i;
            
        }
        return -1;
    }
    
    void replaceNthOccurence(String str,int n,String repl)
    {
        int index=findNthOccurence(str,n);
        if(index!=-1)
            currentPhrase=currentPhrase.substring(0,index) + repl + currentPhrase.substring(index+str.length());
        
        System.out.print(currentPhrase);
        
    }
}