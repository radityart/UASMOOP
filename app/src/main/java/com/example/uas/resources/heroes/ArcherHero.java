package com.example.uas.resources.heroes;
import com.example.uas.resources.BaseStats.Hero;

public class ArcherHero extends Hero {
	public ArcherHero(int HeroLvl) {
		this.UnitType = "archer";
		this.Damage = 100;
		this.Skill = 40;
		this.HeroLvl = HeroLvl;
	}
}
