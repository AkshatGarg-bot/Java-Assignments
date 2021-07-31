package demo19007;
import base.*;
import java.util.*;

// Highways are unidirectional

public class HighwayDemo extends Highway {
	
	@Override
	public synchronized boolean hasCapacity() {
	if(trucks.size()<this.getCapacity())
	{
		return true;
	}
	return false;
	}
	
	// fails if already at capacity
	@Override
	public synchronized boolean add(Truck truck) {
		if(trucks.size() < this.getCapacity()) {
			trucks.add(truck);
			return true;
			
		}
		return false;
	}

	@Override
	public synchronized void remove(Truck truck) {
		trucks.remove(truck);
	}

	private ArrayList<Truck> trucks = new ArrayList<>();
}
	

