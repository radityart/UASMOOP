package com.example.uas.resources.armies;

import com.example.uas.resources.BaseStats.Unit;

public class Archer extends Unit{
	public Archer(boolean HeroBoost, boolean CastleBoost, int size) {
		this.UnitType = "archer";
		this.UnitSize = size;
		this.Damage = 40*size;
		this.Skill = 20*size;
		if(HeroBoost) {
			Damage = ((Damage*40)/100) + Damage;
		}
		if(CastleBoost) {
			Skill = (Skill*20)/100 + Skill;
		}

	}
}
