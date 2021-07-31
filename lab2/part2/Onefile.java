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
//it contains the sale details of the book it also has a method to print sales in sorted order of the years 
class Sale{
    private int year;
    private String id;
    private static int[] current_year = new int[10000];
    private static int[] prev_year    = new int[10000];
    private static int[] prev_year_2  = new int[10000];
    private double cost;
    private int parameter,index,i;
    ArrayList<Book> b = store.getBooklist();
    Sale(int year,String id)
    {
        this.year = year;
        this.id = id;
        parameter = year - Integer.parseInt(id.substring(0,4));
        for(i=0;i<b.size();i++)
        {
            if(id.equals(b.get(i).getBookid()))
            {
                index = i;
            }
        }
        cost = b.get(index).getSellPrice();
        if(parameter == 0)
        {
            current_year[year] += cost;
        }
        else if(parameter == 1)
        {
            prev_year[year] += cost; 
        }
        else if(parameter == 2)
        {
            prev_year_2[year] += cost;
        }
    }
    static void printSales()
    {
        List<Integer> years = (store.getyearlist()).stream().distinct().collect(Collectors.toList()); 
        Collections.sort(years);
        for(int i=0;i<years.size();i++)
        {
            System.out.println(years.get(i) + " " + current_year[years.get(i)] + " " + prev_year[years.get(i)] + " "+prev_year_2[years.get(i)]);
        }
    }
    int getyear()
    {
        return year;
    }
    String getBookid()
    {
        return id;
    }
}
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
public class Onefile{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int  a = sc.nextInt();
            int b = sc.nextInt();
            if(a==0 && b==0)
            {
                break;
            } 
            else
            {
                Purchase p1 = new Purchase(a,b);
                int year = p1.getyear();
                double sp = p1.getSellPrice();
                String id = p1.getid();
                int cp = p1.getcostprice();
                Book b1 = new Book(year,id,sp,cp);
                store s = new store(b1);
            }
        }
        while(true)
        {
            int y = sc.nextInt();
            String s = sc.next();
            if(y==0 && s.equals("0"))
            {
                break;
            }
            else
            {
                Sale sl = new Sale(y,s);
                int yr = sl.getyear();
                store ST = new store(yr);
            }
        }
        Sale.printSales();
    }
}
