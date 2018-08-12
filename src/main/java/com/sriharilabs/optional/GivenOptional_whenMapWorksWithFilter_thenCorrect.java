package com.sriharilabs.optional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Test;

public class GivenOptional_whenMapWorksWithFilter_thenCorrect {
	@Test
	public void givenOptional_whenMapWorksWithFilter_thenCorrect() {
	    String password = " password ";
	    Optional<String> passOpt = Optional.of(password);
	    boolean correctPassword = passOpt.filter(
	      pass -> pass.equals("password")).isPresent();
	    assertFalse(correctPassword);
	 
	    correctPassword = passOpt
	      .map(String::trim)
	      .filter(pass -> pass.equals("password"))
	      .isPresent();
	    assertTrue(correctPassword);
	}
	
}
