package derived;
import test.*;
import base.*;
import java.util.*;
public class BioChemLab extends Lab{
	private static int number = 0;
	private static int n = 99;
	private static Dispatch disp;
	public void addTest(BioChemTest test) {	
		// generates testId, the report, 
		// and then sends it to Dispatch using processReport
		number++;
		n++;
		test.set_result(Integer.toString(n));
		String type = "B";
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
