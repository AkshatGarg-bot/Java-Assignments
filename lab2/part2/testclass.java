import java.util.*;
import java.util.stream.Collectors; 
public class testclass{
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
