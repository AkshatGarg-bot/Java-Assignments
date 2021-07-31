package base;
import test.*;
import derived.*;
import java.util.*;
public class Billing {
    private ArrayList<String> billings = new ArrayList<String>();
    void billTest(LabTest test) // called by Reception
    {  
       String id = test.get_testid();
       String space = " ";
       String price = Integer.toString(test.getPrice());
       String res = id+space+price;
       billings.add(res);
    }  
    public ArrayList<String> getBills() 
    {
        return billings; 
    }
}
// one string for each test
// each string has testId and billed amount, separated by a space
