package base;
import test.*;
import derived.*;
import java.util.*;
public class Reception {
    private static int ID = 0;
    private  BioChemTest b;
    private  PathLabTest p;
    public static int parameter = 0;
    public boolean addRequest(String testType, String patientName){    
		// should create the appropriate sub-type of LabTest, 
		// add that to Billing and 
		// then to the specific lab, after generating a patient ID
        ID++;
        String patientID = Integer.toString(ID);
        if(testType.equals("Bio"))
        {
            parameter = 1;
            LabTest test = new LabTest(patientID);
            b = new BioChemTest(patientID);
            test = b;
            Lab4B.getLab().getTests().add(test);
            Lab4B.getBilling().billTest(test);
            Lab4B.getBioLab().setDis(Lab4B.getDispatch());
            Lab4B.getBioLab().addTest(b);
        }
        else if(testType.equals("Path"))
        {
            parameter = 0;
            LabTest test = new LabTest(patientID);
            p = new PathLabTest(patientID);
            test = p;
            Lab4B.getLab().getTests().add(test);
            Lab4B.getBilling().billTest(test);
            Lab4B.getPathLab().setDis(Lab4B.getDispatch());
            Lab4B.getPathLab().addTest(p);
        }
		return true; 	
    }
}
