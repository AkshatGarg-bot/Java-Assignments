package derived;
import test.*;
import base.*;
import java.util.*;
public class PathLab extends Lab{
	private static int number = 0;
	private static Dispatch disp;
    	public void addTest(PathLabTest test) {   
		// generates testId, the report, 
		// and then sends it to Dispatch using processReport
		number++;
		if(number%3 ==0)
		{
			test.set_result("malignant");
		}
		else {
			test.set_result("benign");	
		}
		String type = "P";
		String id = Integer.toString(number);
		String TestID = type+id;
		test.set_testid(TestID);
		disp.processReport(test);
		
	}
	public void setDis(Dispatch d)
	{
		disp = d;
	}
}
