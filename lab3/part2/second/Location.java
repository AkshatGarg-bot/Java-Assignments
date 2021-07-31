package second;
import first.*;
public class Location {
    private String name;
    private Point p;
    public Location(String name,Point p)
    {
        this.name = name;
        this.p = p;
    }
    public String getName()
    {
        return name;
    }
    public Point getPoint()
    {
        return p;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setPoint(Point p){
        this.p=p;
    }
       
}
