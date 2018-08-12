package com.sriharilabs.optional;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class OptionalIntExample {

	public static void main(String[] args) {

		
		 OptionalInt maxOdd = IntStream.of(10, 20, 30).filter(n -> n % 2 == 1).max();
		 maxOdd.ifPresent(t->System.out.println("Nothing:: " +t));
		 
		 OptionalInt max = IntStream.of(10, 20, 30).max();
		 max.ifPresent(t->System.out.println(t));
	}

}
