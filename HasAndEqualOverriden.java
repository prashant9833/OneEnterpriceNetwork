package com.demo.one;

import java.util.*;

public class HasAndEqualOverriden {

	public static void main(String[] args) {

		HashMap m1=new HashMap();
		
		Employee e1=new Employee(1);
		Employee e2=new Employee(1);
		
		m1.put(e1,"Prashant");
		m1.put(e2,"Prashant");
		
		System.out.println(m1.size()); //2 <-----Before Override equals() & hashCode() in Emplyoee class. 
                                       //1 <-----After Override equals() & hashCode() in Emplyoee class.
		HashMap m2=new HashMap();
		
		Integer i1=new Integer(1);
		Integer i2=new Integer(1);
		
		m2.put(i1,"Prashant");
		m2.put(i2,"Prashant");
		
		System.out.println(m2.size()); //1
	}

}

class Employee{
	
	int empid;
	
	public Employee(int empid){
		
		this.empid=empid;
	}
	
	public String toString(){
		
		return empid+"";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		return true;
	}
	
	
	
}