package com.javafeature.lambda;

interface myInterfaceSum<T> {
	T myStirngFunction(T foo);

}

public class LambdaArguments {

	public static void main(String[] args) {

		myInterfaceSum<String> strFunction = (str) -> {
			String returnStr = "Demo ";
			returnStr = new StringBuffer(returnStr).reverse().toString();
			return returnStr;
		};

		System.out.println(returnStr(strFunction, "Demo"));
	}

	// Example of Lambda as method parameters
	public static String returnStr(myInterfaceSum strFunction, String str) {

		return (String) strFunction.myStirngFunction(str);

	}

}
