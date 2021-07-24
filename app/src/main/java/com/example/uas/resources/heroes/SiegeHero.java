package com.example.uas.resources.heroes;
import com.example.uas.resources.BaseStats.Hero;

public class SiegeHero extends Hero {
	public SiegeHero(int HeroLvl) {
		this.UnitType = "siege";
		this.Damage = 60;
		this.Skill = 60;
		this.HeroLvl = HeroLvl;
	}
}
