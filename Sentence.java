import java.util.*;

class Sentence
{
    private String sentence;
    private int numWords;
    
    public Sentence(String str)
    {
        sentence = str;
        int x=1;
        int k =str.indexOf(" ");
        while(k != -1)
        {
            x++;
            str = str.substring(k+1);
            k = str.indexOf(" ");
        }
    }
    
    public int getNumWords()
    {
        return numWords;
    }
    
    public String getSentence()
    {
        return sentence;
    }
    
    private static String removeBlanks(String s)
    {
        String temp="";
        int i=0;
        while(i<s.length())
        {
            if(s.charAt(i) == ' ')
            i++;
            temp = temp + s.charAt(i);
            i++;
        }
        return temp;
    }
    
    private static String lowerCase(String s)
    {
        int i=0;
        while(i<s.length())
        {
            if(s.charAt(i) >= 'A' && s.charAt(i)<= 'Z')
            {
                
                 
            }
        }
        return null;
    }
}