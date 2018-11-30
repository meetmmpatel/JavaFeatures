package com.javafeature.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamArrayAndList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		// we going to add like 0 to 20 nubers in list (Only print even number)
		// we will convert into steam api
		// we will convert stream into list
		// we will convert stream into array

		for (int i = 1; i <= 20; i++) {
			list.add(i);
		}

		System.out.println("List numbers" + list);

		// Converting into Stream
		Stream<Integer> stream = list.stream();

		// Convert Stream into List with even number
		List<Integer> evenNumberList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println("Even Numbers List " + evenNumberList);

		// Convert Stream into array

		Stream<Integer> streamOne = list.stream();
		Integer[] evenNumberArray = streamOne.filter(i -> i % 2 == 0).toArray(Integer[]::new);

		for (Integer numOne : evenNumberArray) {
			System.out.println(numOne);
		}

	}

}
