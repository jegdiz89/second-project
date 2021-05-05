package org.group;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = "smoke")
	private void tc0() {
		System.out.println("Method 1");
	}
	
	@Test(groups = "reg")
	private void tc1() {
		Assert.assertTrue(false);
		System.out.println("Method 2");
	}
	
	@Test(groups = "smoke")
	private void tc2() {
		System.out.println("Method 3");
	}
	
	@Test(groups = "sanity",dependsOnGroups="smoke")
	private void tc3() {
		System.out.println("Method 4");
	}
	
	@Test(groups = "E2E")
	private void tc4() {
		System.out.println("Method 5");
	}
	
	@Test(groups = "sanity")
	private void tc5() {
		System.out.println("Method 6");
	}
	@Test(groups = "reg")
	private void tc6() {
		System.out.println("Method 7");
	}

}
