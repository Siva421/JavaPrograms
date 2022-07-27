package com.exer;

import java.util.TreeMap;

public class TmPlayers {
	public static void main(String[] args) {
		TreeMap<Object, Object> players = new TreeMap<Object, Object>();
		players.put("1988-7-7", "Dhoni");
		players.put("1986-6-18", "Kohli");
		players.put("1985-2-21", "Shreyas");
		players.put("1985-1-1", "K.L.Rahul");

		System.out.print(players);

	}

}
