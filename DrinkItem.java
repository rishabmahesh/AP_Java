package resturant;
import java.util.*;

class DrinkItem
{
    private String itemCode;
    private int quantity;
    
    public DrinkItem(String item,int quantity)
    {
        itemCode=item;
        quantity=quantity;
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