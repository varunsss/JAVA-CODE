package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Bicycle1 {
	 String brand;

	    public Bicycle1(String brand) {
	        this.brand = brand;
	    }

		@Override
		public String toString() {
			return "Bicycle1 [brand=" + brand + "]";
		}
	    
}

 public class Bicycle{
	public static void main(String[] args) {
		// Use a method reference to the constructor
		List<String> bikeBrands = Arrays.asList("Trek", "Giant", "Specialized");
		List<Bicycle1> bikes = bikeBrands.stream().map(Bicycle1::new) // Method reference to constructor
		                                .collect(Collectors.toList());
		System.out.println(bikes);
		
		Bicycle1[] bikeArray = bikeBrands.stream()
                .map(Bicycle1::new)
                .toArray(Bicycle1[]::new);
		System.out.println(bikeArray.);
		System.out.println(bikeArray[0]);
	}
}
