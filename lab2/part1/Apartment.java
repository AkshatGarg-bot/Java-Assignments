public class Apartment {
    Owner owner;
    int rent;
	Apartment(Owner owner, int rent) 
    {
        this.owner = owner;
        this.rent = rent;  
    }
	int getRent() 
    {
        return rent;
    }
	Owner getOwner() 
    {
        return owner; 
    }
	public static void main(String[] args) {
		
		Owner owner1 = new Owner("Jeff", 40);
		Owner owner2 = new Owner("Mukesh", 50);
		Owner owner3 = new Owner("Bill", 60);
		
		Apartment a1 = new Apartment(owner1, 4000);
		Apartment a2 = new Apartment(owner2, 6000);
		Apartment a3 = new Apartment(owner1, 1000);
		Apartment a4 = new Apartment(owner3, 9000);
		
		// create an array of Apartments and initialize to the above 4
		Apartment[] apartments = new Apartment[4];
        apartments[0] = a1;
        apartments[1] = a2;
        apartments[2] = a3;
        apartments[3] = a4;
		// find the apt with the hightest rent
     	Apartment max = apartments[0];
        for(int i = 1 ; i<4 ;i++)
        {
            if(apartments[i].getRent()>max.getRent())
                max = apartments[i];
        }
		
		// print the name of its owner (to System.out) 
		System.out.print((max.getOwner()).getname());		
	}
}
class Owner {
	String name;
    int age;
    Owner(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
	int getage()
    {
        return age;
    }
    String getname()
    {
        return name;
    }
}