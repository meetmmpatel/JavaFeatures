package com.javafeature.methodReference;

@FunctionalInterface
interface BaseDemoInterface {
	void display();
}

public class BaseDemo {

	/**
	 * 1. Method reference to an instance method of an object –
	 * object::instanceMethod 2. Method reference to a static method of a class –
	 * Class::staticMethod 3. Method reference to an instance method of an arbitrary
	 * object of a particular type – Class::instanceMethod 4. Method reference to a
	 * constructor – Class::new
	 */

	public void myMethod() {

		System.out.println("Instatnce method");
	}

	public static void main(String[] args) {

		BaseDemo demo = new BaseDemo();

		BaseDemoInterface ref = demo:: myMethod;

		ref.display();
	}

}
