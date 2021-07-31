package first;
import java.lang.Math; 
public class Point {
    private double x,y;
    public Point(double x,double y)
    {
        this.x = x;
        this.y = y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y=y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public  double distance(double x1,double y1)
    {
        return Math.sqrt((getX()-x1)*(getX()-x1) + (getY()-y1)*(getY()-y1));
    }
}