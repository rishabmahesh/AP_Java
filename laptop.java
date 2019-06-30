import java.util.*;

class laptop
{
    String brand;
    int price;
    int quantity;
    
    public laptop(String brand, int price,int quantity)
    {
        this.brand=brand;
        this.price=price;
        this.quantity=quantity;
    }
    
    int buy(String brand, int q)
    {
        display();
        if(q>quantity)
        return 0;
        
        quantity -=q;
        int total = q * price;
        return total;
    }
    
    void display()
    {
        System.out.print(brand + "\t" + price + "\t" + quantity);
    }
    
    String getBrand()
    {
        return brand;
    }
    
    int getQuantity()
    {
        return quantity;
    }
    
    int getPrice()
    {
        return price;
    }
}