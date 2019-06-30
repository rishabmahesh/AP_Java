import java.util.*;

class MultPractice implements StudyPractice
{
    int first,second;
    
    void multPractice(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
    
    public String getProblem()
    {
        return first+" TIMES " + second;
    }
    
    public void nextProblem()
    {
        second++;
    }
    
}