package com.example.uas.resources.heroes;
import com.example.uas.resources.BaseStats.Hero;
public class InfantryHero extends Hero {
	public InfantryHero( int HeroLvl) {
		this.UnitType = "infantry";
		this.Damage = 40;
		this.Skill = 100;
		this.HeroLvl = HeroLvl;
	}
}
