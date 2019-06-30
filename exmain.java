package resturant;
import java.util.*;

class exmain
{    
    public void main()
    {
        List<Payment> tablelist = new ArrayList<Payment>();
        List<Item> i = new ArrayList<Item>();
        FoodItem a = new FoodItem("f100",2);
        FoodItem b = new FoodItem("f101",1);
        DrinkItem c = new DrinkItem("d100",3);
        DrinkItem d = new DrinkItem("d101",1);
        i.add(new Item("f100","Burger",100));
        i.add(new Item("f101","Pizza",200));
        i.add(new Item("d100","Coke",30));
        i.add(new Item("d101","Orange Juice",50));
        
        tablelist.add(new Payment());
        tablelist.add(new Payment());
        
        tablelist.get(0).addFoodItem(a);
        tablelist.get(0).addDrinkItem(c);
        tablelist.get(1).addDrinkItem(d);
        tablelist.get(1).addFoodItem(b);
        
        System.out.print("\nPrice of table 1:" + tablelist.get(0).calculateBill(i));
        System.out.print("\nPrice of table 2:" + tablelist.get(1).calculateBill(i));
        //System.out.print(
        
    }
}