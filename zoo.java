import java.util.*;

class zoo
{
    List<animal> zooAnimal= new ArrayList<animal>();
    
    public zoo()
    {
        
    }
    
    void display()
    {
        for(animal z:zooAnimal)
        {
            System.out.print(z + "\n");
        }
    }
    
    List<animal> findSpecies(String specie)
    {
        List<animal> s = new ArrayList<animal>();
        for(animal z:zooAnimal)
        {
            if(z.getSpecie().equals(specie))
            {
                s.add(z);
            }
        }
        return s;
    }
    
    void findCageNo(int ID)
    {
        for(animal z:zooAnimal)
        {
            if(z.getID() == ID)
            {
                System.out.print(z.getCageNo());
                break;
            }
        }
    }
    
    void groupSpecies()
    {
        List<animal> reptiles = new ArrayList<animal>();
        List<animal> amphibians = new ArrayList<animal>();
        List<animal> desert = new ArrayList<animal>();
        List<animal> marine = new ArrayList<animal>();
        List<animal> others = new ArrayList<animal>();
        
        for(animal z:zooAnimal)
        {
            if(z.getSpecie().equals("reptiles"))
            reptiles.add(z);
            
            else if(z.getSpecie().equals("amphibians"))
            amphibians.add(z);
            
            else if(z.getSpecie().equals("desert"))
            desert.add(z);
            
            else if(z.getSpecie().equals("marine"))
            marine.add(z);
            
            else
            others.add(z);
        }
        System.out.print("\nReptiles list:" + reptiles);
        System.out.print("\nMarine list:" + marine);
        System.out.print("\nDesert list:" + desert);
        System.out.print("\nAmphibians list:" + amphibians);
        System.out.print("\nOthers list:" + others);
    }
    
    void sort(animal A)
    {
        boolean insert = false;
        for(int i=0;i<zooAnimal.size();i++)
        {
            insert=false;
            if(zooAnimal.get(i).getName().compareTo(A.getName())>0)
            {
                zooAnimal.add(i,A);
                insert=true;
                break;
            }
        }
        
        if(insert==false)
        zooAnimal.add(A);
        
    }
}