package myairline;

import java.util.*;
public class flight {
    private String origion,destination;
    private int seats,price;
    public flight(String origion,String destination, int seats,int price)
    {
        this.origion = origion;
        this.seats = seats;
        this.destination= destination;
        this.price = price;
    }
    public void setOrigion(String origion){
        this.origion = origion;
    }
    public void setSeats(int price){
        this.price = price;
    }
    public void setDestination(String destination){
        this.destination = destination;
    }
    public void setPrice(int price ){
        this.price = price;
    }
    public String getOrigion(){
        return origion;
    }
    public String getDestination(){
        return destination;
    }
    public int getPrice(){
        return price;
    }
    public int  getSeats(){
        return seats;
    }
    static flight minPrice(ArrayList<flight> flights)
    {
        int index=0;
        for(int i=1;i<flights.size();i++)
        {
            if(flights.get(i).getPrice()<flights.get(index).getPrice())
                index = i;
        }
        return flights.get(index);
    }
}