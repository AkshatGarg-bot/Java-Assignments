import first.*;
import second.*;
import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        ArrayList<Location> locations = new ArrayList<Location>();
        for(int i=0;i<n1;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String name = sc.next(); 
            double x = (double)a;
            double y = (double)b;
            Point p = new Point(x,y);
            Location lc = new Location(name,p);
            locations.add(lc);
        }
        ArrayList<Road> roads = new ArrayList<Road>();
        int n2 = sc.nextInt();
        for(int i=0;i<n2;i++)
        {
            int index_1 = sc.nextInt();
            int index_2 = sc.nextInt();
            String name = sc.next();
            float width = sc.nextFloat();
            double w = (double)width;
            Road r1 = new Road(name,w,locations.get(index_1),locations.get(index_2));
            roads.add(r1);
        }
        int n3 = sc.nextInt();
        ArrayList<Route> routes = new ArrayList<Route>();
        for(int i = 0;i<n3;i++)
        {
            int n = sc.nextInt();
            ArrayList<Road> temp = new ArrayList<Road>();
            for(int j = 0;j<n;j++)
            {   
                int a = sc.nextInt();
                temp.add(roads.get(a));
                if(temp.size() == n)
                {   
                    Route rt = new Route(temp);
                    routes.add(rt); 
                }
            }
        }
        for(int i=0;i<routes.size();i++)
        {
            ArrayList<Road> r = routes.get(i).getRoads();
            System.out.print("Route"+(i+1)+":");
            if(Route.isConnected(r))
            {
                System.out.print(" Length ");
                System.out.printf("%.2f, ", routes.get(i).lengthOfRoute(r));
                int index = 0;
                for(int j = 1;j<r.size();j++)
                {
                    if(r.get(j).getWidth()<r.get(index).getWidth())
                        index = j;
                }
                System.out.printf("max width %.2f: ",r.get(index).getWidth());
                System.out.print("Start at "+r.get(0).getStart().getName());
                Location current = r.get(0).getEnd();
                for(int j=0;j<r.size();j++)
                {
                    System.out.print(". Follow "+ r.get(j).getName()+" to " + current.getName());
                    if(j<r.size()-1)
                    {
                        if(current.equals(r.get(j+1).getStart()))
                        {
                            current = r.get(j+1).getEnd();
                        }
                        else if(current.equals(r.get(j+1).getEnd()))
                        {
                            current = r.get(j+1).getStart();
                        }
                    }
                }
                System.out.println(".");
            }
            else
            {
                System.out.println(" Invalid route");
            }

        }
    }   
}
