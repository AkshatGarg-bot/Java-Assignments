class ImageFile extends File {
	// add constructor - takes name, image width, image (char array) - compute size from this array
	private double width;
    private char[] image;
	ImageFile(String name,double width,char[] arr) {
        super(name);
        this.width = width;
        this.image = arr;
	}
	// redefine getSize. Size can be computed as size of the image array plus overhead
	char[] getImage()
    {
        return this.image;
    }
    @Override
    int getSize(){
        return image.length+super.getSize();
}}