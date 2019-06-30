import java.util.*;

class execZoo
{
    public static void main()
    {
        zoo zooAnimal = new zoo();
        zooAnimal.sort(new animal(1,1,"Male","Snakes","reptiles"));
        zooAnimal.sort(new animal(2,2,"Female","Crocodile","reptiles"));
        zooAnimal.sort(new animal(3,3,"Male","Lizard","reptiles"));
        zooAnimal.sort(new animal(4,4,"Female","Frog","amphibians"));
        zooAnimal.sort(new animal(5,5,"Male","Salamander","amphibians"));
        zooAnimal.sort(new animal(6,6,"Female","Camel","desert"));
        zooAnimal.sort(new animal(7,7,"Male","KangarooRat","desert"));
        zooAnimal.sort(new animal(8,8,"Female","Whale","marine"));
        zooAnimal.sort(new animal(9,9,"Male","Fish","marine"));
        zooAnimal.sort(new animal(10,10,"Female","Turtle","marine"));
        
        System.out.println("Displaying sorted animals-->");
        zooAnimal.display();
        System.out.println();
        List<animal> z = new ArrayList<animal>();
        System.out.println("Displaying all species of desert by calling findSpecies-->");
        z=zooAnimal.findSpecies("desert");
        System.out.println(z + "\n");
        System.out.println();
        System.out.println("Displaying the cage No of animal ID 1-->");
        zooAnimal.findCageNo(1);
        System.out.println();
        System.out.println("Displaying all animals according to species-->");
        zooAnimal.groupSpecies();
    }
}