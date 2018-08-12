package com.sriharilabs.collections.functions.consumer;

import java.util.function.Consumer;

/**    T -> Nothing
 *  Consumer interface represents an operation that accepts a single input argument and returns no result.
 * @author srihari
 *
 */
public class Consumer_Example {

	public static void main(String[] args) {

		
		Consumer consumer= s-> System.out.println(s);
		Consumer<String> consumer1=(String s)-> System.out.println(s);
		
		consumer.accept("srihari");
		consumer1.accept("prasad");
		
	}

}
