package first;

import java.util.ArrayList;

public class Line {
    private Point p1,p2;
    public Line(Point p1,Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public Point getPoint_1(){
        return p1;
    }
    public Point getPoint_2(){
        return p2;
    }
    public void setPoint_1(Point p1){
        this.p1=p1;
    }
    public void setPoint_2(Point p2){
        this.p2=p2;
    }
    public double length(){
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();
        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)); 
    }
    double totalLength(ArrayList<Line> lines)
    {
        double sum = 0;
        for(int i=0;i<lines.size();i++)
        {
            sum += lines.get(i).length();
        }
        return sum;
    }
}
