package derived;
import test.*;
import base.*;
import java.util.*;
public class BioChemTest extends LabTest{
    private int price;
    public BioChemTest(String patientId )   /* and any other arguments needed */
    {
        super(patientId);
	this.price = 400;
    }
    @Override
    public int getPrice()
    {
        return this.price;
    }
}
