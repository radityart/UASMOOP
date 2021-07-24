package com.example.uas.resources.armies;

import com.example.uas.resources.BaseStats.Unit;

public class Cavalry extends Unit{
	public Cavalry(boolean HeroBoost, boolean CastleBoost, int size) {
		this.UnitType = "cavalry";
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
