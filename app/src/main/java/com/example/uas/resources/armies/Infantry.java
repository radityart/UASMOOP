package com.example.uas.resources.armies;

import com.example.uas.resources.BaseStats.Unit;

public class Infantry extends Unit{
	public Infantry(boolean HeroBoost, boolean CastleBoost,int size) {
		this.UnitType = "infantry";
		this.UnitSize = size;
		this.Damage = 20*size;
		this.Skill = 50*size;
		if(HeroBoost) {
			Damage = (Damage*40)/100 + Damage;
		}
		if(CastleBoost) {
			Skill = (Skill*20)/100 + Skill;
		}
	}
}
