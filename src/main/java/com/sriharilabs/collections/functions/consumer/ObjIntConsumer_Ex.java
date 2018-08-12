package com.sriharilabs.collections.functions.consumer;

import java.util.function.ObjIntConsumer;
class Employee{
	String name;
	public Employee(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
}

public class ObjIntConsumer_Ex {

	
	public static void main(String[] args) {

		ObjIntConsumer<Employee> obj= (Employee s,int i)-> System.out.println(s.toString()+"    "+i);
		
		obj.accept(new Employee("GSHP"), 32);
	}

}
