package com.wesleyreisz.samples.patterns.decorator.coffee.condiments;

import com.wesleyreisz.samples.patterns.decorator.coffee.beverages.Beverage;

public class Mocha implements Condiments {

	private Beverage beverage;
	private double COST = .20;
	
	public  Mocha(Beverage beverage){
		this.beverage=beverage;
	}

	@Override
	public double cost() {
		return this.beverage.cost() + COST;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " mocha";
	}

}
