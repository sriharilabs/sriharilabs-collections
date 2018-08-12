package com.sriharilabs.optional;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;

public class OrElseGet_And_OrElse {

	public String getMyDefault() {
	    System.out.println("Getting Default Value");
	    return "Default Value";
	}
	String text=null;
	@Test
	public void whenOrElseGetAndOrElseOverlap_thenCorrect() {
	    
	 
	    System.out.println("Using orElseGet:");
	    String defaultText = 
	      Optional.ofNullable(text).orElseGet(this::getMyDefault);
	    assertEquals("Default Value", defaultText);
	 
	    System.out.println("Using orElse:");
	    defaultText = Optional.ofNullable(text).orElse(getMyDefault());
	    assertEquals("Default Value", defaultText);
	}
}
