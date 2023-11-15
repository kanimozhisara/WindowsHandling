package com.test;

import org.testng.annotations.Test;

public class SampleAutosugg  {

	@Test(groups = "sanity")
	private void tc1() {
		System.out.println("tc1");
	}
	@Test(groups = "smoke")
	private void tc2() {
		System.out.println("tc2");
	}
	@Test(groups = "regression")
	private void tc3() {
		System.out.println("tc3");
	}
	@Test(groups = "E2E")
	private void tc4() {
		System.out.println("tc4");
	}
}
