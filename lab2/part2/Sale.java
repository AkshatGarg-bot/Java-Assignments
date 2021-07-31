import java.util.*;
import java.util.stream.Collectors; 
import java.lang.Math;
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
        int p = (int) Math.round(cost);
        if(parameter == 0)
        {
            current_year[year] += p;
        }
        else if(parameter == 1)
        {
            prev_year[year] += p; 
        }
        else if(parameter == 2)
        {
            prev_year_2[year] += p;
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
