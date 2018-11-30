package com.javafeature.lambda;

@FunctionalInterface
interface MyGenerics<T> {

	T compute(T t);

}

public class GenericsLambda {

	public static void main(String[] args) {

		MyGenerics<String> strMethod = (str) -> {
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);

			return result;
		};

		MyGenerics<Integer> factorial = (Integer n) -> {
			int result = 1;

			for (int i = 1; i <= n; i++)
				result = i * result;

			return result;
		};
		
		System.out.println(strMethod.compute("Demo"));
		System.out.println(factorial.compute(5));
		

	}
}
