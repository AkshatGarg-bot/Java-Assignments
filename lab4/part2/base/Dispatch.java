package base;
import test.*;
import derived.*;
import java.util.*;
public class Dispatch {
    private ArrayList<String> report = new ArrayList<>();
    private String rep;
    public void processReport(LabTest test)     // called by individual labs
    {  
       String s1 = test.getPatientId();
       String s2 = test.get_testid();
       String s3 = test.getResult();
       String space = " ";
       this.rep = s1+space+s2+space+s3;
       report.add(rep);
    } 
    public ArrayList<String> getAllResults()
    {
        return report; 
    }
}
