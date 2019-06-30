import java.util.*;

class Rectangle extends Solid
{
    private double l,b,h;
    public Rectangle(String name,double l,double b,double h)
    {
        super(name);
        this.l=l;
        this.b=b;
        this.h=h;
    }
    
    public double volume()
    {
        return l*b*h;
    }
}