package com.javafeature.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListWithLambda {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Rick");
		list.add("Negan");
		list.add("Daryl");
		list.add("Glenn");
		list.add("Carl");
		// each elements at time
		list.forEach((abc) -> System.out.println(abc));

		// this is entire
		System.out.println(list);

		// Map interface
		Map<String, Integer> prices = new HashMap<>();
		prices.put("Apple", 50);
		prices.put("Orange", 20);
		prices.put("Banana", 10);
		prices.put("Grapes", 40);
		prices.put("Papaya", 50);

		prices.forEach((K, V) -> System.out.println("Product  " + K + "Price" + V));

	}

}
