package com.sriharilabs.optional;

import static org.junit.Assert.assertEquals;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.Test;

public class VariousMethods {

	/**
	 * NoSuchElementException
	 */
	
	@Test(expected = NoSuchElementException.class)
	public void givenOptionalWithNull_whenGetThrowsException_thenCorrect() {
	    Optional<String> opt = Optional.ofNullable(null);
	    String name = opt.get();
	}
	
	/**
	 * orElseThrow
	 * Very Imp
	 */
	@Test(expected = IllegalArgumentException.class)
	public void whenOrElseThrowWorks_thenCorrect() {
	    String nullName = null;
	    String name = Optional.ofNullable(nullName).orElseThrow(
	      IllegalArgumentException::new);
	}
	
	


	public String getMyDefault() {
	    System.out.println("Getting Default Value");
	    return "Default Value";
	}
	

	/**  case 1 :  with null
	 * orElseGet
	 * orElse
	 */
	@Test
	public void whenOrElseGetAndOrElseDiffer_thenCorrect1() {
	    String text = null;
	   System.out.println( "CASE 1   TEXT :: "+text);
	    System.out.println("Using orElseGet:");
	    String defaultText 
	      = Optional.ofNullable(text).orElseGet(this::getMyDefault);
	    assertEquals("Text present", defaultText);
	 
	    System.out.println("Using orElse:");
	    defaultText = Optional.ofNullable(text).orElse(getMyDefault());
	    assertEquals("Text present", defaultText);
	}
	
	/**  case 2 :  without null
	 * orElseGet
	 * orElse
	 */
	@Test
	public void whenOrElseGetAndOrElseDiffer_thenCorrect() {
		
	    String text = "Text present";
	    System.out.println( "CASE 2   TEXT :: "+text);
	    
	    System.out.println("Using orElseGet:");
	    String defaultText 
	      = Optional.ofNullable(text).orElseGet(this::getMyDefault);
	    assertEquals("Text present", defaultText);
	 
	    System.out.println("Using orElse:");
	    defaultText = Optional.ofNullable(text).orElse(getMyDefault());
	    assertEquals("Text present", defaultText);
	}
}
