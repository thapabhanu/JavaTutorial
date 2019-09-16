package com.oops;

interface AInterface {

	String aMethod();
}

class AClass implements AInterface {

	public String aMethod() {
		return "AClass aMethod()";
	}
}

class AAClass extends AClass {

	@Override
	public String aMethod() {
		return "AAClass aMethod()";
	}
}

public class ParentChildRelation {
	public static void main(String[] args) {

		AInterface obj1 = new AClass();
		System.out.println(obj1.aMethod());
		
		AInterface obj2 = new AAClass();
		System.out.println(obj2.aMethod());	
		
		AClass obj3 = new AAClass();
		System.out.println(obj3.aMethod());		
	}
}
