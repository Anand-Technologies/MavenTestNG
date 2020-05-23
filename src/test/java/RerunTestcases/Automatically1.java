package RerunTestcases;



import org.testng.Assert;
import org.testng.annotations.Test;

public class Automatically1 {

	@Test
	public void  tc1() {
		Assert.assertTrue(true);
		Assert.assertTrue(true);		
	}
	
	@Test(retryAnalyzer=Automatic2.class)
	public void tc2() {
		Assert.assertTrue(true);
		Assert.assertTrue(false);
	}
}
