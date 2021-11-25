package com.java8.stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		Stream.of(new Integer(10), new Integer(20)).skip(1).forEach(item -> System.out.println(item));
		;
		Stream.of("one", "two", "three", "four", "five").skip(2).forEach(item -> System.out.println(item));
		Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
				.peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
				.peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());
		
		Stream.of("one", "two", "three", "four").limit(2).forEach(item -> System.out.println(item));

		Integer[] numbers = { 2, 7, 11, 5, 18, 20, 67 };

		System.out.println("Stream.min():- " + Arrays.stream(numbers).min(Integer::compare).get());
		
		System.out.println("Stream.max():- " + Arrays.stream(numbers).max(Integer::compare).get());
		
		System.out.println("generate randaom numbers");
		Stream.generate(new Random()::nextInt).limit(5).forEach(System.out::println);
		

		Stream<Integer> integers = Stream.iterate(1, i -> i + 2);
	//	integers.limit(10).forEach(s->System.out.println(s));
		integers.limit(10).forEach(System.out::println);
	}

}
