package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Demo {

	@Test
	public void login1() {

		String exp_Username = "Saravanan";
		
		String act_Username = "Saravanan";
		
		Assert.assertEquals(act_Username, exp_Username);
			
	}
	@Test(retryAnalyzer = Rerun.class)
	public void login2() {

		String exp_Password = "we345";
		
		String act_Password = "vn532";
		
		Assert.assertEquals(act_Password, exp_Password);
	}
	
	
	
	
	
	
	
	
}
