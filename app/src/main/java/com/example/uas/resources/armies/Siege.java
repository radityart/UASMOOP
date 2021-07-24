package com.example.uas.resources.armies;

import com.example.uas.resources.BaseStats.Unit;

public class Siege extends Unit{
	public Siege(boolean HeroBoost, boolean CastleBoost, int size) {
		this.UnitType = "siege";
		this.UnitSize = size;
		this.Damage = 30*size;
		this.Skill = 30*size;
		if(HeroBoost) {
			Damage = (Damage*40)/100 + Damage;
		}
		if(CastleBoost) {
			Skill = (Skill*20)/100 + Skill;
		}
	}
}
