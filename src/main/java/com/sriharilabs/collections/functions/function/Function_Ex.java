package com.sriharilabs.collections.functions.function;

import java.util.function.Function;

public class Function_Ex {

	public static void main(String[] args) {

		Function<String,String> f= (String s) ->   s.toString()+"  prasad";
		System.out.println(f.apply("g srihari"));
	}

}
