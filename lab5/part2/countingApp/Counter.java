package countingApp;
import widgets.*;
import display.*;
public class Counter extends Button {
	private static String res = "0";
	private static String previous = "x";
	Counter(int height,int width)
	{
		super(res, width, height);
	}
	
	// has a reference to an instance of Toggle button
	
	
	 // Everytime it is clicked, it increments or decrements counter by 1
	// depending on state of the Toggle instance
	

	// Shows the current count as its text
	@Override
	public void draw()
	{
		if(previous.equals(res) == false)
		{
			Location l = super.getPos();
			Display.drawBox(l.getX(),l.getY(),super.getHeight()+l.getX(),super.getWidth()+l.getY());
			Display.drawText(l.getX(),l.getY(),res);
			previous = res;
		}	
	}
	public static void setPrevious(String p) {
		previous = p;
	}
	public static String getRes() {
		return res;
	}
	public static void setRes(String r) {
		res = r;
	}
	@Override
	public void handleClick()
	{
			String text = getRes();
			int i=Integer.parseInt(text);
			String result = Toggle.getResult();
			if(result.equals("Up"))
			{
				setPrevious(Integer.toString(i));
				i=i+1;
				setRes(Integer.toString(i));
			}
			else if(result.equals("Down"))
			{
				setPrevious(Integer.toString(i));
				i=i-1;
				setRes(Integer.toString(i));
			}
	}
	
}
