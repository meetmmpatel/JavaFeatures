package com.javafeature.methodReference;

import java.util.function.BiFunction;
import java.util.function.Consumer;

interface InterfaceMethodReferenceWithStatic {
	public static int getMultipy(int a, int b) {
		return a * b;
	}

}

public class MethodReferenceWithStatic {
	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> obj = 
				InterfaceMethodReferenceWithStatic::getMultipy;
		int values = obj.apply(10, 10);
		System.out.println(values);

		Consumer<String> c = s -> System.out.println(s);
		Consumer<String> c1 = System.out::println;

		c.accept("Lambda");
		c1.accept("Test");

	}

}
