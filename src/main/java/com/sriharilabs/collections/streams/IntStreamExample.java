package com.sriharilabs.collections.streams;

import java.util.stream.IntStream;

public class IntStreamExample {

	public static void way1_range(){
		IntStream is=IntStream.range(0, 10);
        is.forEach(ins->System.out.println(ins));
	}
	
	public static void way2_range(){
		IntStream is=IntStream.of(1,2,3,4,5,6,90,0,100);
		
	}
	public static void main(String[] args) {

		way1_range();
	}

}
