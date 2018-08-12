package com.sriharilabs.optional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Test;

public class WithEmployee {
	
	
	class Employee{
		Optional<String> name;
		public Optional<String> getName() {
			return name;
		}
		public Employee(){
			
		}
		public Employee(Optional<String> name) {
			this.name = name;
		}
	}
	public static void main(String[] args) {
		WithEmployee emp=new WithEmployee();
		Optional<Employee> opt=Optional.of(emp.new Employee());
		
		Optional<String> ss=Optional.of("nothing");
		//opt.ifPresent(e-> Optional.ofNullable(e.getName()).orElseGet("ss"));
		
	}

}
