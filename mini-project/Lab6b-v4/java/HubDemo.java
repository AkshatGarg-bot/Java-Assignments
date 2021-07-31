package demo19007;
import base.*;
import java.util.*;


public class HubDemo extends Hub {
	public HubDemo(Location loc) {
		super(loc);
	}
	
	// add a Truck to the queue of the Hub.
	// returns false if the Q is full and add fails
	@Override
	public synchronized boolean add(Truck truck) {
		if(trucks.size() < this.getCapacity()) {
			trucks.add(truck);
			return true;
		}
		return false;
		
	}

	@Override
	protected synchronized void remove(Truck truck) {
		trucks.remove(truck);   
	}

	public synchronized Highway route(Hub last, Hub dest, Set<Hub> s) {
		s.add(last);  //adding the current hub if already present does not add
		for(Highway hwy : last.getHighways()) { //all highways connected with hub 
			if(s.contains(hwy.getEnd())) {      // hub at ending of the highway
				continue;
			}
			Highway hi = route(hwy.getEnd(), dest, s);         //recursive funtion of the dfs
			if(hi != null) {
				return hwy;
			}
			if(hwy.getEnd() == dest) {
				return hwy;
			}
			
		}
		return null;
	}

	// provides routing information
	@Override
	public synchronized Highway getNextHighway(Hub last, Hub dest) {
		if(last == dest) {        //if the ending hub matches with destinantion then we are done
			return null;
		}
		else
		{
			Set<Hub> sets = new HashSet<Hub>();      //act as a visited array
			return route(last, dest, sets);
		}
	}
	

	// to be implemented in derived classes. Called at each time step
	@Override
	protected synchronized void processQ(int deltaT) {
		for(int i = trucks.size() - 1; i >= 0; i--) {       
			Truck tr = trucks.get(i); //getting the one truck     
			Highway hi;
			hi = this.getNextHighway(this, Network.getNearestHub(tr.getDest()));  //getting a highway corresponding to the truck
			if(hi == null) {  //if highway we get is null then we move to next truck
				continue;
			}
			if(hi.hasCapacity()) {   //the highway is not null and it has the capacity 
				tr.enter(hi);  //we entered the truck to that highway
				hi.add(tr);    //add truck to that highway 
				trucks.remove(tr);  //removes the truck from the arraylist
			}
		}
	}
	
	private ArrayList<Truck> trucks = new ArrayList<>();
	private ArrayList<Hub> hubs = new ArrayList<>();
}

