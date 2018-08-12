package com.sriharilabs.collections.functions.consumer;

import java.util.function.BiConsumer;

public class BiConsumer_Example {

	public static void main(String[] args) {

		BiConsumer<String,String> b=(String s1,String s2) -> System.out.println(s1+"  "+s2);
		
		b.accept("srihari", "prasad");
	}

}
