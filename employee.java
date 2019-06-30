import java.util.*;

class employee
{
    String name;
    int hours,hours2,h,m;
    int minutes,minutes2;
    static int th=0,tm=0;
    
    employee()
    {}
    public void logintime(int h,int m)
    {
        hours = h;
        minutes = m;
    }
    
    void logout(int h, int m)
    {
        hours2 = h;
        minutes2 = m;
    }
    
    void timetoday()
    {
        // int h,m;
        h = hours2-hours + (minutes2-minutes)/60;
        m = (minutes2 - minutes)%60;
        totaltime();
    }
    
    void totaltime()
    {
        th = th + h;
        tm = tm + m;
    }
    
    double salary()
    {
        return (th+(double)tm/100)*500;
    }
    
    int getHours()
    {
        return th;
    }
}