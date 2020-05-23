package RerunTestcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Automatic2 implements IRetryAnalyzer {

	int minCount=0, maxCount=10;
	public boolean retry(ITestResult arg0) {
		if(minCount<maxCount) {
			minCount++;
			return true;
		}			
		return false;
	}
}
