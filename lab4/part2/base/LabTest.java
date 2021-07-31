package base;
import test.*;
import derived.*;
import java.util.*;
public class LabTest {
    private String patientId;
    private String TestID;
    private String result;
    public LabTest(String patientId) // note that this should never get called explicitly
    {
        this.patientId=patientId;
    }   
    public String getPatientId() 
    {
         return patientId; 
    }
    public int getPrice()
    {
        if(Reception.parameter == 0)
        {
            return 1000;
        }
        else if(Reception.parameter == 1)
        {
            return 400;
        }
        else
        {
            return 0;
        }
    }
    public String get_testid()
    {
        return TestID;
    }
    public void set_testid(String t)
    {
        this.TestID = t;
    }
    public void set_result(String result)
    {
        this.result = result;
    }
    public String getResult() 
    {
        return result;
    }
}
