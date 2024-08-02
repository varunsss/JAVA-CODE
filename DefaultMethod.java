package com.stream;

@FunctionalInterface
public interface DefaultMethod {
	// Default Method - Optional can be 0 or more 
	public default String HelloWorld() { 
	return "Hello World"; 
	} 
	// Single Abstract Method 
	public void bar(); 
}
