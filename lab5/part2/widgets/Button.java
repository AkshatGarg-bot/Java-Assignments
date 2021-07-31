package widgets;
public abstract class Button extends Widget implements Clickable {
	private String text;
	public Button(String text, int width, int height) { 
		super(width, height);
		this.text = text;
	}
	public void setText(String text)
	{
		this.text = text;
	}
	public String getText()
	{
		return text;
	}
	public int getWidth()
	{
		return super.getWidth();
	}
	public int getHeight()
	{
		return super.getHeight();
	}
	abstract public void draw();
	abstract protected void handleClick(); //should we make this abstract?
	@Override
	public void onClick(Location p)
	{
		Location l = super.getPos();
		int x0 = l.getX();
		int y0 = l.getY();
		int w = super.getWidth();
		int h = super.getHeight();
		int x1 = x0+w;
		int y1 = y0+h;
		int x_check = p.getX();
		int y_check = p.getY();
		if(x_check >= x0 && x_check<=x1 && y_check>=y0 && y_check<=y1)
		{
			handleClick();
		}
	}
}

	// has methods to get/set text
	
	// implements/overrides draw to draw a box at the correct position and size
	// and displays the text of the button
	

	// implement the onClick method to check if the click is within its bounds
	// and if so, invokes protected method handleClick
