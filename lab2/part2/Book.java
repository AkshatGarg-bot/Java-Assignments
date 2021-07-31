import java.util.*;
import java.util.stream.Collectors; 
//creates a book b which has its unique id,year of purchase,selling price and cost price
class Book{
    private int year;
    private String Book_id;
    private double sellingprice;
    private int cost_price;
    Book(int year,String Book_id,double sellingprice,int cost_price)
    {
        this.year = year;
        this.Book_id=Book_id;
        this.sellingprice=sellingprice;
        this.cost_price = cost_price;
    }    
    String getBookid()
    {
        return  Book_id;
    }
    int getyear()
    {
        return year;
    }
    double getSellPrice()
    {
        return sellingprice;
    }
    int getcostprice()
    {
        return cost_price;
    }
}