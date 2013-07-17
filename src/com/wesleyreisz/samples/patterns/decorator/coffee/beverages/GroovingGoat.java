package com.wesleyreisz.samples.patterns.decorator.coffee.beverages;

import com.wesleyreisz.samples.patterns.decoractor.coffee.Size;

public class GroovingGoat implements Beverage{
	private Size size;
	private double COST_TALL = 1.85;
	private double COST_GRANDE = 2.60;
	private double COST_VENTI = 2.75;
	private static final String DESCRIPTION = "Grooving Goat";

	public GroovingGoat(Size size){
		this.size=size;
	}
	
	@Override
	public double cost() {
		if(this.size==Size.TALL){return COST_TALL;}
		else if(this.size==Size.GRANDE){return COST_GRANDE;}
		else if(this.size==Size.VENTI){return COST_VENTI;}
		else {return 0;}
	}

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
