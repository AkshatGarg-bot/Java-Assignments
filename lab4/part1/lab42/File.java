class File {
    String name;
    File(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
    int getSize() 
    { 
        return 32; 
    } // size of the file in bytes
	                              // Assume this is a fixed overhead for all types of files
	
    @Override
    public String toString() 
    { 
        return "Name : "+this.getName()+"Size : "+this.getSize();
    }
    // override the toString method to print out the name and size of the file
}

