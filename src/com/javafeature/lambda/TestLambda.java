package com.javafeature.lambda;

@FunctionalInterface
interface NumberTest {
	boolean coumputTest(int n);

}

@FunctionalInterface
interface Greeting{
	String sayGreetings(String str);
}

public class TestLambda {

	// create one functional interface
	// have method with return boolean and takes one int as parameter

	// call that interface and provide number is iseven and isnagative

	public static void main(String[] args) {
		
		NumberTest iseven = (n) -> (n % 2) == 0;
		NumberTest isNagative = (n) -> (n < 0);
		
		System.out.println(iseven.coumputTest(5));
		System.out.println(isNagative.coumputTest(-10));
		
		Greeting morning = (str) -> {
			return "Good Morning" +  str;
		};
		
		Greeting eveing = (str) -> {
			return "Good Evening" +  str;
		};
		
		
		System.out.println(morning.sayGreetings("Jessica!"));
		System.out.println(eveing.sayGreetings("Luis!"));
		// Output: Good Evening Jessica!
		// Output: Good Morning Luis! 

	}

}
