package resturant;
import java.util.*;

class FoodItem
{
    private String itemCode;
    private int quantity;
    
    public FoodItem(String item,int quantity)
    {
        itemCode=item;
        this.quantity=quantity;
    }
    
    String getItemCode()
    {
        return itemCode;
    }
    
    int getQuantity()
    {
        return quantity;
    }
}