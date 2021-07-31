package second;
import first.*;
import java.util.*;
public class Road {
    private String name;
    private double width;
    private Location start;
    private Location end;
    private Line l;
    public Road(String name,Double width,Location start,Location end)
    {
        this.name = name;
        this.width = width;
        this.start = start;
        this.end=end;
        Point p1 = start.getPoint();
        Point p2 = end.getPoint();
        l = new Line(p1,p2);
    }
    public Line getLine()
    {
        return l;
    }
    public double getWidth()
    {
        return width;
    }
    public String getName()
    {
        return name;
    }
    public Location getStart()
    {
        return start;
    }
    public Location getEnd()
    {
        return end;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setLoaction_1(Location start){
        this.start=start;
    }
    public void setLoaction_2(Location end){
        this.end=end;
    }

}
