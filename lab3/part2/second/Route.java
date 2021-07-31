package second;
import java.util.*;


import first.*;
public class Route {
    private ArrayList<Road> roads;
    public Route(ArrayList<Road> roads)
    {
        this.roads = roads;
    }
    public ArrayList<Road> getRoads(){
        return roads;
    }
    public void setRoads(ArrayList<Road> roads){
        this.roads = roads;
    }
    public double lengthOfRoute(ArrayList<Road> r)
    {
        double sum = 0.0;
        for(int i = 0;i<r.size();i++)
        {   
            sum += r.get(i).getLine().length();
        }
        return sum;
    } 
    public static boolean isConnected(ArrayList<Road> r)
    {
        int p =0;
        int index = 0;
        Location current;
        
        if(r.get(0).getEnd().equals(r.get(1).getStart()))
        {
            current = r.get(1).getStart();
            p =1;
        }
        else if(r.get(0).getEnd().equals(r.get(1).getEnd()))
        {
            current = r.get(1).getEnd(); 
            p=1;
        }
        else 
        {
            return false;
        }
        for(int i=1;i<r.size()-1;i++)
        {
            if(current.equals(r.get(i).getEnd()))
            {
                if((r.get(i).getStart()).equals(r.get(i+1).getEnd()))
                {
                    current = r.get(i+1).getEnd();
                }
                else if((r.get(i).getStart()).equals(r.get(i+1).getStart()))
                {
                    current = r.get(i+1).getStart();
                }
            }
            else if(current.equals(r.get(i).getStart()))
            {
                if((r.get(i).getEnd()).equals(r.get(i+1).getStart()))
                {
                    current = r.get(i+1).getStart();
                }
                else if((r.get(i).getEnd()).equals(r.get(i+1).getEnd()))
                {
                    current  = r.get(i+1).getEnd();
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}
