import java.util.*;

class execSolid
{
    void main()
    {
        Solid s = new Rectangle("A1",1,2,3);
        Solid b = new Sphere("A2",2);
        System.out.println(s.volume());
        System.out.println(b.volume());
    }
}