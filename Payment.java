package resturant;
import java.util.*;

class Payment
{
    private  List<FoodItem> food = new ArrayList<FoodItem>();
    private int foodCount;
    private static double foodTax=0.2;
    
    private List<DrinkItem> drink = new ArrayList<DrinkItem>();
    private int drinkCount;
    private static double drinkTax=0.1;
    
    public Payment()
    {
        foodCount=0;
        drinkCount=0;
    }
    
    public Payment(FoodItem F)
    {
        foodCount=0;
        drinkCount=0;
        
        food.add(F);
    }
    
    public void addFoodItem(FoodItem x)
    {
        food.add(x);
    }
    
    public void addDrinkItem(DrinkItem x)
    {
        drink.add(x);
    }
    
    public double findPrice(List<Item> pl,String c)
    {
        for(Item i : pl)
        {
            if(i.getCode().equals(c))
             
            {
                return (i.getPrice() );
            }
        }
        return 0;
    }
    
    public double calculateBill(List<Item> i)
    {
        double fprice=0,dprice=0,total=0;;
        for(FoodItem f:food)
        {
            fprice = fprice + findPrice(i,f.getItemCode()) * f.getQuantity();
            fprice = fprice + fprice * foodTax;
        }
        
        for(DrinkItem d:drink)
        {
            dprice += findPrice(i,d.getItemCode()) * d.getQuantity();
            dprice += dprice * drinkTax;
        }
        
        total = fprice + dprice;
        return total;
    }
   
    public DrinkItem getDrink(int x)
    {
        return drink.get(x);
    }
    
    public FoodItem getFood(int x)
    {
        return food.get(x);
    }
    
    public int getDrinkCount()
    {
        return drinkCount;
    }
    
    public int getFoodCount()
    {
        return foodCount;
    }
}