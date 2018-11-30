package com.javafeature.lambda;



@FunctionalInterface
interface MyInterface{
	public String sayhello();
	
}

@FunctionalInterface
interface MyInterfaceTwo{
	public int incrementbyfive(int a);
	
}

@FunctionalInterface
interface MyInterfaceThree{
	public String incrementbyfive(String a, String b);
	
}
public class LambdaWithInterface {
	
	public static void main(String[] args) {
		
		MyInterface message = () ->{
			return "hello";
		};
		
		MyInterfaceTwo two = (num) -> {
			return num + 5;
		};
		
		MyInterfaceThree three = (str1 , str2) -> {
			return str1 + str2;
		};
		
		System.out.println(three.incrementbyfive("Test", "lambda"));
		
		System.out.println(two.incrementbyfive(20));
		
	}

}
