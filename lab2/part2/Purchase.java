import java.util.*;
import java.util.stream.Collectors; 
//it assigns a purchase value to a book at the moment of purchase it also sets the book-id for a particular book
class Purchase{
    private int year;
    private int cost_price;
    private double factor = 1.5;
    private static int x = 0;
    private static int y = 0;
    private String Book_id;
    Purchase(int year, int cost_price)
    {
        this.year = year;
        this.cost_price = cost_price;
    }
     int getcostprice()
    { 
        return cost_price;
    }
     double getSellPrice()
    { 
        return factor*cost_price;
    }
     String getid()
    {
        int p;
        if(x != year)
        {
            x = year;
            y = 1;
        }
        else
        {
            y++;
        }
        String a = String.valueOf(x);
        String b = "-";
        String c = String.format("%06d" ,y);
        Book_id = a.concat(b).concat(c);
        return Book_id;
    }
    int getyear()
    { 
        return year;
    }
}