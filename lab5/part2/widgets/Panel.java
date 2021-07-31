package widgets;
import java.util.*s;
public class Panel extends Widget {
	private ArrayList<Widget> widgets = new ArrayList<>();
	private static int count = 0; 
	public Panel(int width,int height)
	{
		super(width, height);
	}
	public void addWidget(Widget w, Location pos) {
		// add a child widget
		// position of lower left of child is at pos in Panel coordinates
		w.setPos(pos);
		widgets.add(w);
	}
	ArrayList<Widget> getList()
	{
		return widgets;
	}
	@Override
	public void draw()
	{
		if(count<1)
		{
			Display.drawBox(super.getPos().getX(),super.getPos().getY(),super.getWidth()+super.getPos().getX(),super.getHeight()+super.getPos().getY());
		}
		count++;
		for(int i=0;i<widgets.size();i++)
		{
			widgets.get(i).draw();
		}
	}
	// implements/overrides draw. Draws a box corresponding to its size and
	// calls draw on each child widget
}
