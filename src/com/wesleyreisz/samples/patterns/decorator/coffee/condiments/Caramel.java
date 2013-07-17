package com.wesleyreisz.samples.patterns.decorator.coffee.condiments;

import com.wesleyreisz.samples.patterns.decorator.coffee.beverages.Beverage;

public class Caramel implements Condiments {
	private Beverage beverage;
	private double COST = .75;
	
	public  Caramel(Beverage beverage){
		this.beverage=beverage;
	}

	@Override
	public double cost() {
		return this.beverage.cost() + COST;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " add Caramel Flavor";
	}
}
