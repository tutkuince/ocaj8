package com.oracle.javacert.associate.chapter04._01methods;

public class ParameterList {
	public void walk1() {}
	// public void walk2 {}					=> DOES NOT COMPILE
	public void walk3(int a) {}	
	// public void walk4(int a; int b) {}	=> DOES NOT COMPILE
	public void walk5(int a, int b) {}
}
