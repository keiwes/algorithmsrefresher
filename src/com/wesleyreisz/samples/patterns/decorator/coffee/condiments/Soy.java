package com.wesleyreisz.samples.patterns.decorator.coffee.condiments;

import com.wesleyreisz.samples.patterns.decorator.coffee.beverages.Beverage;

public class Soy implements Condiments {
	private Beverage beverage;
	private double COST = 1.00;
	
	public  Soy(Beverage beverage){
		this.beverage=beverage;
	}

	@Override
	public double cost() {
		return this.beverage.cost() + COST;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " add Cinnamon Flavor";
	}

}
