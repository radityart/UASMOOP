package com.example.uas.resources.heroes;
import com.example.uas.resources.BaseStats.Hero;

public class CavalryHero extends Hero {
	public CavalryHero(int HeroLvl) {
		this.UnitType = "cavalry";
		this.Damage = 60;
		this.Skill = 60;
		this.HeroLvl = HeroLvl;
	}
}
