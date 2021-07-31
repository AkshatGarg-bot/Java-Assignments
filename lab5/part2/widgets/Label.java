package widgets;
import countingApp.*;
import display.*;
public class Label extends Widget {  // does not react to mouse events
	// has a text string as data - which is provided at create time
	// width and height are determined from this
	// assume each character is 5 units wide and 10 units high
	// provides methods to get text
	private String text;
	private static int count = 0;
	public Label(String text)
	{
		super(5,10);
		this.text = text;
	}
	public String getText()
	{
		return text;
	}
	@Override
	public void draw()
	{
		if(count < 1)
		{
			Display.drawText(super.getPos().getX(),super.getPos().getY(),text);
		}
		count++;
	}

}
