import java.util.*;

class Sphere extends Solid
{
    private double r;
    
    public Sphere(String name,double r)
    {
        super(name);
        this.r=r;
    }
    
    public double volume()
    {
        System.out.println("Sphere function");
        return ((4.0/3.0) * Math.PI * Math.pow(r,3));
    }
}