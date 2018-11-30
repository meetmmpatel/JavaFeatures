package com.javafeature.lambda;

@FunctionalInterface
interface MyString{
	String myStrFunctions(String str);
}

public class LambdaBlock {
	
	//"Lambda Demo"
	// Output: omeD adbmaL
	
	public static void main(String[] args) {
		String str = "Lambda Demo";
		
		String obj = new StringBuffer(str).reverse().toString();
		System.out.println(obj);
		
		
		MyString reverString = (strOne) -> {
			
			strOne = new StringBuffer(strOne).reverse().toString();
			return strOne;
		};
		
		System.out.println(reverString.myStrFunctions("Lambda Demo"));
		
		
		String result = "";
		
		for (int i = str.length() -1; i >= 0; i--) {
			result += str.charAt(i);
		}
		
		System.out.println(result);
		
	}

}
