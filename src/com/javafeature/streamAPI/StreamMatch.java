package com.javafeature.streamAPI;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamMatch {

	public static void main(String[] args) {

		// Find out if the array contains number 4;
		Stream<Integer> num = Stream.of(2, 3, 4, 5, 6, 7);
		System.out.println("Stream has number 4: " + num.anyMatch(i -> i == 4));

		Stream<Integer> num10 = Stream.of(2, 3, 4, 5, 6, 7);
		System.out.println("Stream has all number under 6: " + num10.allMatch(i -> i < 6));

		Stream<Integer> num5 = Stream.of(2, 3, 4, 6, 7);
		System.out.println("Stream doesn't contain 5 ? : " + num5.noneMatch(i -> i == 5));

		Stream<String> obj = Stream.of("Eve", "David", "Lisa", "Josh", "Don");

		Optional<String> firstnameWithD = obj.filter(i -> i.startsWith("D")).findFirst();

		if (firstnameWithD.isPresent()) {
			System.out.println("First Name with " + firstnameWithD.get());
		}

	}

}
