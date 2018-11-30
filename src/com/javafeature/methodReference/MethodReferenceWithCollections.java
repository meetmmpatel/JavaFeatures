package com.javafeature.methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@FunctionalInterface
interface MethodReferenceWithCollectionsInterface{
	MethodReferenceWithCollections display (String hello);
}

public class MethodReferenceWithCollections {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		Optional<Integer> max = list.stream().reduce(Math::max);
		max.ifPresent(System.out::println);

		String[] strArray = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon" };

		Arrays.sort(strArray, String::compareToIgnoreCase);

		for (String str : strArray) {
			System.out.println(str);
		}
		
		MethodReferenceWithCollectionsInterface ref = 
				MethodReferenceWithCollections::new;
		
		ref.display("Hello Method Reference");

	}
	
	public MethodReferenceWithCollections(String sayhello) {
		 System.out.println(sayhello);
		
	}
	

}
