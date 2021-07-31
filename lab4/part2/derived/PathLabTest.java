package derived;
import test.*;
import base.*;
import java.util.*;
public class PathLabTest extends LabTest{
    private int price;
    public PathLabTest(String patientId)   /* and any other arguments needed */
    {
        super(patientId);
        this.price = 1000;
    }
    @Override
    public int getPrice()
    {
        return this.price;
    }
}
