package demo19007;
import base.*;
import java.util.*;

public class TruckDemo extends Truck {
	
	@Override
	public synchronized Hub getLastHub() {
		if(this.current != null) {
			return this.current.getStart();	
		}
		return null;
	}
	@Override
	public synchronized void enter(Highway hwy) {
		//state = "moving";
		this.current = hwy;
	}

	@Override
	public synchronized String getTruckName() {
		return "Truck19007";
	}

	@Override
	protected synchronized void update(int deltaT) {
		// if(this.getLoc().getX() == this.getSource().getX() && this.getLoc().getY() == this.getSource().getY())
		// {
		// 	this.setLoc(Network.getNearestHub(this.getSource()).getLoc());
		// 	Network.getNearestHub(this.getSource()).add(this);
		// 	state = "halt";
		// 	return;
		// }
		this.time += deltaT;               			//increasing the value of time on each iteration
		if(this.time < this.getStartTime()) {      // if current time is less than start time then do nothing
			return;
		}

		//if destination is same as the location then we have to stop as we have done the work
		if(this.getLoc().getX() == this.getDest().getX() && this.getLoc().getY() == this.getDest().getY()) {    
			return;
		}

		//if we are present at the source at the current moment 
		if(this.getLoc().getX() == this.getSource().getX() && this.getLoc().getY() == this.getSource().getY()) {
			if(Network.getNearestHub(this.getSource()).add(this)) {   //hub not full
				this.setLoc(Network.getNearestHub(this.getSource()).getLoc()); //update the location of the source 
			}
			return;
		}

		if(current == null) {   //initially the current is null so we dont have to do anything
			return;
		}

		Hub hub = this.current.getEnd();      //getting the ending hub of the highway
		double distanceCalculated = (current.getMaxSpeed() * deltaT)/1000.0;      //distance slanting or delta hypoteneuse
		
		//we calculate the distance between the truck location and the end of the hub if the distance is more than we have to go to the nearest hub
		if(hub.getLoc().distSqrd(this.getLoc()) <= Math.pow(distanceCalculated, 2)) {              
			Hub myHub = Network.getNearestHub(this.getDest());   //destination hub for the truck
			if(hub.getLoc().getX() == myHub.getLoc().getX() && hub.getLoc().getY() == myHub.getLoc().getY()) {  //if the intial hub location is same as destination
				current.remove(this);    //remove the truck for this highway
				this.setLoc(this.getDest());  //set the location of the truck
				return;
			}

			if(hub.add(this) == true) {    //if we can add the truck to the hub
				this.setLoc(hub.getLoc());   //set the location to the hub
				current.remove(this);
				current = null;
			}
			return;
		}
		// Location loc = new Location(delX,delY);
		// 	int Xnew = loc.getX();
		// 	int Ynew = loc.getY();
		//calculating coordintes
		double x1 = this.getLoc().getX();
		double y1 = this.getLoc().getY();
		double x2 = hub.getLoc().getX();
		double y2 = hub.getLoc().getY();
		
		double hypotenuse = Math.sqrt((y2 - y1)*(y2 - y1) + (x2 - x1)*(x2 - x1));
		double sin = (y2 - y1)/hypotenuse;
		double cos = (x2 - x1)/hypotenuse;

		this.setLoc(new Location(Math.round((float)(x1 + distanceCalculated*cos)), Math.round((float)(y1 + distanceCalculated*sin))));
	}

	private int time = 0;
	private Highway current = null;
	//private String state = "halt";
}

