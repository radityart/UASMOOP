package com.example.uas.resources.BaseStats;

import java.util.ArrayList;
import java.util.List;

public class Player {
	public String name;
	public Castle castle;
	public List<Hero> heroes = new ArrayList<>();
	public Player(String name, Castle castle) {
		this.name = name;
		this.castle = castle;
	}

	public String getName() {
		return name;
	}

	public Castle getCastle() {
		return castle;
	}
}
