package com.wesleyreisz.samples.patterns.decorator.coffee.condiments;

import com.wesleyreisz.samples.patterns.decorator.coffee.beverages.Beverage;

public class Expresso implements Condiments {
	private Beverage beverage;
	private double COST = .50;
	
	public  Expresso(Beverage beverage){
		this.beverage=beverage;
	}

	@Override
	public double cost() {
		return this.beverage.cost() + COST;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " shot of expresso";
	}

}
