import java.util.*;

class animal
{
    int cageNo,ID;
    String gender,name,species;
    
    public animal(int cageNo,int ID,String gender,String name,String species)
    {
        this.cageNo=cageNo;
        this.ID=ID;
        this.gender=gender ;
        this.name=name;
        this.species=species;
    }
    
    String getSpecie()
    {
        return species;
    }
    
    public String toString()
    {
        return (name + "\t" + species);
    }
    
    String getName()
    {
        return name;
    }
    
    int getCageNo()
    {
        return cageNo;
    }
    
    int getID()
    {
        return ID;
    }
}