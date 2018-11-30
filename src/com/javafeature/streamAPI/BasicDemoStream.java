package com.javafeature.streamAPI;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicDemoStream {

	public static void main(String[] args) {

		Stream<Integer> streamOne = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		streamOne.forEach(p -> System.out.println("For each method: " +  p));
		
		Stream<Integer> streamTwo = Stream.of(new Integer[] {23,3,4,56,43,56});
		streamTwo.forEach(p -> System.out.println(p));
		
		List<Integer> list = new ArrayList<Integer>();
		  for (int i = 0; i <= 10; i ++) {
			  list.add(i);  
		  }
		
		Stream<Integer> obj3 = list.stream();
		obj3.forEach(p -> System.out.println("List element is: "+ p));
		
		
		Stream<LocalDate> date = Stream.generate(()-> {return LocalDate.now();});
//		date.forEach(p -> System.out.println(p));
		
		//Stream with char print ASCII value
		IntStream obj4 = "12345_ABCDEF".chars();
		obj4.forEach(p1 -> System.out.println("Ascii values" + p1));
		
		
		//Stream with Regex
		Stream<String> obj5 = Stream.of("A$B$C".split("\\$"));
		obj5.forEach(p -> System.out.println(p));

		
		
		
		
		
	}

}
