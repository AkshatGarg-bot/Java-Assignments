package demo19007;
import base.*;
import java.util.*;

public class FactoryDemo extends Factory {

	public Network createNetwork() {
		return new NetworkDemo();
	}

	public Highway createHighway() {
		return new HighwayDemo();
	}

	public Hub createHub(Location location) {
		return new HubDemo(location);
	}

	public Truck createTruck() {
		return new TruckDemo();
	}
	
}

