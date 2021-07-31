package demo19007;
import base.*;
import java.util.*;
// We assume only one instance of Network will be created for a program
public class NetworkDemo extends Network {
	
	// keep track of the following entities
	@Override
	public synchronized void add(Hub hub) {
		hubs.add(hub);
	}

	@Override
	public synchronized void add(Highway hwy) {
		highways.add(hwy);
	}

	@Override
	public synchronized void add(Truck truck) {
		trucks.add(truck);
	}
	
	@Override
	public synchronized void start() {
		for(Truck tr : trucks)
        {
            tr.start();
        }
        for(Hub h : hubs)
        {
            h.start();
        }
	}

	@Override
	public synchronized void redisplay(Display disp) {
		for(Hub h : hubs)
        {
            h.draw(disp);
        }
        for(Highway h : highways)
        {
            h.draw(disp);
        }
        for(Truck tr : trucks)
        {
            tr.draw(disp);
        }
	}

	@Override
	protected synchronized Hub findNearestHubForLoc(Location loc) {
		Hub hub = hubs.get(0);
		for(int i = 0; i < hubs.size(); i++) {
			if(hubs.get(i).getLoc().distSqrd(loc) < hub.getLoc().distSqrd(loc)) { //find the nearest hub corresponding to the location
				hub = hubs.get(i);
			}
		}
		return hub;
	}
	private ArrayList<Hub> hubs = new ArrayList<>();
	private ArrayList<Highway> highways = new ArrayList<>();
	private ArrayList<Truck> trucks = new ArrayList<>();
}

