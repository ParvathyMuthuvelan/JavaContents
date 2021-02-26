/*Write a program that construts a hashmap and returns the value 
 corresponding to the largest key.
 */
package com.training.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class MapDemo {

	static int findValue(Map<Integer, Integer> inputMap) {
		int maxKey = 0, maxValue = 0, key;
		for (Entry<Integer, Integer> entry : inputMap.entrySet()) {
			key = entry.getKey();
			if (key > maxKey) {
				maxKey = key;
			}
		}
		maxValue = inputMap.get(maxKey);
		return maxValue;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		int key, value;
		Map<Integer, Integer> map = new HashMap<>();
		System.out.println("Enter the number of entries");
		n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			key = scanner.nextInt();
			value = scanner.nextInt();
			map.put(key, value);
		}
		int result = MapDemo.findValue(map);
		System.out.println("Value of largest key=" + result);
	}

}
