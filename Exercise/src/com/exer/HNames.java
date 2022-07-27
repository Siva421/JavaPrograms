package com.exer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class HNames {
	public static void main(String[] args) {
		HashMap<Integer, String> name = new HashMap<Integer, String>();
		name.put(121, "Siva");
		name.put(122, "Pavan");
		name.put(125, "Chandu");
		name.put(121, "Teja");
		name.put(123, "Abhi");

		System.out.println(name);
		System.out.println(name.get("Siva"));
		System.out.println(name.containsKey("Abhi"));
		System.out.println(name.containsValue(124));

	}

}
