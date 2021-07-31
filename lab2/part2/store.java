import java.util.*;
import java.util.stream.Collectors; 
//it stores all the details of the Book Store
class store{
    private static ArrayList<Book> books= new ArrayList<Book>();
    private static ArrayList<Sale> sales = new ArrayList<Sale>();
    private static ArrayList<Integer> year = new ArrayList<Integer>();
    private Book b;
    private Sale s;
    store(Book b)
    {
        books.add(b);
    }
    store(Sale s)
    {
        sales.add(s);
    }
    store(int y)
    {
        year.add(y);
    }
    static ArrayList<Book> getBooklist(){
        return books;
    }
    static ArrayList<Sale> getSalelist(){
        return sales;
    }
    static ArrayList<Integer> getyearlist()
    {
        return year;
    }
}
