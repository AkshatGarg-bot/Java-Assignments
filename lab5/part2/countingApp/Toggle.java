package countingApp;
import display.*;
import widgets.*;
import java.lang.Math;
public class Toggle extends Button {
	private static String text = "Up";
	private static String previous ="0";
	Toggle(int height,int width)
	{
		super(text,height,width);
	}
	@Override
	public void draw()
	{
		if(previous.equals(text) == false)
		{
			int radius = Math.min(super.getWidth(),super.getHeight())/2;
			Location l  = this.getPos();
			Display.drawCircle(l.getX()+radius,l.getY()+radius,radius);
			Display.drawText(l.getX(),l.getY(),text);
			setPrevious(text);
		}
	}
	public static void setRes(String r) {
		text = r;
	}
	public static void setPrevious(String p) {
		previous = p;
	}
	@Override
	public void handleClick()
	{
		String text = super.getText();
			if(text.equals("Up"))
			{
				text = "Down";
				setRes(text);
				setPrevious("Up");
			}
			else if(text.equals("Down"))
			{
				text = "Up";
				setRes(text);
				setPrevious("Down");
			}
	}
	public static String getResult()
	{
		return text;
	}
	public static String getPrevious()
	{
		return previous;
	}
	// redefines draw so that it draws a circular outline 
	// (instead of the default rectangular outline of Button)
	// "position" of Toggle is defined as the lower left corner of the
	// box that would enclose the circle
	
	
	
	// Toggles its state on each click. 
	// Displays the text "Up" or "Down" accordingly
	

	// has a method to get its current state
	
	
}
