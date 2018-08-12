package com.sriharilabs.optional;

import java.util.Optional;

public class CreateOptional {

	
	public static void way1_empty() {
		Optional<String> opt=Optional.empty();
		System.out.println(opt.toString());
	}
	
	public static void way2_of() {
		Optional<String> opt=Optional.of("Srihari");
		System.out.println(opt.toString());
	}
	
	public static void way3_of() {
		String nullableString = "";
		Optional<String> opt=Optional.ofNullable(nullableString);
		System.out.println(opt);
	}
	public static void main(String[] args) {

		//way1_empty();
		
		 way2_of();
		 way3_of();
	}

}
