package com.sriharilabs.optional;

import java.util.Optional;

public class IfPresentOptional {

	
	
	public static void way1_empty() {
		Optional<String> opt=Optional.empty();
		//System.out.println(opt.get());  //java.util.NoSuchElementException: No value present
		opt.ifPresent(str->System.out.println(str));
	}
	
	public static void way1_Of() {
		Optional<String> opt=Optional.of("Srihari");
		opt.ifPresent(str->System.out.println(str));
	}
	
	public static void way2_Of() {
		Optional<String> opt=Optional.of("Srihari");
		 
		if(opt.isPresent()) {
			System.out.println(opt.get());
		}
	}
	
	
	public static void way3_Of() {
		
		Optional<String> opt=Optional.empty();
		//Optional<String> opt=Optional.of("srihari");

		String s=opt.orElse("default value");
		
		System.out.println(s);
	}
	public static void main(String[] args) {
		way1_empty();
		way3_Of();
	}

}
