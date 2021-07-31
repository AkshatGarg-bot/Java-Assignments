
class TextFile extends File {
	// add constructor - takes name and String text. 
    String name;
    String text;
    TextFile(String name , String text)
    {
        super(name);
        this.text = text;
    }
    String getText() 
    { 
        return this.text;
    }
	
	// redefine getSize. 
	// Size can be computed as length of the string, converted to bytes plus the overhead	
}
