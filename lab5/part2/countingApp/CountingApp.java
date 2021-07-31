package countingApp;
import widgets.*;
import display.*;

public class CountingApp {
	private Display disp;
	private Panel p;
	private Toggle t;
	private Counter c;
	private Label lab; 
	public CountingApp(Display d) {
		// Display object made available at construction. Cannot be changed
		disp = d;
	}
	public void init() {
		// sets up widgets
		
		// create a Panel with location 50,50 and width 400, height 200
		p = new Panel(400,200);
		int x0=50,y0=50;
		disp.set(p, x0, y0);
		
		t = new Toggle(50,50);
		Widget w1 = t;
		Location l1 = new Location(100+x0,60+y0);
		p.addWidget(w1,l1);
		
		c = new Counter(100,40);
		Widget w2 = c;
		Location l3 = new Location(200+x0,60+y0);
		p.addWidget(w2, l3);
		
		lab = new Label("Vote up or down");
		Widget w3 = lab;
		Location l4 = new Location(150+x0,150+y0);
		p.addWidget(w3, l4);
		
		disp.registerClickable(t);
		disp.registerClickable(c);
		
		// creates the following widgets, which are added as children of this panel
		// Note locations are relative to Panel
		// - Toggle button:   location 100, 60, size 50, 50
		// - Counter button:  location 200, 60, size 100, 40
		// - Label: location  150, 150, text: "Vote up or down"
		
		// registers those widgets that are Clickable with Display
		disp.redisplay();
	}
	
	
}
