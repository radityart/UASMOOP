package com.example.uas.resources.BaseStats;

public class Unit {
	public String UnitType;
	public int Damage;
	public int Skill;
	public int UnitSize;
	public boolean HeroBoost = false;
	public boolean CastleBoost = false;

	public int getUnitSize() {
		return UnitSize;
	}

	public int getDamage() {
		return Damage;
	}
}
